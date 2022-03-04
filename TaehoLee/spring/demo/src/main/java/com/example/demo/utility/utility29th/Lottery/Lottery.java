package com.example.demo.utility.utility29th.Lottery;

import lombok.Data;

/*
3. 배열로 로또 문제를 만들어보기!
   실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
   실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.
 */
@Data
public class Lottery {
    private int wincnt;
    private int maxNum;
    private int[] lotteryBank;
    private int[] winBank;

    public Lottery(int wincnt, int maxNum){
        this.wincnt = wincnt;
        this.maxNum = maxNum;
        lotteryBank = new int[maxNum];
        winBank = new int[wincnt];
        initBank();
    }

    public void initBank(){
        for(int i = 0; i < maxNum; i++){
            lotteryBank[i] = i + 1;
        }
    }

    public void drawLottery(){
        for(int i = 0; i < wincnt; i++){
            int winNum = (int)(Math.random() * maxNum) + 1;
            winBank[i] = winNum;
            for (int j = 0; j < i; j++) {
                if (winBank[j] == winNum) {
                    i--;
                    break;
                }
            }
        }
    }
}
