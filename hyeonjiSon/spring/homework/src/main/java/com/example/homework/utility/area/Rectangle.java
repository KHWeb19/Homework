package com.example.homework.utility.area;

import lombok.Data;

@Data
public class Rectangle extends BaseCalc {

    private int rectArea;

    public Rectangle(int WIDTH, int HEIGHT){
        super(WIDTH, HEIGHT);
        rectArea = areaBase;
        //정사각형 넓이는 areaBase의 계산과 다르지 않기 때문에
        //값을 그대로 받기만 하면 된다.
    }
}
