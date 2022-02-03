package com.example.demo.utility.proBank9;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
@Data
public class Lotto2 {

    ArrayList<Integer> people;
    Random generator;
    Map<Integer, Integer> map;
    int ran;

    public Lotto2(){
        people = new ArrayList<>();
        generator = new Random();
        map = new HashMap<>();
        }


    //generator부분 중복 방지해야함
    //map의 value부분을 중복 안되게 해야되는데
    //어떻게 해야할지 모르겠음
    public Map<Integer , Integer> people(){
        for (int i = 0; i < 100 ; i++) {
            ran = generator.nextInt(99) + 1;
            map.put( i+1 , ran);
        }

        return map;
    }



}
