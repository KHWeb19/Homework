package com.example.demo.utility.prob3;

import lombok.Getter;

@Getter
public class Triangle {
    // 삼각형 넓이 구하기
    // 밑변과 높이를 알아야한다.

    private int xPoint;
    private int yPoint;
    private float Trisum;

    public Triangle(int xPoint, int yPoint){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    public float TriangleSum(){
        Trisum = (float) (xPoint * yPoint * 0.5);
        return Trisum;
    }
}
