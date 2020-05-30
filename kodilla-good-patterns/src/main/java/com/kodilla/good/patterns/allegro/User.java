package com.kodilla.good.patterns.allegro;

public class User {

    String userName;
    String realName;

    public User(String userName, String realName) {
        this.userName=userName;
        this.realName=realName;
    }
    public String getUserName() {
        return userName;
    }
    public String getRealName() {
        return realName;
    }
}
