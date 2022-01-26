package com.example.demo.utility;
import lombok.Data;

@Data
public class Score {

    private final int studentNum = 30;
    private final int MAX = 100;
    private final int MIN = 60;
    private final int range = MAX - MIN + 1;
    private int randScore;
    private int[] student = new int[studentNum];
    private double avg;
    private double sum = 0;

    public void random() {
        randScore = (int) (Math.random() * range + MIN);
    }

    public void studentScore (){
        for (int i =0; i<studentNum; i++){
            random();
            student[i] = randScore;
        }
    }

    public void calcSum(){
        for (int i= 0; i<studentNum; i++){
            sum += student[i];
        }
    }
    public double getAvg(){
        avg = sum / studentNum;
        return avg;
    }

}
