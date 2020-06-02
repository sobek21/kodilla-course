package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.Distributors.Supplier;

public class OrderDto {
    public Supplier supplier;
    public boolean isOrdered;

    public OrderDto(Supplier supplier, boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
