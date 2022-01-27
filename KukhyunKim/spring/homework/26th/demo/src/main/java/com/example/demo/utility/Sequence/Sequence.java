package com.example.demo.utility.Sequence;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class Sequence {
    private int Num;
    public int[] SeqArr;
    final int Ratio = 2;

    public Sequence(int num){
        this.Num = num;
        SeqArr = new int[num];
    }

    public void seqManager(){
        for(int i = 0; i < Num; i++){
            SeqArr[i] = (int) Math.pow(Ratio, i);
        }
    }

    @Override
    public String toString() {
        return "Sequence{" +
                "SeqArr=" + Arrays.toString(SeqArr) +
                '}';
    }
}
