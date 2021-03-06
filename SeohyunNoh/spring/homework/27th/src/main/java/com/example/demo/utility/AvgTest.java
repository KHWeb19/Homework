package com.example.demo.utility;

public class AvgTest {
    // 4. 반 학생이 30명이 있다.
    // 이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
    // 이 상태에서 학생들의 점수를 임의로 배치하고
    // 학급의 평균값을 구해보도록 한다.

    private final int STUDENT = 30;
    private final int SCORE_MAX = 100;
    private final int SCORE_MIN = 60;
    private int range = SCORE_MAX - SCORE_MIN + 1;
    private int score;
    private int scoreArr[];
    private float sum;
   // private static float avg;



    public AvgTest(){
        scoreArr = new int[STUDENT];
        sum = 0;
    }

    public float calcTotalScore(){

        for(int i = 0; i < scoreArr.length ; i++){
            score = (int)(Math.random() * range + SCORE_MIN);

            scoreArr[i] = score;
            sum += scoreArr[i];
        }

       return sum;
    }

    public float calcAvgScore(){
        return sum / STUDENT;
    }
}
