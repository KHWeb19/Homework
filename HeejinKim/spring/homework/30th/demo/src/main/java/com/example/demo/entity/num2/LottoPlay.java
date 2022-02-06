package com.example.demo.entity.num2;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class LottoPlay {

    Map<Integer,String> selectArrMap;



    public LottoPlay(Lotto lt){

        selectArrMap=new HashMap<>();
        int []selectNumArr= lt.getSelectArr();

        for(int i=0;i<selectNumArr.length;i++){
            selectArrMap.put(selectNumArr[i],"O");

        }


    }




}
