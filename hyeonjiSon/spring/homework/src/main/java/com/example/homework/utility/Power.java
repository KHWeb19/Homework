package com.example.homework.utility;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;

//    등비수열 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...

@EqualsAndHashCode(callSuper = false)//넣으래서 넣었는데 왜? 넣는건지 무슨 의미인지 모르겠음
@Data
//Data를 넣어주어 get변수 값을 바로 구한다.
public class Power extends Thread {
    private int calNum; // 계산된 값
    private final int MAX = 31;

    public void calPower(int powNum){ //Controller에서 받을 값
        for(int i = 0; i <= MAX; i++){
            calNum = (int)(Math.pow(powNum, i)); //powNum이 반복마다 i승만큼 제곱
        }
    }

}
