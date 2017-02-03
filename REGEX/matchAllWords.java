static void matchAllWords(const node *root, const string& regex,
                          Set<string>& matches, const string& workingPrefix) {

  if (root == NULL) return;
  if (regex.empty()) {
    if (root->isWord) {
      matches.add(workingPrefix);
    }
    return; // return regardless of whether the working prefix was a word
 }
 if (regex.size() == 1 || !ispunct(regex[1])) {
    matchAllWords(root->suffixes.get(regex[0]), regex.substr(1),
        matches, workingPrefix + regex[0]);
} else if (regex[1] == '?') {
  matchAllWords(root, regex.substr(2), matches, workingPrefix);
  matchAllWords(root->suffixes.get(regex[0]), regex.substr(2),
        matches, workingPrefix + regex[0]);
} else if (regex[1] == '*') {
  matchAllWords(root, regex.substr(2), matches, workingPrefix);
  matchAllWords(root->suffixes.get(regex[0]), regex,
        matches, workingPrefix + regex[0]);
} else { // assume regex[1] == '+'
  string equivregex = regex;
  equivregex[1] = '*'; // reframe y+ as yy*
  matchAllWords(root->suffixes.get(equivregex[0]), equivregex,
        matches, workingPrefix + equivregex[0]);
  }
}
static void matchAllWords(const node *trie, const string& regex,
        Set<string>& matches) {
  matchAllWords(trie, regex, matches, "");
}
