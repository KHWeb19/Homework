package com.example.homework.utilityBank7;

import lombok.Data;

@Data
public class Dice {
    private int diceNum;
    private final int MAX = 6;
    private final int MIN = 1;
    int range = MAX - MIN + 1;

    public void rollDice(){
        diceNum = (int)(Math.random() + range + MIN);
    }

}
