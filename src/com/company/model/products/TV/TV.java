package com.company.model.products.TV;

import com.company.model.products.Product;

public class TV extends Product {
    int diagonal;
    ResolutionType resolutionType;
    MatrixType matrixType;

    public TV(String vendor, String model, int price, int diagonal, ResolutionType resolutionType, MatrixType matrixType) {
        super(vendor, model, price);
        this.diagonal = diagonal;
        this.resolutionType = resolutionType;
        this.matrixType = matrixType;
    }
}
