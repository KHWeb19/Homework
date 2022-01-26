package com.example.demo.utility;

import lombok.Data;

// @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
//
@Data
public class Dice {

    private int diceNum;
    private final int MAX = 6;
    private final int MIN = 1;

    private final int range = MAX - MIN +1;

    public void rollDice(){
        diceNum = (int)(Math.random()*range + MIN);
    }

}
