package com.example.demo.utility.series;

import lombok.Getter;

@Getter
public class MySequence {
    private int ratio;
    private int type;
    private int result;

    public MySequence(int ratio, int type){
        this.ratio = ratio; //공비
        this.type = type;  // 타입 : 등비수열?말하는 듯.

    }

    public void calcSequenceOrder(int order){
        result = (int)Math.pow(ratio, order-1);
    }
}
