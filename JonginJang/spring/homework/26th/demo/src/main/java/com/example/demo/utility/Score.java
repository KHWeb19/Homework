package com.example.demo.utility;

public class Score {
    /*  반 학생이 30명이 있다.
            이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
            이 상태에서 학생들의 점수를 임의로 배치하고
            학급의 평균값을 구해보도록 한다.
    */
    final int STUDENT_NUM = 30;
    final int MAX = 100;
    final int MIN = 60;
    private int range;
    private int sum;
    int[] score = new int[STUDENT_NUM];
    private float avgScore;

    public Score(){
        range = MAX - MIN + 1;
        sum = 0;
        avgScore = 0.0f;
    }

    public float calcAverage(){
        for (int i = 0; i < STUDENT_NUM; i++) {
            score[i] = (int) (Math.random() * range + MIN);
            sum += score[i];
            System.out.printf("score[%d] = %d\n", i, score[i]);
        }
        avgScore = (float)(sum) / STUDENT_NUM;
        return avgScore;

    }

}
