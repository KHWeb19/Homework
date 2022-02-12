package com.example.homework.entity.order10th;

import lombok.Data;

@Data
public class Market {
    //게시판에서 표시되어야 하는 것

    private int productNo; //상품 번호
    private String title; //상품명
    private String content; //본문(상세보기)
    private String seller; //판매자
}
