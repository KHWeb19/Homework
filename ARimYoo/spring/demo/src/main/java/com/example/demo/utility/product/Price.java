package com.example.demo.utility.product;

public class Price {

    private final int MAX = 50000;
    private final int MIN = 5000;
    private int range;

    private int price;

    public Price () {
        range = MAX - MIN + 1;
    }

    public void RandPrice () {

        price = (int)(Math.random() * range + MIN);
    }
}
