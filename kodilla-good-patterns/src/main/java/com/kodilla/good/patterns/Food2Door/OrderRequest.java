package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.Distributors.Supplier;

public class OrderRequest {
    private Supplier supplier;
    private Product product;

    public OrderRequest(Supplier supplier, Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}
