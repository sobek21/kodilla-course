package com.kodilla.good.patterns.allegro;

public class OrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderService orderService;

    public OrderProcessor(InformationService informationService, ProductOrderService productOrderService, OrderService orderService) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderService = orderService;
    }
    public BuyDto process(final BuyRequest buyRequest){
        boolean isBuy = productOrderService.sell(buyRequest);

        if(isBuy) {
            informationService.information(buyRequest);
            orderService.createOrder(buyRequest);
            return new BuyDto(buyRequest.getUser(),true);
        } else
            return new BuyDto(buyRequest.getUser(),false);
    }
}
