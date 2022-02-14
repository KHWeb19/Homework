package com.example.demo.entity.order30.probank;

import lombok.Data;

import java.awt.*;

@Data
public class RegularPolygon {
    private float sideLength;
//    private float numOfSideLen;
    private float area;

    public RegularPolygon(int sideLength){
        this.sideLength = sideLength;
    }

    public void calcTriangleArea(){
        area = sideLength * sideLength * (float) Math.sqrt(3.0f) / 2.0f / 2.0f;
    }

    public void calcRectangleArea(){
        area = sideLength * sideLength;
    }

    public void calcHexagonArea(){
        area = 3.0f * (float)Math.sqrt(3.0f) * sideLength / 2.0f;
    }
}
