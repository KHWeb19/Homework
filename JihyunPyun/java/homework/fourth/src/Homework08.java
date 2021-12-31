public class Homework08 {
    public static void main(String[] args) {
//        2명이 주사위 게임을 한다. (배열 활용)
//        주사위는 각자 2개씩 굴릴 수 있다.

//        1. 처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
//        (2, 4, 6, 8, 10, 12)
//        2. 한번 더 돌렸을때 값이 아래와 같다면 특수 스킬을 발동시킨다.

//        1 : 상대방 주사위 -2
//        3 : 다같이 -6
//        4 : lose
//        6 : 상대방 -3, 내꺼 +3


        final int PLAYER_NUM = 2;
        final int DICE_NUM = 2;

        //final로 묶어두도록 연습해보자~~~
        final int SKILL_NUM1 = 1;
        final int SKILL_NUM2 = 3;
        final int SKILL_NUM3 = 4;
        final int SKILL_NUM4 = 6;
        final int ONE_MORE = 2;

        final int DEATH = 4444; //4번 눈금 때매 추가됨

        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;

        int dice = 0;
        int[] diceSum = new int[PLAYER_NUM];

        System.out.printf("주사위 %d개를 굴립니다\n", DICE_NUM);

        // 주사위 굴리기
        for (int i = 0; i < PLAYER_NUM; i++) {
            for (int j = 0; j < DICE_NUM; j++) {
                dice = (int) (Math.random() * range + MIN);
                diceSum[i] += dice;
            }
        }

        // 짝수면 한번 더 굴리기
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] % ONE_MORE == 0) {
                dice = (int) (Math.random() * range + MIN);
                diceSum[i] += dice;
                // 한번 더 굴렸을때 나온 결과값 대응
                switch (dice) {
                    case SKILL_NUM1:
                        System.out.printf("player%d 특수스킬 발동!", i + 1);
                        System.out.println("-> 상대방 주사위 값 -2");
                        for (int j = 0; j < PLAYER_NUM; j++) {
                            if (j == i) {
                                continue;
                            }
                            diceSum[j] -= 2;
                        }
                        break;

                    case SKILL_NUM2:
                        System.out.printf("player%d 특수스킬 발동!", i + 1);
                        System.out.println("-> 다같이 -6");
                        diceSum[i] -= 6;
                        for (int j = 0; j < PLAYER_NUM; j++) {
                            if (j == i) {
                                continue;
                            }
                            diceSum[j] -= 6;
                        }
                        break;

                    case SKILL_NUM3:
                        diceSum[i] = DEATH;
                        break;

                    case SKILL_NUM4:
                        System.out.printf("player%d 특수스킬 발동!", i + 1);
                        System.out.println("-> 상대방 -3, 내꺼 +3");
                        for (int j = 0; j < PLAYER_NUM; j++) {
                            if (i == j) {
                                continue;
                            }
                            diceSum[j] -= 3;
                            diceSum[i] += 3;
                        }
                        break;

                    default:
                        break;
                }
            }
        }

        // 주사위가 음수값이 나왔을때
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] < 0) {
                diceSum[i] = 0;
            }
        }

        System.out.printf("player1 주사위 합 : %d \n", diceSum[0]);
        System.out.printf("player2 주사위 합 : %d \n", diceSum[1]);


        boolean checkWinner = true; // death때매 boolean 사용

        // death 처리
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] == DEATH) {
                System.out.printf("player%d가 패배하였습니다!\n", i+1);
                checkWinner = false; //이것때매 아래 if문은 안돌아감
            }
        }

        // 승패 판정
        if (checkWinner) {
            if (diceSum[0] > diceSum[1]) {
                System.out.println("player1 승리!");
            } else if (diceSum[0] < diceSum[1]) {
                System.out.println("player2 승리!");
            } else {
                System.out.println("무승부!");
            }
        }

    }
}
