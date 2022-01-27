import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        //3. 배열로 로또 문제를 만들어보기!
        //   실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //   실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        //1) 크기가 5인 배열에 랜덤값 넣기
        //   중복값 방지하기
        //   ---> 두번째 랜덤값부터 앞서 구한 랜덤값과 중복이면 다시 뽑기

        final int MAX = 10;
        final int WIN = 5;

        int rand;
        boolean isReAllock = true;
        int[] randIdx = new int[WIN];

        for (int i=0; i<WIN; i++){
            while (isReAllock) {
                rand = (int)(Math.random()*(MAX));
                randIdx[i] = rand;
                isReAllock = false;
                for (int j=0; j<i; j++) {
                    if (randIdx[j]==rand) {
                        System.out.println("중복발생");
                        isReAllock = true;
                        break;
                    }
                }
            }
            isReAllock = true;
            System.out.println(randIdx[i]);
        }
    }
}
