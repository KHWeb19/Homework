package com.example.demo.Homework.HW3;

import lombok.Data;

@Data
public class Square {

    float SquareArea;
    float side=3;


    public Square(){

        SquareArea= side*side;

    }

}
