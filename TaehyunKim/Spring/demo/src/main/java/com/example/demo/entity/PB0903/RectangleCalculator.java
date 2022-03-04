package com.example.demo.entity.PB0903;

import lombok.Data;

@Data
public class RectangleCalculator {

    private int area;

    public RectangleCalculator(int length, int height){
        area = length * height;
    }
}
