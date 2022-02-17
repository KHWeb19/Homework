package com.example.bank.entity.bank9;

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
