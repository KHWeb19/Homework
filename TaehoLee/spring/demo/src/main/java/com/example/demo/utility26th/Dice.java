package com.example.demo.utility26th;

import java.util.Random;

public class Dice {
    protected int maxDice;
    protected int minDice;
    protected int diceNum;

    public Dice(int minDice, int maxDice){
        this.maxDice = maxDice;
        this.minDice = minDice;
    }

    public void rollDice(){
        Random rolldice = new Random();
        diceNum = rolldice.nextInt(maxDice - minDice + 1) + minDice ;
    }

    public int getDiceNum() {
        return diceNum;
    }
}
