package com.example.demo.homeWork26th;

import lombok.Data;

@Data
public class School {
    private final int STU = 30;
    private final int MAX = 100;
    private final int MIN = 60;
    private final int RANGE = MAX - MIN + 1;
    private int sum = 0;
    private int avg = 0;
    int[] ARRSTU = new int[STU];


    public void score(){
        for(int i = 0; i < STU; i++){
            ARRSTU[i] = (int)(Math.random() * RANGE + MIN);
            sum += ARRSTU[i];
        }
        avg = sum / STU;
    }

}
