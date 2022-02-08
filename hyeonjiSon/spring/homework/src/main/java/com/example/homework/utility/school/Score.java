package com.example.homework.utility.school;

import lombok.Getter;

@Getter
public class Score {

    //성적표에서 하는 일
    //1.학생 수만큼 배열을 만든다.
    //2. 배열 주소값마다 점수를 지정해준다.
         // 각 학생의 점수는 Student 클래스에서 구한다.
    //3. 점수

    private int studNum;
    private float average; //평균값

    private final int MAXSCORE = 100;
    private final int MINSCORE = 60;
    private final int range = MAXSCORE - MINSCORE + 1;

    private Student[] studArr;

    public Score(int studNum, int minscore){
        studArr = new Student[studNum];

        for(int i = 0; i < studNum; i++){
            studArr[i] = new Student(minscore);
        }
        this.studNum = studNum;
    }

    //학생수 만큼 배열을 만들고 배열에 랜덤값을 주는 메서드
    public void doEnglishExam(){
        for(int i = 0; i < studNum; i++){
            studArr[i].doEnglishExam();
        }

    }

    //랜덤값을 모두 더하고 학생 수만큼 나눠주는 메서드
    public void getScore(){
        float sum = 0;

        for(int i = 0; i < studNum; i++){
            sum += studArr[i].getEngScore();
        }
        average = sum / studNum;
    }
}
