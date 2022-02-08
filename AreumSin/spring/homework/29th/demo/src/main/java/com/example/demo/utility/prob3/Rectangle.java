package com.example.demo.utility.prob3;

import lombok.Getter;

@Getter
public class Rectangle {
    // 높이와 밑변값을 알아야한다.
    private int xPoint;
    private int yPoint;
    private int rectangleSum;

    public Rectangle(int xPoint, int yPoint){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    public int RectangleSum(){
        rectangleSum = xPoint * yPoint;
        return rectangleSum;
    }
}
