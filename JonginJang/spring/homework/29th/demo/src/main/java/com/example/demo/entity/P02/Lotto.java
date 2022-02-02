package com.example.demo.entity.P02;

import lombok.Data;

@Data
public class Lotto {
    private int totalNum;
    private int selectNum;

    private int[] peopleArr;
    private int[] selectArr;

    private String[] resultArr; //결과를 표시할 배열

    private int max, range;
    private final int MIN = 1;

    public Lotto(final int totalNum, final int selectNum) {
        this.totalNum = totalNum;
        this.selectNum = selectNum;

        max = totalNum;
        range = max - MIN + 1;

        peopleArr = new int[totalNum];
        selectArr = new int[selectNum];
        resultArr = new String[totalNum];
    }

    public void allocNonDuplicateArrNumber (final int cnt, int[] arr) {
        int rand;

        for (int i = 0; i < cnt; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (isDuplicate(rand, arr, i));

            arr[i] = rand;
            System.out.print(arr[i]+", ");
        }
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public boolean isDuplicate (int rand, int[] arr, int cnt) {
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == rand) {
                return true;
            }
        }
        return false;
    }

    public void checkWinner () {
        for (int i = 0; i < selectNum; i++) {
            for (int j = 0; j < totalNum; j++) {
                if (selectArr[i] == peopleArr[j]) {
                    resultArr[j] = peopleArr[j] + " [ ○ ]";
                    break;
                }
            }
        }

        for(int k =0; k<totalNum; k++){
            if(resultArr[k]==null){
                resultArr[k] = peopleArr[k] + " [ X ]";
            }
        }
    }

    public void raffle () {
        allocNonDuplicateArrNumber(totalNum, peopleArr); // 전체 인원에게 랜덤번호 할당
        allocNonDuplicateArrNumber(selectNum, selectArr); // 당첨번호 할당
        checkWinner(); //결과 확인
    }
}
