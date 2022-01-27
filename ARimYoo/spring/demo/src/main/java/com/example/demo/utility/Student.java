package com.example.demo.utility;

public class Student {

    final int MAX = 100;
    final int MIN = 0;
    final int range = MAX - MIN + 1;

    int [] studentScore ;
    int studentNum;
    int sum;
    float avg;


    public Student (final int studentNum){

        this.studentNum = studentNum;
        sum = 0;

    }

    public int getStudentNum(){
        return studentNum;
    }

    public void allocScore (){
        studentScore = new int [studentNum];

        for (int i = 0; i < studentNum; i++){

            studentScore[i] = (int)(Math.random() * range + MIN);
            System.out.println(studentScore[i]);

            sum += studentScore[i];
        }

        System.out.println("점수의 합 : " + sum);
    }

    public float getAverage (){
        avg = (float)sum / studentNum;
        return avg;
    }
}
