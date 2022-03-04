package com.example.demo.entity.order30.probBank;

import lombok.Getter;

@Getter
public class RegularPolygon {
    private float sideLength;

    // 정삼각형이던, 정사각형이던, 정육각형이던
    // 어떤 형태던 가리지 않고 일반화된 형태로 문제를 풀길 원함.
    // 그럼 n 각형에 대해서도 항상 동일한 패턴을 적용할 수 있을것임.
    private float area;

    public RegularPolygon(float sideLength){
        this.sideLength = sideLength;

    }

    public void calcTriangleArea(){
        // 한벽의 길이를 줄거야.
        area = (sideLength * sideLength * (float) Math.sqrt(3.0f)/2) /2;
    }

    public void calcRectangleArea(){
        // 한벽의 길이를 줄거야.
        area = sideLength*sideLength;
    }

    public void calcHexagonArea(){
        // 한벽의 길이를 줄거야.
        area = 3.0f * (float) Math.sqrt(3.0f)* sideLength / 2.0f;
    }
}
