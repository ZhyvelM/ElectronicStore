package com.company.model.products.fridge;

import com.company.model.products.Product;

public class Fridge extends Product {
    int height;
    int width;
    int weight;
    int numberOfShelves;
    int volume;
    String color;
    EnergyClass energyClass;

    public Fridge(String vendor, String model, int price, int height, int width, int weight, int numberOfShelves, int volume, String color, EnergyClass energyClass) {
        super(vendor, model, price);
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.numberOfShelves = numberOfShelves;
        this.volume = volume;
        this.color = color;
        this.energyClass = energyClass;
    }
}
