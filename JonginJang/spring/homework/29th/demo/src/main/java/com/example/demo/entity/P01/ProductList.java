package com.example.demo.entity.P01;

import lombok.Data;

@Data
public class ProductList {
    public static String[][] productList = {{"사과","1000원"},{"귤","1100원"},{"딸기","1500원"},{"포도","1600원"},{"복숭아","900원"}};
    //각 상품의 품목과 가격이 들어가는 2차원 문자열 배열, {}: 각 행
}
