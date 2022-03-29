package com.example.demo.controller.AnswerBank9;

import lombok.Data;

@Data
public class PolygonResponse {
    // 필요한 값만 출력하기 위해
    private float area;

    public PolygonResponse(RegularPolygon rp) {
        area = rp.getArea();
    }
}
