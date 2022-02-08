package com.example.demo.entity.order29.response;

import com.example.demo.entity.order29.lotto.Lotto;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class LottoResponse {
    Map<Integer,String> map = new HashMap<>();

    public LottoResponse(Lotto lotto){
        for(int i=0; i<30;i++){
            map.put(i+1,lotto.drawLottoWinner(i));
        }
    }
}
