package com.example.demo.entity.order45;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private int student_no;
    private String student_name;
    private int korean;
    private int english;
    private int math;
    private Date regDate;
    private int avg;

    private int studentTotal;
    private int koreanSum;
    private int englishSum;
    private int mathSum;
    private int totalAvg;

}
