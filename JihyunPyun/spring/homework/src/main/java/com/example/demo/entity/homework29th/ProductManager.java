package com.example.demo.entity.homework29th;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//data 잊지 말고 넣기....ㅠ
@Data
public class ProductManager  {
    private List<Product> productList = new ArrayList<>();

    // 상품 추가
    public void addProduct() {
        productList.add(new Product("사과", 3000));
        productList.add(new Product("바나나", 3000));
        productList.add(new Product("수박", 1000));
        productList.add(new Product("포도", 5000));
        productList.add(new Product("귤", 2500));
        productList.add(new Product("파인애플", 8000));
    }

    // 랜덤 처리 메소드
    public void randomProduct(){
        Collections.shuffle(productList);
    }
}
