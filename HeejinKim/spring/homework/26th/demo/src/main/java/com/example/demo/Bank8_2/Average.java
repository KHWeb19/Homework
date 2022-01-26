package com.example.demo.Bank8_2;

public class Average {
  /* 반 학생이 30명이 있다.
     이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
     이 상태에서 학생들의 점수를 임의로 배치하고
     학급의 평균값을 구해보도록 한다.*/

    static final int MIN=60;
    static final int MAX=100;
    static final int STUDENT_NUM=30;

    private static int range;
    private static int average;
    private static int score;
    private static int sum;

    public Average(){

        range=MAX-MIN+1;

    }
    public static int studentScore() {

        for (int i = 0; i < STUDENT_NUM; i++) {
            score = (int) (Math.random() * range + MIN);
            sum += score;
        }
        return sum;
    }

    public static int getAverage(){
        studentScore();
        return sum/STUDENT_NUM;
    }



}
