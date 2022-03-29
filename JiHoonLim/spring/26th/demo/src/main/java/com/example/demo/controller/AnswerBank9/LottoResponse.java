package com.example.demo.controller.AnswerBank9;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class LottoResponse {
    // Map을 사용하여 정수, 문자열을 각각 저장
    Map<Integer, String> selectArrMap;

    public LottoResponse(Lotto lotto) {
        selectArrMap = new HashMap<>();
        int[] selectArr = lotto.getSelectArr();

        for (int i = 0; i < selectArr.length; i++){
            selectArrMap.put(selectArr[i], "O");
        }

    }
}
