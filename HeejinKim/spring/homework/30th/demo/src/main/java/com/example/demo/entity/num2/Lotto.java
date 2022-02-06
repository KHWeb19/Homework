package com.example.demo.entity.num2;

import lombok.Data;

@Data
public class Lotto {

    int totalNum = 100;
    int selectNum = 5;

    int[] totalArr;
    int[] selectArr;

    final int MAX = 100;
    final int MIN = 1;

    int range;


    public Lotto() {

        range = MAX - MIN + 1;
        totalArr = new int[totalNum];
        selectArr = new int[selectNum];
        //peopleNumber();
        // selNumber();
        //raffle();

    }


    public boolean duplicate(int rand, int[] arr, int cnt) {
        //중복검사
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == rand) {
                return true;
            }
        }
        return false;
    }


    public void peopleNumber() { //사람들에게 숫자를 나누어준다
        int rand;

        for (int i = 0; i < MAX; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (duplicate(rand, totalArr, i));

            totalArr[i] = rand;
        }
    }


    public void selNumber() { //로또 숫자 선택하기 //중복검사를 해야함

        int rand;
        for (int i = 0; i < selectNum; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);

            } while (duplicate(rand, selectArr, i));

            selectArr[i] = rand;
        }
    }


    public void printTotalArr() {

        for(int i=1; i<=totalNum; i++){

           // System.out.printf("%5d",totalArr[i-1]);

            if( i % 10 == 0 ){
            //    System.out.println();
            }
        }
    }
   public void raffle(){
       peopleNumber();
       selNumber();
   }

}
