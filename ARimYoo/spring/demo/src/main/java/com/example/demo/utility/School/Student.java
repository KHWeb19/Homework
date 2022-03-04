package com.example.demo.utility.School;

import lombok.Data;

@Data
public class Student {


    // private를 꼭 붙이자 !!!
    // static도 다른 클래스끼리 공유되는 사항이 있을 때에만 붙이기
    private final int MAX = 100;
    private final int MIN = 60;
    private final int range = MAX - MIN + 1;

    private int [] studentScore ;
    private int studentNum;
    private int sum;
    private float avg;


    public Student (final int studentNum){

        this.studentNum = studentNum;
        sum = 0;

    }

    public void allocScore (){
        studentScore = new int [studentNum];

        for (int i = 0; i < studentNum; i++){

            studentScore[i] = (int)(Math.random() * range + MIN);
            System.out.println(studentScore[i]);

            sum += studentScore[i];
        }

    }

    public float getAverage (){
        avg = (float)sum / studentNum;
        return avg;
    }
}
