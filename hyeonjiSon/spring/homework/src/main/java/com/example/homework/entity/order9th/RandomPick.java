package com.example.homework.entity.order9th;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Total 갯수만큼 있는 배열 중에서 MAX 갯수만큼 배열[i] 주소값을 랜덤으로 뽑아준다.
//이때 랜덤 주소값 MAX개 중에 중복은 없어야 한다.
@Data
public class RandomPick {

    private int pickNum;

    private int TOTAL;//품목의 총 갯수
    private int MAX; //최대로 뽑을 랜덤추천상품
          //이 둘은 값이 언제든 바뀔 수 있으니 여기에서 값을 final로 지정X

    private boolean isAlloc = true;

    private int randIdx = 0;

    //인자의 숫자(3)만큼 연산하면 된다.
    public void RandomPick(int TOTAL, int MAX) {

        boolean[] randBox = new boolean[TOTAL]; //TOTAL값은 RecommandCloth에서 줘야하나
        int[] selectIdx = new int[MAX];

        this.TOTAL = MAX;
        this.MAX = MAX;

        //로또박스를 응용하면 되지 않을까...
        //왜냐면 중복 상품도 뜨면 안되는 거긴 하니까 중복 거를 수도 있고 괜찮을 것 같다.
        for(int i = 0, allocCnt = 0; i < MAX; i++){ //반복문 1 : MAX 값만큼 랜덤 숫자를 뽑아준다.
            while(isAlloc){
                pickNum = (int)(Math.random() * TOTAL);

                isAlloc = false;

                //루프마다 랜덤 숫자를 새로 뽑아서 randArr[랜덤]을 MAX갯수만큼 뽑아준다
                for(int j = 0; j < allocCnt; j++){
                    if(selectIdx[j] == randIdx){
                        isAlloc = true;
                        break;
                    }
                }
            }
            randBox[randIdx] = true;
            selectIdx[allocCnt++] = randIdx;

            isAlloc = true;
        }
        //boolean[] randBOX = true;로 반복문 나온 녀석들을...어떻게 변형해줘야하지?

        //근데 이게 막상 또 작성하고 보니 헷갈린다... 어차피 스레드 3개로 나눠 돌리는 게 아니라면
        //스레드로 만들 필요가 없지 않나...
        //스레드로 돌릴 때는 중복 발생을 어떻게 막아야 하는지도 잘 모르겠음.
        //그냥 스레드 없이 가보자...일단...
    }

}

