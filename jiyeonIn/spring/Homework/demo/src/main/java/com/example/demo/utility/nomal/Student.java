package com.example.demo.utility.nomal;

public class Student {
    private final static int STUDENT_NUM =30;
    private final static int MAX_SCORE = 100;
    private final static int MIN_SCORE = 60;
    private int range;
    private float student[];
    private static float score;
    private static float avg;

    //새로고침 할때마다 값이 랜덤으로 바뀜 -> 근데 소숫점이 안나오는 건 계산에서 문제가 있어서 그런걸까요?

    public Student(){
        range = MAX_SCORE-MIN_SCORE+1;
        student = new float[STUDENT_NUM];
    }

    public void eachStudentScore(){
        for(int i=0 ; i<STUDENT_NUM ; i++){
            student[i] = (int) (Math.random()*range +MIN_SCORE);
        }
    }
    public void sumStudentScore(){
        score = 0; //이걸 안하니까 자꾸 기존값 + 새로운 값이 나와서 초기화 시켜줌.
        for(int i=0 ; i<STUDENT_NUM ; i++){
            score += student[i];
        }
    }

    public static float avgStudentScore(){
        avg = score/STUDENT_NUM ;
        return avg;
    }

}
