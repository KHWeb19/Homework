package com.example.demo.entity.order30.probBank.response;

import com.example.demo.entity.order30.probBank.EddiLotto;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class LottoResponse {
    Map<Integer, String> selectArrMap;

    public LottoResponse(EddiLotto el){
        selectArrMap = new HashMap<>();
        int[] selectArr = el.getSelectArr();

        for(int i = 0; i < selectArr.length; i++){
            selectArrMap.put(selectArr[i],"o");
        }
    }
}
