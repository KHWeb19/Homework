package com.example.demo.utility.prob3;

import lombok.Getter;

@Getter
public class Hexagon {
    // 한변의 길이를 알아야함.
    private int oneSide;
    private float sumHex;

    public Hexagon(int xPoint, int yPoint){
        oneSide = yPoint - xPoint;

    }

    public Float SumHexagon(){
        float rootThree = (float) Math.pow(3, 0.5);
        sumHex = (float)(3 * rootThree * oneSide * oneSide * 0.5);
        return sumHex;
    }
}
