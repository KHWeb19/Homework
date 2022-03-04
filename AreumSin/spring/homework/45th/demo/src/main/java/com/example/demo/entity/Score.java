package com.example.demo.entity;

import lombok.Data;

@Data
public class Score {
    private int studentNo;
    private String name;
    private int korean;
    private int math;
    private int english;
    private double scoreAvg;


    private double classAvg;
    private double koreanAvg;
    private double mathAvg;
    private double englishAvg;
}
