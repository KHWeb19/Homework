package com.example.homework.entity.order9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomPick {

    private int randArr[]; // 1 ~ 품목갯수까지 배열마다 상품의 정보가 있고...
                  // 배열 주소값 3개를 랜덤으로 뽑아주는 편이 좋나?

    private int MAX; //품목의 총 갯수와 종류가 앞으로 바뀔 수 있으니
    private final int MIN = 1;
    private final int range = MAX - MIN + 1;


    public RandomPick(int MAX){
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= MAX; i++){
            list.add(i);
        }

        for(int i = 1; i<= 3; i++){
            Collections.shuffle(list);
            System.out.println();
        }
    }
}
