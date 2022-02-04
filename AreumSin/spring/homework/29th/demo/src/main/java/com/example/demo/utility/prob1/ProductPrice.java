package com.example.demo.utility.prob1;

public class ProductPrice {
    private int productPrice;
    private final int MAX = 100000; // 최대 10만원
    private final int MIN = 10000;

    private int range;

    public ProductPrice(){
        // 랜덤으로 가격을 모든 제품에 부여한다.
        range = MAX - MIN +1;
    }

    public int calcPrice(){
        productPrice = (int)(Math.random()*range+MIN);
        return productPrice;
    }
}
