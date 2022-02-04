package com.example.demo.entity.order29.product;

import lombok.Data;

@Data
public class ProductName {
    private String productName;
    private int productRange;
    private int productRandom;

    public ProductName(){
        productRange = Product.MAX-Product.MIN+1;
    }
    public void productRandom() {
        productRandom = (int) (Math.random() * productRange + Product.MIN);
    }

    
    public String checkProductName(){
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
        return productName;
    }

}
