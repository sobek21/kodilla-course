package com.kodilla.good.patterns.Food2Door.Distributors;

import com.kodilla.good.patterns.Food2Door.OrderRequest;

public class GlutenFreeShop implements Supplier {
    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("The order is carried out by:"+"'"+ orderRequest.getSupplier().getSupplierName()
                +"'"+" Total order value:"+ orderRequest.getProduct().getProductQuantity()*orderRequest.getProduct().getProductPrice());
        return true;
    }

    @Override
    public String getSupplierName() {
        return "GlutenFreeShop";
    }
}
