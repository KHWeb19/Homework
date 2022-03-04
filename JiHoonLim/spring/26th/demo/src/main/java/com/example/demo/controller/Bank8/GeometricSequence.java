package com.example.demo.controller.Bank8;

import java.util.Scanner;

public class GeometricSequence {
    private final int MAX = 31;

    private int multiply;
    private int [] arr ;
    private int want;
    private int tmp;

    private final int FIRST = 1;

    public GeometricSequence(int multiply , int want){
        this.multiply = multiply;
        this.want = want;

        arr = new int[MAX];

        arr[0] = FIRST;
        tmp = 0;
    }

    public void CreateArr(){
        for (int i = 1 ; i < MAX; i++) {
            arr[i] = arr[i - 1] * multiply ;
        }
    }

    public int printArr(){
        tmp = arr[want - 1];
        return tmp;
    }

    public void calcStart(){
        CreateArr();
    }
}
