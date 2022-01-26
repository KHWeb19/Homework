package com.example.demo.homeWork26th;

import lombok.Data;

@Data
public class SequenceControl {

    private final int MAX = 31;
    private final int MIN = 1;
    private final int MUL = 2;
    private int[] sc = new int[MAX];
    int num;


    public void Control(){
        sc[0] = MIN;

        for(int i = MIN; i < MAX; i++){
            sc[i] = sc[i-MIN] * MUL;
        }

        num = sc[MAX - MIN];
    }

}
