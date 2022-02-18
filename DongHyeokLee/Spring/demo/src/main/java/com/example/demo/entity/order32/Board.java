package com.example.demo.entity.order32;

import lombok.Data;

import java.util.Date;

@Data
public class Board {

    private int boardNo;
    private String writer;
    private String title;
    private String content;
    private Date regDate;
}
