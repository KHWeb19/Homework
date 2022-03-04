package com.example.demo.utillity;

public class M2Class {
    final int MAX=100;
    final int MIN=60;
    final int range=MAX-MIN+1;

    int studentNum;
    int sum;
    private double averageScore;
    int[] studentScore;

    public M2Class(int studentNum){
        this.studentNum=studentNum;
    }

    public double getstudendAver(){
        studentScore=new int[studentNum];
        sum=0;
        for(int i=0; i<studentScore.length; i++){
            studentScore[i]=(int)(Math.random()*range+MIN);
            sum+=studentScore[i];
        }
        //System.out.println(sum);
        averageScore=sum/studentNum;
        return averageScore;
    }
}
