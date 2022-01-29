package com.example.demo.utility.sequence;

import lombok.Data;

@Data
public class MySeqence {
    //일단은 공비를 받아오고 항을 정해주자
    private int base;
    private int type;
    private int num;
    //2^0 ---1번째
    //2^1 ---2번째


    public MySeqence(final int BASE,int type){
        base=BASE;
        this.type=type;

    }
    public void calcSeqCount(int count){

        num=(int)(Math.pow(base,count-1));

    }



}
