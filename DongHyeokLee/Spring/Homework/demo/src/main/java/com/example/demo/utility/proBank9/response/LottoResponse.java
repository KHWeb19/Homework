package com.example.demo.utility.proBank9.response;

import com.example.demo.utility.proBank9.Lotto;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class LottoResponse {
    Map<Integer, String> selectArrMap;
    Map<Integer, String> peopleArrMap;

    public LottoResponse(Lotto lot) {
        selectArrMap = new HashMap<>();
        peopleArrMap = new HashMap<>();
        int[] selectArr = lot.getSelectArr();
        int[] peopleArr = lot.getPeopleArr();

        for (int i = 0; i < selectArr.length; i++) {
            selectArrMap.put(selectArr[i], "O");
        }

        //i는 사람 번호
        for (int i = 0; i < peopleArr.length; i++) {
            for (int j = 0; j < selectArr.length; j++)
                if (selectArr[j] == peopleArr[i]) {
                    peopleArrMap.put(peopleArr[i], i + " O");
                    break;
                } else {
                    peopleArrMap.put(peopleArr[i], i + " X");

                }
        }
    }
}
