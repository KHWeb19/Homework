package com.example.demo.utility27th;


/* 4. 반 학생이 30명이 있다.
        이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        이 상태에서 학생들의 점수를 임의로 배치하고
        학급의 평균값을 구해보도록 한다.
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StudentScore implements Runnable{
    protected int studentCount;
    protected float[] studentScore;
    protected int minScore;
    protected int maxScore;
    protected int range;
    protected static Lock lock;
    protected static float sum = 0;
    protected static float average = 0;

    public StudentScore(int studentCount, int minScore, int maxScore){
        this.studentCount = studentCount;
        this.minScore = minScore;
        this.maxScore = maxScore;
        range = maxScore - minScore + 1;
        studentScore = new float[studentCount];
        lock = new ReentrantLock();
    }

    public void calcAvgScore(){
        lock.lock();
        average = sum / studentCount;
        lock.unlock();
    }

    public float getAverage() {
        return average;
    }

    public void initializeNumber(){
        sum = 0;
        average = 0;
    }

    @Override
    public void run(){
        initializeNumber();
        for (int i = 0; i < studentCount; i++) {
            try {
                float random = (float) (Math.random() * range + minScore);
                studentScore[i] = random;
                lock.lock();
                sum += studentScore[i];
                System.out.printf("%d번째 학생의 점수는 : %s\n", i + 1, studentScore[i]);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        calcAvgScore();
        System.out.println("평균값 : " + average);
    }
}
