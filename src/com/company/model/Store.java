package com.company.model;

import com.company.model.products.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    Map<String,List<Product>> products;

    public Store(Map<String,List<Product>> products) {
        this.products = products;
    }

    public void addProduct(String category, Product product)
    {
        products.get(category).add(product);
    }
}
