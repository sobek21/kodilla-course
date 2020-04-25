package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

   private final List<ForumUser> theUserNameList = new ArrayList<>();

   public Forum () {
    theUserNameList.add(new ForumUser(1,"Marcin",'M',1996,11,7,22));
    theUserNameList.add(new ForumUser(2,"Ada",'F',1996,11,7,222));
    theUserNameList.add(new ForumUser(3,"Ewa",'F',1996,11,7,4));
    theUserNameList.add(new ForumUser(4,"Aga",'F',2015,11,7,1));
    theUserNameList.add(new ForumUser(5,"Ewa",'F',1996,11,7,22));
    theUserNameList.add(new ForumUser(6,"Mariusz",'M',2011,11,7,3));
    theUserNameList.add(new ForumUser(7,"Jacek",'M',1992,11,7,221));
    theUserNameList.add(new ForumUser(8,"Andrzej",'M',1992,11,7,1));

    }
    public List<ForumUser> getTheUserNameList() {
        return new ArrayList<>(theUserNameList);
    }
}
