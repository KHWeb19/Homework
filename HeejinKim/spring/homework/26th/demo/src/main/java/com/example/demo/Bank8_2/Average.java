package com.example.demo.Bank8_2;

import lombok.Data;


@Data
public class Average {
  /* 반 학생이 30명이 있다.
     이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
     이 상태에서 학생들의 점수를 임의로 배치하고
     학급의 평균값을 구해보도록 한다.*/

    final int MIN = 60;
    final int MAX = 100;
    final int STUDENT_NUM = 30;

    private int range;
    private int average;
    private int score;
    private int sum;
    private int [] stuArr; //  배열로 넣자

    public Average(){

        sum = 0;          //이것을 해줘야 계속 값이 안더해짐
        range=MAX-MIN+1;
        stuArr=new int [STUDENT_NUM];

    }

    public void studentScore() {

        for (int i = 0; i < STUDENT_NUM; i++) {
            score = (int) (Math.random() * range + MIN);
            stuArr[i]=score;
        }
    }

    public void sumStudent() {

        for (int i = 0; i < STUDENT_NUM; i++) {

            sum+=stuArr[i];
        }

        average=sum/STUDENT_NUM;
    }

  // public static int getAverage(){
  //      studentScore();
  //      return sum/STUDENT_NUM;
  //  }



}
