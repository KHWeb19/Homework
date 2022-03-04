package com.example.demo.Homework.HW2;

import lombok.Data;

@Data
public class Lotto {
    //선택 숫자 5개
    //일반숫자 100개
    //중복 생각
    //1 일반 숫자와 중복숫자의 배열을 만든다
    //2 랜덤으로 숫자5개를 뽑고 배열과 매칭을 시키면서
    //3.중복을 검사한다

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
        peopleNumber();
        selNumber();
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

        System.out.printf("%5d",totalArr[i-1]);

        if( i % 10 == 0 ){
            System.out.println();
        }
         }
   }
  /* public void raffle(){
       peopleNumber();
       selNumber();
   } */

}
