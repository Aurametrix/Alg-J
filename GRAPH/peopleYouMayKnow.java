static Set<user *> getFriendsOfFriends(user *loggedinuser) {
  Set<user *> peopleYouMayKnow;
  Set<user *> peopleYouAlreadyKnow = loggedinuser->friends;
  peopleYouAlreadyKnow += loggedinuser;
  foreach (user *fr in loggedinuser->friends) {
    foreach (user *friendOfFriend in fr->friends) {
      if (!peopleYouAlreadyKnow.contains(friendOfFriend)) {
        peopleYouMayKnow += friendOfFriend;
      }
    }
  }
  return peopleYouMayKnow;
}

static bool isReachable(Node *node,
                    Set<Node *>& activelyBeingVisited,
                    Set<Node *>& previouslyVisited) {
  if (activelyBeingVisited.contains(node)) return true;
  if (previouslyVisited.contains(node)) return false;
  activelyBeingVisited += node;
  foreach (Arc *arc in node->arcs) {
    if (isReachable(arc->finish, activelyBeingVisited, previouslyVisited))
    {
      return true;
    }
}
   activelyBeingVisited -= node;
  previouslyVisited += node;
  return false;
}
static bool containsCycle(SimpleGraph& graph) {
  Set<Node *> previouslyVisited;
  Set<Node *> toBeVisited = graph.nodes;
  while (!toBeVisited.isEmpty()) {
    Node *front = toBeVisited.first();
    Set<Node *> activelyBeingVisited;
    if (isReachable(front, activelyBeingVisited, previouslyVisited)) {
      return true;
    }
    toBeVisited -= previouslyVisited;
  }
  return false;
}  
