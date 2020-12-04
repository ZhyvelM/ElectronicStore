package com.company.service;

import com.company.exeptions.ProductEqualsNill;
import com.company.model.products.Product;
import com.company.service.interfaces.StoreServiceInterface;

public class StoreService implements StoreServiceInterface {
    @Override
    public void sort(String vendor) {

    }

    @Override
    public void sort(int price) {

    }

    @Override
    public void search(String string) {
        //
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
