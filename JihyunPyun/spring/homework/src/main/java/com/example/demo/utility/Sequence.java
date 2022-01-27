package com.example.demo.utility;

import lombok.Data;

import java.math.BigInteger;
import java.util.Arrays;

public class Sequence {
    private int num;
    public BigInteger[] sequenceArr;
    final int RATIO = 2;

    public Sequence(int num) {
        this.num = num;
        sequenceArr = new BigInteger[num];
    }

    public void sequenceMaker(){
        for (int i = 0; i < num; i++) {
            sequenceArr[i] = BigInteger.valueOf((int) Math.pow(RATIO, i));
        }
    }

    @Override
    public String toString() {
        return "수열=" + Arrays.toString(sequenceArr);
    }
}
