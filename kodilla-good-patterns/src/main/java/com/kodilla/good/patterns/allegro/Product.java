package com.kodilla.good.patterns.allegro;

public class Product {

    String product;
    int quanity;
    double price;

    public Product(String product, int quanity, double price) {
        this.product=product;
        this.price=price;
        this.quanity=quanity;
    }
    public String getProduct() {
        return product;
    }
    public int getQuanity() {
        return quanity;
    }
    public double getPrice() {
        return price;
    }
}
