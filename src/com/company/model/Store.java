package com.company.model;

import com.company.exeptions.ProductEqualsNill;
import com.company.model.products.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Store {
    Map<String,List<Product>> products;

    public Store() {
        this.products = new HashMap<>();
    }

    public void addProduct(String category, Product product) throws ProductEqualsNill
    {
        if(product == null) throw new ProductEqualsNill();
        products.get(category).add(product);
    }

    public void addProducts(Map<String,List<Product>> productsToAdd)
    {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.submit(()-> products.putAll(productsToAdd));
        ex.submit(()-> products.putAll(productsToAdd));
        ex.shutdown();
    }
}
