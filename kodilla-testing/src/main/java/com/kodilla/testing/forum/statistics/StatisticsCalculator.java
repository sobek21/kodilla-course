package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculator {

    double users;
    double posts;
    double comments;

    double averagePostUsers;
    double averageCommentsUsers;
    double averageCommentsPost;

    Statistics statistics;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics=statistics;
    }


    public void calculateAdvStatistics(Statistics statistics){

        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();

        if(posts==0 || users ==0) {
            averagePostUsers = 0;
        }else {averagePostUsers = posts/users;}

        if(comments == 0 || users == 0) {
            averageCommentsUsers =0;
        }else {averageCommentsUsers = comments/users;}
        if(comments == 0 || posts ==0){
            averageCommentsPost=0;
        }else{averageCommentsPost = comments/posts;}



    }
    void showStatistics() {
        System.out.println("Numbers of Users: "+users);
        System.out.println("number of posts: "+posts);
        System.out.println("number of comments: "+comments);
        System.out.println("Average number of posts per user: " + averagePostUsers);
        System.out.println("Average number of comments per user: " + averageCommentsUsers);
        System.out.println("Average number of comments per post: " + averageCommentsPost);
    }
}

