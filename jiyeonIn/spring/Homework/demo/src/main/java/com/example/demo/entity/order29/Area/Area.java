package com.example.demo.entity.order29.Area;

import lombok.Getter;

@Getter
public class Area {
    private int square;
    private double area;
    private double heightBasic;


    public Area(int areaNum ,int side ){
        heightBasic = Math.sqrt(3);
        findArea(areaNum,side);
    }

    private void findArea(int areaNum, int side) {
        switch (areaNum){
            case AreaNumber.TRIANGLE:
                findTriangle(side);
                break;
            case AreaNumber.SQUARE:
                findSquare(side);
                break;
            case AreaNumber.HEXAGON:
                findHexagon(side);
                break;
        }
    }

    public void findTriangle(int side){

        double height = heightBasic*(side)/2;

        area = (height*side)/2;
    }
    public void findSquare(int side) {
        area = side*side;
    }

    public void findHexagon(int side) {
        area = (3*heightBasic*(side*side))/2;
    }

}
