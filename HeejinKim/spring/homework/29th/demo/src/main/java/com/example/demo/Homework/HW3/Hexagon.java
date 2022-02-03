package com.example.demo.Homework.HW3;

import lombok.Data;

@Data
public class Hexagon {

    float hexagonArea;
    float side=9;
    public Hexagon(){

        hexagonArea=(float)((3*Math.sqrt(3)*side*side)/2);
    }

}
