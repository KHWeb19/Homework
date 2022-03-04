package com.example.demo.utility.series;

import lombok.Getter;

@Getter
public class MySequence {
    // ratio : 공비
    private int ratio;
    // type : 등비인지 등차인지 등등
    private int type;
    private int result;

    public MySequence(int ratio, int type){
        this.ratio = ratio;
        this.type = type;
    }

    public void calcSequenceOrder(int order){
        result = (int)Math.pow(ratio,order - 1);
    }

}
