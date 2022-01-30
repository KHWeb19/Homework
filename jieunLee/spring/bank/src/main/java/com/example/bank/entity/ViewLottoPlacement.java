package com.example.bank.entity;

import lombok.Data;

@Data
public class ViewLottoPlacement {
    private int[] totalArr;
    private int[] lottoArr;

    public ViewLottoPlacement(int[] totalArr, int[] lottoArr) {
        this.totalArr = totalArr;
        this.lottoArr = lottoArr;
    }
}
