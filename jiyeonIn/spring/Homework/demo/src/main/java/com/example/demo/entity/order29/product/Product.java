package com.example.demo.entity.order29.product;

import lombok.Data;

@Data
public class Product {
    public final static int MAX = 5;
    public final static int MIN = 1;
    private Price price;
    private ProductName productName;
    private int productPrice;
    private String proName;


    public Product(){
        price = new Price();
        productName = new ProductName();
    }


    public Integer showPrice(){
        return productPrice = price.priceRandom();
    }

    public String showName(){
        return proName = productName.checkProductName();
    }
}