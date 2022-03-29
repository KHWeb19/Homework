package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private int productNo;
    private String title;
    private String description;
    private int price;
    private String writer;
    private Date regDate;
}
