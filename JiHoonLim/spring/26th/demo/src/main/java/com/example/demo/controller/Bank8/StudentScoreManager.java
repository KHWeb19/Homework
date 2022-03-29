package com.example.demo.controller.Bank8;

public class StudentScoreManager {
    private final int STUDENT_NUM = 30;

    private final int SCORE_MAX = 100;
    private final int SCORE_MIN = 60;
    private int range;
    private int sum, avg;

    private int [] score;

    public StudentScoreManager(){
        range = SCORE_MAX - SCORE_MIN + 1;
        score = new int[STUDENT_NUM];
        sum = 0;
        avg = 0;
    }

    public void CreateScore(){
        for (int i = 0; i < STUDENT_NUM; i ++) {
            score[i] = (int)(Math.random() * range + SCORE_MIN);
            sum += score[i];
        }
    }

    public int ScoreAvg(){
        avg = sum / STUDENT_NUM;
        return avg;
    }

    public void calcStart(){
        CreateScore();
    }
}
