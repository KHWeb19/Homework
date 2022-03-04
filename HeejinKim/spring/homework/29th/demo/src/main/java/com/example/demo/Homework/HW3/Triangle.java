package com.example.demo.Homework.HW3;

import lombok.Data;

@Data
public class Triangle {

    float side=3;
    float TriangleArea;
    float s;


    public Triangle(){
        s = (side+side+side)/2;
        TriangleArea=(float)Math.sqrt(s*(s-side)*(s-side)*(s-side));
    }





}
