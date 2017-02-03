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
