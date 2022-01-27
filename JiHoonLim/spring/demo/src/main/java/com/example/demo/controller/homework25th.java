package com.example.demo.controller;

public class homework25th {
    int test =0;
    public int rollDice(){
        final int MAX = 6;
        final int MIN = 1;

        int range = MAX - MIN +1 ;
        int dice;

        dice = (int)(Math.random() * range + MIN);

        return dice;
    }
    public String printDice(){
        String s;
        s = "주사위의 값";

        return s;
    }

}
