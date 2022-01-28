package com.example.demo.utility.school;

import lombok.Getter;

@Getter
public class SchoolClass extends Student{
    private float classMean;

    private int studentNum;
    private int[] studentArr;


    public SchoolClass(int studentNum, int minScore){
        studentArr = new int[studentNum];

        for(int i = 0; i < studentNum; i++){
            studentArr[i] = new Student(minScore);
        }
        this.studentNum = studentNum;
    }

    public void doExam(){
        for(int i = 0; i < studentNum; i++){
            studentArr[i].doEnglishExam();
        }
    }
}
