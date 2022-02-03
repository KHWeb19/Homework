package com.example.demo.entity.homework29th;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Lotto {
//    로또에 당첨된 사람들- 부여받은 번호, O
//    당첨되지 않은 사람들- 부여받은 번호, X
    private int winnerArr[];
    private List<Object> playerList = new ArrayList<>();

    private int winnerNum;
    private int playerNum;
    private int randomRange;
    final private int MIN_RANDOM = 1;

    public Lotto(int winnerNum, int playerNum) {
        this.winnerNum = winnerNum;
        this.playerNum = playerNum;
        winnerArr = new int[winnerNum];
        randomRange = (playerNum * MIN_RANDOM) + MIN_RANDOM;
    }

    // 플레이어 숫자 할당
    public void allocPlayerNumber () {
        for (int i = 0; i < playerNum; i++) {
            playerList.add(i, 'X');
        }
    }

    // 당첨 숫자 할당
    public void allocSelectNumber () {
        int random;
        for (int i = 0; i < winnerNum; i++) {
            do {
                random = (int) (Math.random() * randomRange);
            } while (duplicateCheck(random, winnerArr, winnerNum));
            winnerArr[i] = random;
        }
    }

    //    중복체크
    public boolean duplicateCheck(int random, int[] checkArr, int count){
        for (int i = 0; i < count; i++) {
            if (checkArr[i] == random) {
                return true;
            }
        }
        return false;
    }

    //    숫자 할당
    public void allocPlayerArr () {
        for (int i = 0; i < playerNum; i++) {
            for (int j = 0; j < winnerNum; j++) {
                if (winnerArr[j] == i){
                    playerList.add(j, 'O');
                }
            }
        }
    }
}
