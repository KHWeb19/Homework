package com.example.demo.utility.utility27th.scoreCalc;

/* 4. 반 학생이 30명이 있다.
        이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        이 상태에서 학생들의 점수를 임의로 배치하고
        학급의 평균값을 구해보도록 한다.
 */

public class Exam {

    private int studentNum;
    Subject subject = new Subject();
    private Student[] studentArr;
    private int minScore;
    private int maxScore;
    private int scoreRange;
    private float[] sum = new float[subject.SUBJECTCOUNT];
    private float[] average = new float[subject.SUBJECTCOUNT];
    private float[] var = new float[subject.SUBJECTCOUNT];

    public Exam(int studentNum, int minScore, int maxScore){
        this.studentNum = studentNum;
        this.minScore = minScore;
        this.maxScore = maxScore;
        scoreRange = maxScore - minScore + 1;

        studentArr = new Student[studentNum];
        for(int i = 0; i < studentNum; i++){
            studentArr[i] = new Student();
        }
    }

    public void examStart(){
        for(int i = 0; i < studentNum; i++) {
            for (int j = 0; j < subject.SUBJECTCOUNT; j++) {
                studentArr[i].examScore[j] = (int) (Math.random() * scoreRange + minScore);
            }
        }
    }

    public void calcScore(){
        calcMean();
    }

    public float getAverage(int subjectNum) {
        return average[subjectNum];
    }

    public void initCalc(){
        for(int i = 0; i < subject.SUBJECTCOUNT; i++) {
            sum[i] = 0;
            average[i] = 0;
        }
    }

    public void calcMean() {
        initCalc();
        for (int i = 0; i < subject.SUBJECTCOUNT; i++) {
            for (int j = 0; j < studentNum; j++) {
                sum[i] += studentArr[j].examScore[i];
            }
            average[i] = sum[i] / studentNum;
        }
    }
}
