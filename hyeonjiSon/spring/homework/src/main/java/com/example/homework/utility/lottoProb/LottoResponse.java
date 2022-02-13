package com.example.homework.utility.lottoProb;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class LottoResponse {
    Map<Integer, String> selectArrMap;

    public LottoResponse(Lotto lotto){
      selectArrMap = new HashMap<>();
      int[] selectArr = lotto.getSelectArr();

      for(int i = 0; i < selectArr.length; i++){
          selectArrMap.put(selectArr[i], "O");
      }

    }
}
