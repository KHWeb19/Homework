import java.util.Scanner;

public class Homework_08 {
    public static void main(String[] args) {

        // 2명이서 하는 주사위 게임

        // 첫번째 주사위에서 짝수가 나올경우에만 두번째 주사위를 돌린다.

        // 1 -> 상대방 -1 / 3 -> 다 같이 -3(최저 점수는 0으로 지정)/ 4 -> 굴린 사람이 패배
        // 6 -> 상대방 -3, 굴린 사람 +3 / 2,5 -> 나온 숫자만큼 +2, +5

        final int PLAYER = 2;
        final int DEATH =4444;
        final int REMINE = 0;

        final int MAX = 6;
        final int MIN = 1;

        int range = MAX -MIN + 1;

        int[] score = new int[PLAYER];

        int dice1 = 0;
        for(int i =0; i < PLAYER; i++){
            dice1 = (int)(Math.random()*range + MIN);
            score[i] += dice1;

            System.out.println(i+"의 첫번째 주사위: "+dice1);
        }

        for(int i = 0; i < PLAYER; i++){

            if(dice1 % 2 == REMINE){
                //int dice2 = (int)(Math.random() *range +MIN);

                Scanner scanner = new Scanner(System.in);
                System.out.print(i+"의 두번째 주사위를 입력하세요 >>> ");
                int dice2 = scanner.nextInt();

                if(dice2 == 1){
                    for(int j = 0; j <PLAYER; j++){
                        if(!(j == i)){
                            score[i] -= 1;
                        }
                    }
                }else if(dice2 == 3){
                    score[i] -= 3;
                }else if(dice2 == 6){
                    for(int j = 0; j < PLAYER; j++){
                        if(j == i){
                            continue;
                        }
                        score[i] += 3;
                        score[j] -= 3;
                    }
                }else if(dice2 == 4){
                    score[i] = DEATH;
                }else
                    score[i] += dice2;
            }

            System.out.printf("score[%d] = %d\n", i+1, score[i]);
        }

        for(int i = 0; i < PLAYER; i++){
            if(score[i] < 0){
                score[i] = 0;
            }

            System.out.printf("score[%d] = %d\n", i, score[i]);
        }

        boolean winnerCheck = true;

        for (int i = 0; i < PLAYER; i++) {
            if (score[i] == DEATH) {
                System.out.printf("플레이어%d가 패배하였습니다!\n", i);
                winnerCheck = false;
            }
        }


        if(winnerCheck){
            for(int i = 0; i < PLAYER; i++){
                for(int j = 0; j < PLAYER; j++){
                    //여기서... PLAYER 갯수를 지정하지않고 할 수 있을까요..?
                }
            }
        }



    }
}
