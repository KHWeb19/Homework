package com.example.demo.utility;

import lombok.Data;

@Data
public class Dice {

    private final int MAX = 6;
    private final int MIN = 1;
    private final int range = MAX - MIN + 1;
    private int diceNum;

    public void allocDice (){

        diceNum = (int)(Math.random() * range + MIN);

    }

}
