package com.company.model.products.microwave;

import com.company.model.products.Product;

public class Microwave extends Product {
    int volume;
    int power;
    int height;
    int width;

    public Microwave(String vendor, String model, int price, int volume, int power, int height, int width) {
        super(vendor, model, price);
        this.volume = volume;
        this.power = power;
        this.height = height;
        this.width = width;
    }
}
