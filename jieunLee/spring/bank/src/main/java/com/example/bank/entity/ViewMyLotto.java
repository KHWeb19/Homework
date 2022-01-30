package com.example.bank.entity;

import lombok.Data;

@Data
public class ViewMyLotto {
    private int myNum;
    private String yesOrNo;

    public ViewMyLotto(int myNum, String yesOrNo) {
        this.myNum = myNum;
        this.yesOrNo = yesOrNo;
    }
}
