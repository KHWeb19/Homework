package com.example.demo.utility;

public class CalcArea {
    double triangleArea,squareArea, hexagonArea;

    public void triangle(int height, int width){
        triangleArea = height * width / 2;
    }

    public void square(int height, int width){
        squareArea = height * width;
    }

    public void hexagon(int width){
        hexagonArea = ((Math.sqrt(3) * 3) * Math.pow(width, 2)) / 2;
    }

}
