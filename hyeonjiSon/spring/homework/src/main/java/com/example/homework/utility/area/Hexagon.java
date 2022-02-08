package com.example.homework.utility.area;

import lombok.Data;

@Data
public class Hexagon extends BaseCalc{

    private int hexArea;

    public Hexagon(int WIDTH, int HEIGHT){
        super(WIDTH, HEIGHT);
    }

    public void calcHexArea(){
        hexArea = areaBase*3;
    }

}
