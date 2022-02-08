package com.example.homework.utility.area;

import lombok.Data;

@Data
//빨간 밑줄과 함께 Lombok needs a default constructor int the base class 라는 글자가 뜬다.
//빨간 전구모양과 뜨는 화살표 클릭하면
// inspection 'Lombok annotations' options < 이런 게 뜨는데
//뭣 모르고 건드렸다가 큰일 날까봐 못 만지겠음...
public class Triangle extends BaseCalc {

    private int triArea;

    public Triangle(int WIDTH, int HEIGHT){
        super(WIDTH, HEIGHT);
        calcTriArea();
    }

    public void calcTriArea(){
        triArea = areaBase/2;
    }
}
