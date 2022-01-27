package com.example.homework.utilityBank8;

import lombok.Data;

@Data
public class Power { //문제은행 [8] - 1.2의 거듭제곱으로 31번째 항까지 구해라

    private int num;
    final int ORDER = 31;

    public Power(final int num){
        this.num = num;
    }

    public void GetPowerCal(){
        for(int i = 0; i < ORDER; i++){
            int pow = (int)(Math.pow(num, i));
            System.out.printf("%d^%d = %d", num, i, pow);
        }
    }

}
