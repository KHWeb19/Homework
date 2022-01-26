package com.example.demo.utillity;

import lombok.Data;

@Data
public class Score {
    private final int MAX = 100;
    private final int MIN = 60;
    private int range = MAX - MIN +1;
    private final int MEMBER = 30;

    int[] score = new int[MEMBER];
    int sum = 0;
    float avg = 0.0f;
    public void addScore(){
        for(int i = 0; i < MEMBER; i++){
            score[i] = (int)(Math.random()* range +MIN);
        }
        avgScore();
    }

    public void avgScore(){
        for(int i = 0; i< MEMBER; i++){
            sum += score[i];
        }
        System.out.println(sum);
        avg = (float) sum/MEMBER;
    }


}
