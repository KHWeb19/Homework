package com.example.demo.entity.probank10;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private int boardNo;
    private String prodName;
    private int prodPrice;
    private Date regDate;
}
