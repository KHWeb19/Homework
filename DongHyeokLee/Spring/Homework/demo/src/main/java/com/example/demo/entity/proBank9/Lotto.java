package com.example.demo.entity.proBank9;

import lombok.Data;

//문제은행 [ 3 ]의 3번 문제를 여태까지 배운 내용들을 결합하여 풀어보자!
//JSON Viewer 상에서 로또에 당첨된 사람들은 부여받은 번호와 O가 표기되도록 만들어보자!
//당첨되지 않은 사람들은 부여받은 번호와 X가 표기되도록 만든다.

//
@Data
public class Lotto {

    private int totalNum;
    private int selectNum;

    private int[] peopleArr;
    private int[] selectArr;

    private int max, range;
    private final int MIN = 1;

    public Lotto(final int totalNum, final int selectNum) {
        this.totalNum = totalNum;
        this.selectNum = selectNum;

        max = totalNum;
        range = max - MIN + 1;

        peopleArr = new int[totalNum];
        selectArr = new int[selectNum];
    }

    public boolean isDuplicate (int rand, int[] arr, int cnt) {
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == rand) {
                return true;
            }
        }

        return false;
    }

    public void allocPeopleNumber () {
        int rand;

        for (int i = 0; i < totalNum; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (isDuplicate(rand, peopleArr, i));

            peopleArr[i] = rand;
        }
    }
    public void allocSelectNumber () {
        int rand;

        for (int i = 0; i < selectNum; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (isDuplicate(rand, selectArr, i));

            selectArr[i] = rand;
        }
    }

    public void allocNonDuplicateArrNumber (final int cnt, int[] arr) {
        int rand;

        for (int i = 0; i < cnt; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (isDuplicate(rand, arr, i));

            arr[i] = rand;
        }
    }

    public void printPeopleArr () {
        for (int i = 1; i <= totalNum; i++) {
            System.out.printf("%4d", peopleArr[i - 1]);

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public void checkWinner () {
        for (int i = 0; i < selectNum; i++) {
            for (int j = 0; j < totalNum; j++) {
                if (selectArr[i] == peopleArr[j]) {
                    System.out.printf("위치 %d 당첨!!!\n", j);
                    break;
                }
            }
        }
    }



    public void raffle2 () {
        allocNonDuplicateArrNumber(totalNum, peopleArr);
        allocNonDuplicateArrNumber(selectNum, selectArr);
        checkWinner();
    }


}

