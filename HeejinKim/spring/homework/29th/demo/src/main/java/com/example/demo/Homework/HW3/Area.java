package com.example.demo.Homework.HW3;

import lombok.Data;

@Data
public class Area {
    Hexagon  he;
    Square   sq;
    Triangle tr;

    public Area(){
         he= new Hexagon();
         sq= new Square();
         tr= new Triangle();
    }


}
