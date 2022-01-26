package com.example.demo.utility27th;

import java.math.BigInteger;

public class Sequence {
    protected BigInteger startNum;
    protected BigInteger multipleNum;
    protected int numSelect;
    protected BigInteger[] arr;

    public Sequence(int startNum, int multipleNum, int numSelect){
        this.startNum = BigInteger.valueOf(startNum);
        this.multipleNum = BigInteger.valueOf(multipleNum);
        this.numSelect = numSelect;
        arr = new BigInteger[numSelect];
    }

    public BigInteger getArrNumber() {
        return arr[numSelect - 1];
    }

    public void selectSequence(){
        for(int i = 0; i < numSelect; i++){
            arr[i] = startNum.multiply((multipleNum).pow(i));
        }
    }






}
