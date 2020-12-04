package com.company.model.products;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                Objects.equals(Vendor, product.Vendor) &&
                Objects.equals(model, product.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Vendor, model, price);
    }

    @Override
    public String toString()
    {
        return Vendor + " " + model;
    }
}
