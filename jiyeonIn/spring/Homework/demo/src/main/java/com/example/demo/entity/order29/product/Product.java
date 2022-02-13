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

        showPriceAndName();
    }
    public void showPriceAndName(){
        productPrice = price.getPriceRandom();
        proName = productName.getProductName();
    }


    public void showPrice(){
        productPrice = price.getPriceRandom();
    }

    public void showName(){
        proName = productName.getProductName();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productPrice=" + productPrice +
                ", proName='" + proName + '\'' +
                '}';
    }
}