package com.example.demo.utility.utility27th;


/* 4. 반 학생이 30명이 있다.
        이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        이 상태에서 학생들의 점수를 임의로 배치하고
        학급의 평균값을 구해보도록 한다.
 */
public class StudentScore implements Runnable{
    private int studentCount;
    private float[] studentScore;
    private int minScore;
    private int range;
    private float sum = 0;
    private float average = 0;

    public StudentScore(int studentCount, int minScore, int maxScore){
        this.studentCount = studentCount;
        this.minScore = minScore;
        range = maxScore - minScore + 1;
        studentScore = new float[studentCount];
    }

    public void calcAvgScore(){
        average = sum / studentCount;
    }

    public float getAverage() {
        return average;
    }

    @Override
    public void run(){
        for (int i = 0; i < studentCount; i++) {
            try {
                float random = (float) (Math.random() * range + minScore);
                studentScore[i] = random;
                sum += studentScore[i];
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        calcAvgScore();
    }
}
