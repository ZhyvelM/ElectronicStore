package com.company.exeptions;

public class ProductEqualsNill extends RuntimeException {
    @Override
    public String toString()
    {
        return "no products to such requirements";
    }
}
