package com.example.demo.entity.order32;

import lombok.Data;

import java.util.Date;

@Data
public class Member {
    private int memberNo;
    private String Profile;
    private String content;
    private String writer;
    private Date regDate;
}
