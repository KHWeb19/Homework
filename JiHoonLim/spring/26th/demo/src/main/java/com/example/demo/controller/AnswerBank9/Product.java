package com.example.demo.controller.AnswerBank9;

import lombok.Data;

@Data
public class Product {

    // 이름 , 가격
    private String name;
    private int price;

    // 갯수는 배열의 길이
    //private final int MAX = ProductList.priceList.length;


    // 랜덤 인덱스 생성 -> 이름과 가격에 해당인덱스 생성
    public Product() {
        int randIdx = takeRandom();

        name = ProductList.productName[randIdx];
        price = ProductList.priceList[randIdx];
    }

    //랜덤 인덱스 생성
    public int takeRandom () {
        // final로 선언시 Max도 출력되기때문에 limit처럼 생성
        int limit = ProductList.priceList.length;
        return (int) (Math.random() * limit);
    }

}
