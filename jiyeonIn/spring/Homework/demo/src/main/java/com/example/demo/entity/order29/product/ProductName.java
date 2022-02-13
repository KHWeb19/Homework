package com.example.demo.entity.order29.product;

import lombok.Getter;

@Getter
public class ProductName {
    private String productName;
    private int productRandom;

    public ProductName(){
        productRandom();
        checkProductName();
    }
    public void productRandom() {
        int productRange = Product.MAX-Product.MIN+1;
        productRandom = (int) (Math.random() * productRange + Product.MIN);
    }

    
    public void checkProductName(){
        productRandom();
        switch (productRandom){
            case 1 :
                productName = "사과";
                break;
            case 2 :
                productName = "배";
                break;
            case 3:
                productName = "곶감";
                break;
            case 4 :
                productName = "포도";
                break;
            case 5 :
                productName = "귤";
                break;
        }
    }

}
