package com.company.service.interfaces;

import com.company.model.products.Product;

public interface StoreServiceInterface {
    void sort(String vendor);
    void sort(int price);
    void search(String string);
    void add(Product product);
}
