package com.example.demo.homework26th;


import lombok.Data;

@Data
public class Q1 {
    private final int MAX = 31;
    private final int MUL = 2;
    private final int MIN = 1;
    private final int num3[] = new int[MAX];
    private int num = 0;


    public void sequence() {
        num3[0]=MIN;

        for (int i = MIN; i < MAX; i++) {
            num3[i] = num3[i-MIN] * MUL;
        }
        num = num3[MAX - MIN];
    }
}