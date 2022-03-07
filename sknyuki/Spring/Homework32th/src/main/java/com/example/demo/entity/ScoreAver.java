package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ScoreAver {
    private int scoreNo;
    private String Score;
    private String writer;
    private Date regDate;
}
