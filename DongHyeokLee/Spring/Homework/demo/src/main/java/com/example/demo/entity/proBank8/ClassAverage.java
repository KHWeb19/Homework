package com.example.demo.entity.proBank8;

import lombok.Data;

import java.util.Random;

@Data
public class ClassAverage {
    // 반 학생이 30명이 있다.
    // 이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
    // 이 상태에서 학생들의 점수를 임의로 배치하고
    // 학급의 평균값을 구해보도록 한다.

    //점수는 60점이상으로

    private int studentNum;
    private int[] score;
    private Random generator;
    private float sum, avg = 0;


    public ClassAverage(final int studentNum){
        this.studentNum = studentNum;
        score = new int[studentNum];
        generator = new Random();

    }

    public void average(){
        for(int i = 0; i < studentNum; i++){
            //결국 ()값이 range고 뒤에 60이 MIN값이니깐
            //이것도 변수화 시키는게 좋으려나
            score[i] = generator.nextInt(41) + 60;

            sum += score[i];
        }

        avg = sum/studentNum;
    }


}
