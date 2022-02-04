package com.example.demo.utility.School;

import lombok.Data;

@Data
public class Student{
    private final int MAX_SCORE = 100;
    private int minScore;
    private int range;

    public Student(int minScore){
        this.minScore = minScore;
        range = MAX_SCORE-minScore+1;
    }

    public float StudentScore(){
        return (int) (Math.random()*range +minScore);
    }

}
