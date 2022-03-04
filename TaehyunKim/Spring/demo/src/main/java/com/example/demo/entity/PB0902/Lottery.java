package com.example.demo.entity.PB0902;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class Lottery {

    private ArrayList<Integer> myLottery = new ArrayList<>();

    private HashMap<Integer, String> myHashMap = new HashMap<>();

    public Lottery(){
        setMyLottery();
        setHashMap();
        addLotteryToMap();
    }


    public void setHashMap(){
        for (int i=0; i<100; i++){
            myHashMap.put(i, "X");
        }
    }

    public void addLotteryToMap(){
        for (int i =0; i<5; i++){
            myHashMap.put(myLottery.get(i), "O");
        }

        System.out.println(myHashMap);
    }

    private int rand;

    public void setMyLottery(){
        for (int i =0 ;i <5; i++){
            rand = (int) (Math.random()*100);
            if (myLottery.contains(rand)){
                i--;
            }
            else{
                myLottery.add(rand);
            }
        }
    }

}
