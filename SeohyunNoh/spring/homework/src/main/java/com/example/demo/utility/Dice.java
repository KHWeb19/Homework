package com.example.demo.utility;

import lombok.Data;

@Data
public class Dice {
    // 이거를 실행할 Dice클래스를 따로 생성하는 것이 좋음
    private final int MAX = 6;
    private final int MIN = 1;

    private final int range = MAX - MIN + 1;

    private int rand;

    public void rollDice(){
        rand = (int)(Math.random() * range + MIN);
    }
}
