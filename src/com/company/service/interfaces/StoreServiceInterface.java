package com.company.service.interfaces;

import com.company.model.products.Product;

import java.util.List;

public interface StoreServiceInterface {
    void sort(String vendor);
    void sort(int price);
    List<Product> search(String string);
    void add(Product product);
}
