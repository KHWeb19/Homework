package com.example.demo.entity.order29.product;

public class Price {
    private int priceRange;
    private int priceRandom;

    public Price(){
        priceRange = Product.MAX-Product.MIN+1;
    }

    public int priceRandom(){
        priceRandom =   ((int)(Math.random()*priceRange+Product.MIN))*10000;
        return priceRandom;
    }
}
