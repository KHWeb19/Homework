package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Item {

   /* 상품 등록 0
      상품 삭제
      상품 리스트 0
      상품 수정
      상품 상세보기 */

    //과일 게시판 만들기

    private int itemNo;
    private String title;
    private String content; //상세보기
    private String area;    //어떤 지역 과일?
    private Date regDate;    //등록일자




}
