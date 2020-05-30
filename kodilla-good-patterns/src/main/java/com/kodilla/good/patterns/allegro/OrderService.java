package com.kodilla.good.patterns.allegro;

public class OrderService {

    public boolean createOrder(BuyRequest buyRequest) {
        System.out.println("Orderd for: " + buyRequest.getUser().getUserName() + " Product:" +
                buyRequest.getProduct().getProduct() + " Quanity:" + buyRequest.getProduct().getQuanity()
                + " Total price:" + buyRequest.getProduct().getPrice() * buyRequest.getProduct().getQuanity()
        +" (OrderCreate) ");
        return true;
    }
}
