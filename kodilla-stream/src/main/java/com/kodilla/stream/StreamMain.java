package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> newMap = theForum.getTheUserNameList().stream().
                filter(s -> s.getSex() == 'M').
                filter(s -> s.getBirth().getYear() < (2020 - 20)).
                filter(s -> s.getPosts() > 1).
                collect(Collectors.toMap(ForumUser::getId, ForumUser -> ForumUser));

        newMap.entrySet().stream().map(entry -> entry.getKey() + ":" + entry.getValue()).
                forEach(System.out::println);
        
    }

}
class Test {
    public static void main(String[] args) {
        List<Integer> names = Arrays.asList(2,4,6,8);

        final IntSummaryStatistics intSummaryStatistics = names.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println(intSummaryStatistics);


    }

}


