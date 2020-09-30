package com.company.exeptions;

class ProductNotFoundException extends RuntimeException {
    @Override
    public String toString()
    {
        return "no products to such requirements";
    }
}
