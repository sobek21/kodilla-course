package com.kodilla.good.patterns.Food2Door;

public class Product {

    String ProductId;
    String productName;
    int productQuantity;
    double productPrice;

    public Product(String productId, String productName, int productQuantity, double productPrice) {
        ProductId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return ProductId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
