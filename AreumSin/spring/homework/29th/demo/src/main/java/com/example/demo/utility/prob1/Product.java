package com.example.demo.utility.prob1;

import lombok.Getter;

@Getter
public class Product {

    private ProductManager prm;
    private int max;

    public Product(int max) {
        this.max = max;
        prm = new ProductManager(max);
    }

    public void Start(){
        prm.Repetition();
        prm.pickNum();
        prm.todayPrice(prm.getTodayNum());
    }
}
