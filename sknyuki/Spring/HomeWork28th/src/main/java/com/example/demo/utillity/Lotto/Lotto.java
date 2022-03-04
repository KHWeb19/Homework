package com.example.demo.utillity.Lotto;
import lombok.Data;

import java.util.HashMap;

@Data
public class Lotto<i> {
    int totalNum;
    int selectNum;

    int[] peopleArr;
    int[] selectArr;

    int max, range;
    final int MIN = 1;
    HashMap<Integer, String> LottoWinner = new HashMap<>();
    public Lotto(final int totalNum, final int selectNum) {
        this.totalNum = totalNum;
        this.selectNum = selectNum;

        max = totalNum;
        range = max - MIN + 1;

        peopleArr = new int[totalNum];
        selectArr = new int[selectNum];
    }
//중복확인
    public boolean isDuplicate (int rand, int[] arr, int cnt) {
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == rand) {
                return true;
            }
        }

        return false;
    }

//중복확인을 이용한 메소드(사람들의 범위와 로또의 당첨 번호의 범위가 설정 가능)
    public void allocNonDuplicateArrNumber (final int cnt, int[] arr) {
        int rand;

        for (int i = 0; i < cnt; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (isDuplicate(rand, arr, i));

            arr[i] = rand;
        }
    }

  /*  public void printPeopleArr () {
        for (int i = 1; i <= totalNum; i++) {
            System.out.printf("%4d", peopleArr[i - 1]);

            if (i % 10 == 0) {
                System.out.println();
            }
        }

    }
   */
//당첨자 확인
//LottoWinner에 O,X부여
    public void checkWinner () {
        for (int i = 0; i < selectNum; i++) {
            for (int j = 0; j < totalNum; j++) {
                if (selectArr[i] == peopleArr[j]) {
                    LottoWinner.put(peopleArr[j],"o");}
                    else{
                    LottoWinner.put(peopleArr[j],"X");}
                    }
                }
            }

    public void raffle () {
        allocNonDuplicateArrNumber(totalNum, peopleArr);
        allocNonDuplicateArrNumber(selectNum, selectArr);
        checkWinner();
    }
}
