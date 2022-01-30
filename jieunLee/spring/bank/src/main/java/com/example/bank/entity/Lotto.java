package com.example.bank.entity;

import lombok.Data;

import java.time.chrono.MinguoChronology;

@Data
public class Lotto {

    // (100)명에게 랜덤번호 부여
    // 랜덤번호 중에 (5)개를 뽑음
    // (5)개는 O표시 (100)-(5)개는 X표시

    private final int MIN = 1;
    private int totalNum;
    private int lottoNum;
    private int[] totalArr;
    private int[] lottoArr;
    private int rand;

    private int myNum;
    private String yesOrNo = "X";

    public Lotto (final int TOTAL_NUM, final int LOTTO_NUM) {
        this.totalNum = TOTAL_NUM;
        this.lottoNum = LOTTO_NUM;

        totalArr = new int[TOTAL_NUM];
        lottoArr = new int[LOTTO_NUM];
    }

    public boolean isDuplicate (int rand, int[] arr, int cnt) {
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == rand) {
                return true;
            }
        }
        return false;
    }

    public void allocTotalArr() {
        for (int i=0; i<totalNum; i++) {
            do {
                rand = (int)(Math.random()*(totalNum-MIN+1)+MIN);
            } while (isDuplicate(rand, totalArr, i));

            totalArr[i] = rand;
        }
    }
    public void allocLottoArr() {
        for (int i=0; i<lottoNum; i++) {
            do {
                rand = (int)(Math.random()*(totalNum-MIN+1)+MIN);
            } while (isDuplicate(rand, lottoArr, i));

            lottoArr[i] = rand;
        }
    }

    public void rollLotto() {
        myNum = totalArr[(int)(Math.random()*totalArr.length)];
        for (int i=MIN; i<lottoNum; i++) {
            if (myNum == lottoArr[i-1]) {
                yesOrNo = "O";
            }
        }
    }
}
