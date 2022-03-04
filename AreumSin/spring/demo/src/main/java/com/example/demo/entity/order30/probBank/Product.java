package com.example.demo.entity.order30.probBank;

import lombok.Data;

@Data
public class Product {

    private String name;
    private int price;

    public Product () {
        int randIdx = takeRandom();
        name = ProductList.productName[randIdx];
        price = ProductList.priceList[randIdx];
    }

    public int takeRandom () {
        int limit = ProductList.priceList.length;
        return (int) (Math.random() * limit);
    }
}