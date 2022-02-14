package com.example.demo.entity.probank9;

import java.io.PipedReader;

public class Product {
    /*
        1. Product 클래스를 만들어보자
        Random을 활용하여 임의의 상품과 가격들이 들어갈 수 있도록 만들도록 한다.
        오늘 학습한 Get 을 활용하여 사용자가 URL을 요청한다.
        오늘의 추천 상품을 누르면 POST쪽에서 알아서 상품이 들어가도록 만들고
        추천된 상품의 결과를 JSON Viewer를 통해서 화면상에 출력하도록 만들어보자!
     */

    private int price;
    private int product;
    private int productArr[];

    private final int PRICE_MAX = 5000;
    private final int PRICE_MIN = 1000;
    private int range = PRICE_MAX - PRICE_MIN + 1;
    private int randomPrice;

    public Product(){

    }

}
