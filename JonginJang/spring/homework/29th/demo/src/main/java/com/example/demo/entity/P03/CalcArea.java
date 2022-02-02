package com.example.demo.entity.P03;

import lombok.Data;

@Data
public class CalcArea {
    private int shapeNum;
    private String shapeType;
    private String areaFormula;
    private int sideLength;
    private float shapeArea;

    public CalcArea(int shapeNum, int sideLength){
        this.shapeNum = shapeNum;
        this.sideLength = sideLength;
    }
    public void getArea(){
        switch (shapeNum){
            case 1:
                shapeType = "정삼각형";
                areaFormula = "(√3 / 4) * 한 변의 길의의 제곱";
                calcTriangle();
                break;
            case 2:
                shapeType = "정사각형";
                areaFormula = " 한 변의 길이의 제곱";
                calcSquareArea();
                break;
            case 3:
                shapeType = "정육각형";
                areaFormula = "(3 * √3 * 한 변의 길이의 제곱) / 2";
                calcHexagon();
                break;
        }
    }
    public void calcTriangle(){
        shapeArea = (float)(Math.sqrt(3) / 4 * (Math.pow(sideLength,2)));

    }
    public void calcSquareArea(){
        shapeArea = (float)Math.pow(sideLength,2);

    }
    public void calcHexagon(){
        shapeArea = (float)((3 * Math.sqrt(3) * Math.pow(sideLength,2)) / 2);
    }

}
