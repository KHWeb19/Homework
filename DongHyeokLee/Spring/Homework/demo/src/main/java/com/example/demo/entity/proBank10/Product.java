package com.example.demo.entity.proBank10;


import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private int boardNo;
    private String productName;
    private String viewDetails;
    private String registrant;
    private Date regDate;
}
