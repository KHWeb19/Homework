package com.example.demo.utility.utility27th;

import java.math.BigInteger;

public class Sequence {
    protected BigInteger startNum;
    protected BigInteger multipleNum;
    protected int numSelect;
    protected BigInteger num;

    public Sequence(int startNum, int multipleNum, int numSelect){
        this.startNum = BigInteger.valueOf(startNum);
        this.multipleNum = BigInteger.valueOf(multipleNum);
        this.numSelect = numSelect;
    }

    public void selectSequence(){
            num = startNum.multiply((multipleNum).pow(numSelect - 1));
    }

    public BigInteger getNum() {
        return num;
    }
}
