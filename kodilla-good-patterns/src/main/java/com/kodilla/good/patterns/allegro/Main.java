package com.kodilla.good.patterns.allegro;

public class Main {

    public static void main(String[] args) {

        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retriever();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new ProductOrderService()
                ,new OrderService());
        orderProcessor.process(buyRequest);
    }
}
