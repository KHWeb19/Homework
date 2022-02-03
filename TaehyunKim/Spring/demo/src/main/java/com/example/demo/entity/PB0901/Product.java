package com.example.demo.entity.PB0901;

import lombok.Data;

@Data
public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

}
