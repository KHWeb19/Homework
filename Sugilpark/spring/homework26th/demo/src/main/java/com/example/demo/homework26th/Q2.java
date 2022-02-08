package com.example.demo.homework26th;

import lombok.Data;

@Data
public class Q2 {
    private final int student = 30;
    private final int MAX = 100;
    private final int MIN = 60;
    private final int range = MAX - MIN - 1;
    private int sum = 0;
    private int avg = 0;
    int[] sc = new int[student];

    public void school(){

        for(int i = 0; i < student; i++){
            sc[i] = (int)(Math.random() * range + MIN);
            sum += sc[i];
        }
        avg = sum / student;
    }
}
