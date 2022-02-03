package com.example.demo.Homework.HW3;

import lombok.Data;

@Data
public class Area {

    public Area(){
        Hexagon  he= new Hexagon();
        Square   sq= new Square();
        Triangle tr= new Triangle();
    }


}
