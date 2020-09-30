package com.company.service;

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
        try{
            //search; if no such throw RuntimeException
        }catch (RuntimeException e)
        {
            e.toString();
        }
    }
}
