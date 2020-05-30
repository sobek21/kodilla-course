package com.kodilla.good.patterns.allegro;

public class BuyRequestRetriever {

    public BuyRequest retriever() {

        User user = new User("janeczko21", "Janek");
        Product product = new Product("Takenoko", 3, 22.75);

        return new BuyRequest(user,product);
    }
}
