package com.example.demo.entity.order33;

import lombok.Data;

import java.util.Date;

@Data
public class Item {
    private int itemId;
    private String name;
    private int price;
    private int quantity;
    private Date regDate;

}
