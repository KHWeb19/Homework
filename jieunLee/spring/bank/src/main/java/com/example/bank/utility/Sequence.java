package com.example.bank.utility;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Sequence {
    final BigInteger INIT = new BigInteger("1");
    final BigInteger BASE = new BigInteger("2");

    BigInteger[] seq;
    int length;

    public Sequence(int idx) {
        length = idx;
    }

    public BigInteger initSeq() {
        seq = new BigInteger[length];
        seq[0] = INIT;
        for(int i=1; i<length; i++) {
            seq[i] = seq[i-1].multiply(BASE);
        }
        return seq[length-1];
    }
}
