package com.example.demo.utility;

public class Sequence { //31항까지

    private static int base;
    private static int count;
    private static int num;

    public Sequence(final int BASE ,int count){
        this.base=BASE;
        this.count=count;
    }

    public static int getTotalNum(int count){

        num=(int)Math.pow(base,(count-1));

        return num;

    }
}


