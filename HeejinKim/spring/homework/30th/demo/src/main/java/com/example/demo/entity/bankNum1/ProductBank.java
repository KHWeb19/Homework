package com.example.demo.entity.bankNum1;

import lombok.Data;

@Data
public class ProductBank {

    private String name;
    private int price;

    public ProductBank(){


        int randIdx = randomProduct();


        name  = ProductlistBank.productName[randIdx];
        price = ProductlistBank.priceList[randIdx];

    }

    public int randomProduct() {


        int range=ProductlistBank.priceList.length; //5개


        return  (int) (Math.random() * range);
        //0~0.9999 x5  >>> 0~4.9999>>0,1,2,3,4
    }


}
