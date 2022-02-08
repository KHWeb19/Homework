package com.example.demo.utility;
import java.math.BigInteger;
/*
1. 아래와 같은 등비 수열이 있다.
    1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
    사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
*/
public class MyCustomSequence {
    int equalRatio;
    int count;

    private BigInteger sequenceNum;
    public MyCustomSequence (final int equalRatio,final int count) {
        this.equalRatio = equalRatio;
        this.count = count;
    }

    public BigInteger setSequenceNum () {
        sequenceNum = BigInteger.valueOf(equalRatio).pow(count-1);
        return sequenceNum;
    }

}

