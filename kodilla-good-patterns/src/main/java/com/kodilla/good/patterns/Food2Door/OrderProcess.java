package com.kodilla.good.patterns.Food2Door;

public class OrderProcess {

    public OrderDto orderProcess(OrderRequest orderRequest) {
        boolean isOrdered = orderRequest.getSupplier().process(orderRequest);
        if(isOrdered){
            System.out.println("Order processed");
            return new OrderDto(orderRequest.getSupplier(),true);
        }else{
            System.out.println("order not processed");
            return new OrderDto(orderRequest.getSupplier(),false);
        }
    }
}
