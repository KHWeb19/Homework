package com.example.demo.utility.Prob2;

import lombok.Getter;

@Getter
public class Lotto {
    private int totalNum;
    private int pickNum;

    int[] peopleArr;
    String[] peopleArr1;
    int[] selectArr;

    private int range;
    private int MIN = 1;

    public Lotto(int totalNum, int pickNum){
        this.totalNum = totalNum;
        this.pickNum = pickNum;

        range = totalNum - MIN +1;

        peopleArr = new int[totalNum];
        peopleArr1 = new String[totalNum];
        selectArr = new int[pickNum];
    }

    public boolean isDuplicate(int rand, int[] arr, int cnt){
        for(int i = 0; i < cnt; i++){
            if(arr[i] == rand){
                return true;
            }
        }
        return false;
    }

    public void peopleMember(){
        int rand;

        for(int i = 0; i < totalNum; i++){
            do{
                rand = (int) (Math.random()*range +MIN);
            }while (isDuplicate(rand, peopleArr, i)); // false일때 빠져나옴.
            peopleArr[i] = rand;
        }
    }

    public void allocSelectNumber(){
        int rand;

        for(int i = 0; i < pickNum; i++){
            do{
                rand = (int) (Math.random()*range +MIN);
            }while (isDuplicate(rand, selectArr, i)); // false일때 빠져나옴.
            selectArr[i] = rand;
        }
    }

    public void find () {
        for (int i = 0; i < pickNum; i++) {
            for (int j = 0; j < totalNum; j++) {
                if (selectArr[i] == peopleArr[j]) { // 맞을 경우 값 0을 넣고 더이상 찾지마.
                    peopleArr1[i] = "o";
                    break;
                }else{
                    peopleArr1[i] = "x";
                }
            }
        }
    }

    public void raffle () {
        allocSelectNumber();
        find();
    }

    public int checkNum(int num){
        return peopleArr[num];
    }

    public String checkWin(int num){
        return peopleArr1[num];
    }
}
