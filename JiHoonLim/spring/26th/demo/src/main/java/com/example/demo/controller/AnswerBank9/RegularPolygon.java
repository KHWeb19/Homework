package com.example.demo.controller.AnswerBank9;

import lombok.Data;

@Data
public class RegularPolygon {
    private float sideLength;
    private float area;

    // 생성자로 변의 길이 가져옴
    public RegularPolygon(float sideLength) {
        this.sideLength = sideLength;

    }

    // 정삼각형 넓이
    public void calcTriangleArea() {
        area = (sideLength * sideLength * (float) Math.sqrt(3.0f) / 2.0f) / 2.0f;
    }

    // 정사각형 넓이
    public void calcRectangleArea() {
        area = sideLength * sideLength;
    }

    //정육각형 넓이
    public void calcHexagonArea() {
        area = 3.0f * (float) Math.sqrt(3.0f) * sideLength / 2.0f;
    }
}
