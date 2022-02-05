package com.example.homework.utility.area;

import lombok.Data;

@Data
public class BaseCalc {

    private float sideLength;
    protected float areaBase;
    private float area;

    public BaseCalc(float sideLength){
        this.sideLength = sideLength;
        float areaBase =  sideLength * sideLength;
    }

    public void calcTriangleArea(){
        area = areaBase * (float)Math.sqrt(3.0f) / 2.0f / 2.0f;
    }

    public void calcSquareArea(){
        area = areaBase;
    }

    public void calcHexagonArea(){
        area = 3.0f * (float)Math.sqrt(3.0f) * sideLength / 2.0f;
    }
}
