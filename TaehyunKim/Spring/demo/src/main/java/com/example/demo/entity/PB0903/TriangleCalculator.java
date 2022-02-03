package com.example.demo.entity.PB0903;

import lombok.Data;

@Data
public class TriangleCalculator {
    private float area;

    public TriangleCalculator(int length, int height){
        area = ((float)length * height) / 2;

    }
}
