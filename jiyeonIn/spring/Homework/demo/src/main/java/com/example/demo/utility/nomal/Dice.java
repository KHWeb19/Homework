package com.example.demo.utility.nomal;

public class Dice {
    private final int MAX = 6;
    private static final int MIN = 1;
    private static int range;
    private static int ranadom;

    public Dice(){
        range = MAX - MIN +1;

    }

    public void rollDice(){
        ranadom = (int)(Math.random()*range +MIN);
    }

    public int getRolldice(){
        return ranadom;
    }


}
