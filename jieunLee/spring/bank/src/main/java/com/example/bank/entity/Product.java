package com.example.bank.entity;

import lombok.Data;

import java.util.*;

@Data
public class Product {
    private Map<Integer, Object[]> pro;
    private Object[] randPro;

    public void putProduct() {
        Object[] product1 = {"자바", 1000};
        Object[] product2 = {"스프링", 500};
        Object[] product3 = {"뷰", 300};
        Object[] product4 = {"파이썬", 200};

        pro = new HashMap<>();
        pro.put(1, product1);
        pro.put(2, product2);
        pro.put(3, product3);
        pro.put(4, product4);
    }

    public void randProduct() {
        final int MIN = 1;
        final int MAX = pro.size();
        int rand = (int)(Math.random()*(MAX-MIN+1)+MIN);
        randPro=pro.get(rand);
    }

}
