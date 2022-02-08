package com.example.demo.utility.sequence;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class GeometricSequence {
    ArrayList<BigInteger> sequence = new ArrayList<BigInteger>();

    public GeometricSequence(int length){
        for (int i = 0; i<=length; i++){
            sequence.add(BigDecimal.valueOf(Math.pow(2,i)).toBigInteger());
        }
    }

    public int getLastIndex(){
        return sequence.size()-1;
    }

    public BigInteger getLastElement(){
        return sequence.get(sequence.size()-1);
    }
}
