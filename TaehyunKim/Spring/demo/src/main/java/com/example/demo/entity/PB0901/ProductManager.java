package com.example.demo.entity.PB0901;

public class ProductManager {

    final int SIZE = 10;
    final int COST = 10000;

    private Product[] pm;

    public ProductManager(int size){
        setProducts(size);
    }

    public void setProducts(int size){
        pm = new Product[size];

        for (int i =0 ; i < size; i++){
            pm[i] = new Product("Product #"+i, COST*(int)((Math.random()*9) +1));
        }

    }

    public Product getTodaysProduct(){
        int random = (int)(Math.random()*pm.length);

        return pm[random];
    }



}
