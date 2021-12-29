import java.math.BigInteger;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        /* 문제 3. 배열로 로또 문제를 만들어보기!
           실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
           실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
           배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.
         */

        // 구현 전략
        // 1. 전체 100개 배열을 만듬
        // 2. 당첨 자리 5개 랜덤하게 할당
        // 3. 할당된 자리 중 중복이 존재할 가능성도 있으므로 검사해야함
        //    선택된 인덱스는 0 ~ 99 사이의 랜덤값임
        //    그렇다면 어떻게 이 랜덤 인덱스의 중복 여부를 판정할 것인가 ?
        //    실제 SELECT는 5개이므로
        //    이 SELECT를 활용한 5개 배열에 할당된 랜덤 인덱스를 배치하면 어떨까 ?
        //    그럼 검사를 최악의 경우라고 가정하더라도 최대 4개만 하면 된다.

        /*
        1. for문으로 5개 랜덤 당첨 지정
        2. 배열 100개의 인덱스 만들기
        3. 100개의 인덱스중 중첩값 검사 (방어)
           불린 이용하여 참거짓으로 중첩된경우 나올때 다시 반복문으로 돌아가 재탐색시킴
        4. 1,2,3이 마친 값중 스캔가능하게 조정
        5. 스캔값 출력
         */

        final int TOTAL = 100;
        final int SELECT = 5;

        boolean[] lottoBox = new boolean[TOTAL];
        int[] selectIdx = new int[SELECT];

        boolean isRealloc = true;

        int lottoIdx = 0;
        int allocCnt = 0;

        for (int i = 0; i < SELECT; i++) {
            while (isRealloc) {
                lottoIdx = (int) (Math.random() * TOTAL);

                isRealloc = false;

                for (int j = 0; j < allocCnt; j++) {
                    if (selectIdx[j] == lottoIdx) {
                        isRealloc = true;
                        System.out.println("같은 번호가 나와 다시 뽑습니다.");
                        break;
                    }
                }
            }

            lottoBox[lottoIdx] = true;
            selectIdx[allocCnt++] = lottoIdx;
            isRealloc = true;

            System.out.println("lottoBox[" + lottoIdx + "] = " + lottoBox[lottoIdx]);
        }
    }
}


