package com.example.demo.entity.order29.product;

import lombok.Getter;

@Getter
public class Price {
    private int priceRange;
    private int priceRandom;

    public Price(){
        priceRange = Product.MAX-Product.MIN;
        priceRandom();
    }

    public void priceRandom(){
        priceRandom = ((int)(Math.random()*priceRange+Product.MIN))*10000;

    }
}
