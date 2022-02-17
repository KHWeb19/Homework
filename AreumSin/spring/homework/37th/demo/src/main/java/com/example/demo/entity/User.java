package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int userNo;
    private String id;
    private String passwd;
    private String name;
    private Date regDate;
}
