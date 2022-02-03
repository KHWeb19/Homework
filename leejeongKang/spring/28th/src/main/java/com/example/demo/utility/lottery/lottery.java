package com.example.demo.utility.lottery;

import lombok.Data;

@Data
public class lottery {

    private final int PEOPLE_NUM = 100;
    private final int LOTTO_RANGE = PEOPLE_NUM;
    private final int WINNING_PEOPLE = 5;
    private int winningLottoNum;

    private String[] lotto = new String[PEOPLE_NUM];

    /* 전체 배열에 X 배치하고
        로또 당첨된 번호만 O 로 수정해줌
     */

    public void lottoX() {
        for (int i = 0; i < PEOPLE_NUM; i++) {
            lotto[i] = "X";
        }
    }

    public void randomLotto() {
        for (int i = 0; i < WINNING_PEOPLE; i++) {
            winningLottoNum = (int) (Math.random() * LOTTO_RANGE);
        }
    }

        public void lottoAlloc() {
            for (int i = 0; i < PEOPLE_NUM; i++) {
                if (winningLottoNum == i) {
                    lotto[i] = "O";
                    System.out.printf("%d번 사람 : %s\n", i, lotto[i]);
                }
            }
        }
    }



