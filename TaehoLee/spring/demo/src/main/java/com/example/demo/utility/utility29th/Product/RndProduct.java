package com.example.demo.utility.utility29th.Product;

import lombok.Data;

@Data
public class RndProduct {
    private String name;
    private int price;

    public RndProduct(){
        int rndProductIdx = (int)(Math.random() * (Product.productName.length));
        int rndPrice = (int)((Math.random() * 100) + 1) * 100;

        name = Product.productName[rndProductIdx];
        price = rndPrice;
    }

}
