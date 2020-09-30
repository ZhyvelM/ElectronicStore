package com.company.model.products;

public abstract class Product {
    String Vendor;
    String model;
    int price;

    public Product(String vendor, String model, int price) {
        Vendor = vendor;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return Vendor + " " + model;
    }
}
