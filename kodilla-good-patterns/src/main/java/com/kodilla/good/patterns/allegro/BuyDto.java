package com.kodilla.good.patterns.allegro;

public class BuyDto {

    public User user;
    public boolean isBuy;

    public BuyDto (User user, boolean isBuy){
        this.user=user;
        this.isBuy=isBuy;
    }
    public User getUser() {
        return user;
    }
    public boolean isBuy() {
        return isBuy;
    }
}
