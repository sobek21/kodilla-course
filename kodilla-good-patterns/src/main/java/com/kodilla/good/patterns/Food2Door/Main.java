package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.Distributors.ExtraFoodShop;
import com.kodilla.good.patterns.Food2Door.Distributors.Supplier;

public class Main {
    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        Product product = new Product("Apple21", "Apple", 2, 21.34);

        OrderRequest orderRequest = new OrderRequest(extraFoodShop, product);

        OrderProcess orderProcess = new OrderProcess();
        orderProcess.orderProcess(orderRequest);
    }
}
