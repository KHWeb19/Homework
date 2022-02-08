package com.example.demo.utility;

import lombok.Data;

//@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
// @Getter : 자동 Getter 만들어줌
// @Setter : 자동 Setter 만들어줌
// @RequiredArgsConstructor : 특정 입력이 들어오는 생성자 처리
// @ToString : 만들지 않아도 알아서 자동화
// @EqualsAndHashCode : 현재로써 신경쓰지 않아도 됨.

@Data
public class Dice {
    private int diceNum;
    private final int MAX = 6;
    private final int MIN = 1;
    private final int range = MAX - MIN + 1;

    public void rollDice(){
        diceNum = (int)(Math.random() + range + MIN);
    }

}
