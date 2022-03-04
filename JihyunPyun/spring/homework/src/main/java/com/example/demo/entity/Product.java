package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private int board_no;
    private String name;
    private String writer;
    private String description;
    private int price;
    private Date regDate;
}
