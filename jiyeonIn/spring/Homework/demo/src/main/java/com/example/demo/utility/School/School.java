package com.example.demo.utility.School;

import lombok.Data;

@Data
public class School{
    private int student_num;
    private Student[] students;
    private float sum;
    private float avg;

    public School(int student_num, int minScore){
        this.student_num = student_num;
        students = new Student[student_num];

        for(int i=0;i<student_num;i++){
            students[i] = new Student(minScore);
        }
    }


    public void checkStudentScore(){
        for(int i=0 ; i<student_num ; i++){
            students[i].StudentScore();
        }
    }

    public void sumStudentScore(){
        sum = 0;
        for(int i=0 ; i<student_num ; i++){
            sum += students[i].StudentScore();

        }
    }
    public void avgStudentScore(){
            avg = sum/student_num;
    }
}
