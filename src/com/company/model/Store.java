package com.company.model;

import com.company.model.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products;

    public Store(List<Product> products) {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }
}
