package com.example.demo.utility.prob1;

import lombok.Getter;

@Getter
public class TodayProduct {
    // 오늘의 상품 번호를 하나 선택함.

    private final int MIN = 1;
    private int todayNum;
    private int range;

    public TodayProduct(int productNum){ //MAX
        range = productNum - MIN +1;

    }

    public int calcTodayNum(){
        todayNum = (int)(Math.random()*range + MIN);
        return todayNum;
    }
}
