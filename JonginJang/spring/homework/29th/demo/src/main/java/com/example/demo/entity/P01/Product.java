package com.example.demo.entity.P01;

import lombok.Data;

import static com.example.demo.entity.P01.ProductList.productList;

@Data
public class Product {

    final int MAX = 5;
    final int MIN = 1;
    int range;

    private int selectedNum;

    //!) selectedNum을 static으로 만들면 웹상에 표현되지 않는다 -->  ????

    private String[] selected = new String[2]; // 선택된 품목과 가격을 저장할 배열

    public Product(){
        range = MAX - MIN + 1;
    }

    public void selectProduct(){
        selectedNum = (int)(Math.random()*range);
        selected[0] = productList[selectedNum][0]; // 품목
        selected[1] = productList[selectedNum][1]; // 가격
    }

}
