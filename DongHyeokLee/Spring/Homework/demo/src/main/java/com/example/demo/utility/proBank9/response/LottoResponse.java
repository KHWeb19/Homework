package com.example.demo.utility.proBank9.response;

import com.example.demo.utility.proBank9.Lotto;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class LottoResponse {
    Map<Integer, String> selectArrMap;
    Map<Integer, String> peopleArrMap;
    Integer k;
    String v;

    public LottoResponse(Lotto lot) {
        selectArrMap = new HashMap<>();
        peopleArrMap = new HashMap<>();
        int[] selectArr = lot.getSelectArr();
        int[] peopleArr = lot.getPeopleArr();

        for (int i = 0; i < selectArr.length; i++) {
            selectArrMap.put(selectArr[i], "O");
        }
        for (Map.Entry<Integer, String> people : peopleArrMap.entrySet()) {
            k = people.getKey();
            v = people.getValue();
        }
        //j =1 이 i =5정도에서 찾았을 경우
        // i = 1 x 2 x 3 x 4 x 5o
        //j= 2가 i =6에 찾았을  경우
        // i = 1 x 2 x 3 x 4x 5 x 6o
        //그럼 5번이 x로 바뀌어버림
        //그럼 else경우에도 value값이 O이면 변경 안되도록 하면 될려나

        //i는 사람 번호
        for (int i = 0; i < peopleArr.length; i++) {
            for (int j = 0; j < selectArr.length; j++)
                if (selectArr[j] == peopleArr[i]) {
                    peopleArrMap.put(peopleArr[i], i + " O");
                    break;
                } else if (v == "O") {
                    break;
                } else {
                    peopleArrMap.put(peopleArr[i], i + " X");
                }
        }
    }
}
