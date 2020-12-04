package com.company.service;

import com.company.exeptions.ProductEqualsNill;
import com.company.model.Store;
import com.company.model.products.Product;
import com.company.service.interfaces.StoreServiceInterface;

import java.util.List;
import java.util.stream.Collectors;

public class StoreService implements StoreServiceInterface {
    Store store;

    @Override
    public void sort(String vendor) {

    }

    @Override
    public void sort(int price) {

    }

    @Override
    public List<Product> search(String name) {
        return store.products.values().stream()
                .flatMap(List::stream)
                .filter(o -> name.equals(o.toString()))
                .collect(Collectors.toList());
    }

    @Override
    public void add(Product product) {
        try {
            //Store.add(product);
        }catch (ProductEqualsNill e)
        {

        }
    }


}
