package com.kodilla.good.patterns.allegro;

public class InformationService {

    public boolean information(BuyRequest buyRequest) {
        System.out.println("Orderd for: " + buyRequest.getUser().getUserName() + " Product:" +
                buyRequest.getProduct().getProduct() + " Quanity:" + buyRequest.getProduct().getQuanity()
                + " Total price:" + buyRequest.getProduct().getPrice() * buyRequest.getProduct().getQuanity()
                +" (Information for Client) ");

        return true;
    }
}
