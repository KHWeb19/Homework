package com.example.demo.utility.product;

import lombok.Data;

@Data
public class Product {
    public String productName = "Product";
    private int productPrice;
    private final int PRICE_MAX = 10000;
    private final int PRICE_MIN = 1;
    private final int PRICE_RANGE = PRICE_MAX - PRICE_MIN + 1;

    public int priceRandom(){
        return productPrice = (int)(Math.random() * PRICE_RANGE + PRICE_MIN);
    }

}
