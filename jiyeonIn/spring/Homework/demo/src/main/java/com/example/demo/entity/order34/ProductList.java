package com.example.demo.entity.order34;

import lombok.Data;

import java.util.Date;

@Data
public class ProductList {
    private int board_no;
    private String product_name;
    private String content;
    private int price;
    private String writer;
    private Date reg_date;
}
