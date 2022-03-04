package com.example.demo.entity.Bank10;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private int boardNo;
    private String name;
    private String content;
    private String detail;
    private int price;
    private Date regDate;
}
