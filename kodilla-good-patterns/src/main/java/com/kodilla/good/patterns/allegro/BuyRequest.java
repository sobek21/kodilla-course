package com.kodilla.good.patterns.allegro;

public class BuyRequest {
    public User user;
    public Product product;

    public BuyRequest(User user, Product product){
        this.user=user;
        this.product=product;
    }
    public User getUser() {
        return user;
    }
    public Product getProduct() {
        return product;
    }
}
