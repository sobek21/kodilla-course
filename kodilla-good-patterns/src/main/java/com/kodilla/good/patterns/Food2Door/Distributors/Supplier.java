package com.kodilla.good.patterns.Food2Door.Distributors;

import com.kodilla.good.patterns.Food2Door.OrderRequest;

public interface Supplier {

    boolean process(OrderRequest orderRequest);
    String getSupplierName();

}
