package com.example.demo.utility;

import lombok.Data;

@Data
public class Student {
    private int studentNum;
    private int[] studentArr;

    private final int SCORE_MAX = 100, SCORE_MIN = 60;
    private int range = SCORE_MAX - SCORE_MIN - 1;
    private int sum = 0;
    private float avg;

    public Student(int studentNum) {
        this.studentNum = studentNum;
        studentArr = new int[studentNum];
    }

    public void score(){
        for(int i = 0; i < studentNum; i++){
            studentArr[i] = (int)(Math.random() * range + SCORE_MIN);
            sum += studentArr[i];
        }
    }

    public void calcAverage(){
        avg = (float) sum / studentNum;
    }
}
