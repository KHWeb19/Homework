public class Homework08 {
    public static void main(String[] args) {
//        2명이 주사위 게임을 한다. (배열 활용) -> 근데 총 몇판하는거지?
//        주사위는 각자 2개씩 굴릴 수 있다.
//        처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
//        (2, 4, 6, 8, 10, 12)

//       [조건]
//        1 : 상대방 주사위 -2
//        3 : 다같이 -6
//        4 : lose
//        6 : 상대방 -3, 내꺼 +3

//        HOW TO..
//        1. 배열에 주사위 값을 담자
//        2. 주사위 처음 굴렸을때 짝수인 경우 (if)
//        3. 주사위 눈금 별 효과 : 스위치 쓰면 될듯?
//        4. 주사위 값 합산해서 비교하고, 승패 출력

        final int PLAYER_NUM = 2;
        final int DICE_NUM = 2;

        final int SKILL_NUM1 = 1;
        final int SKILL_NUM2 = 3;
        final int SKILL_NUM3 = 4;
        final int SKILL_NUM4 = 6;

        final int DEATH = 4444; //4번 눈금 때매 추가됨

        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;

        int dice = 0;
        int[] diceSum = new int[PLAYER_NUM]; // 플레이어 2명이니까 배열 2칸


        // 주사위 굴리기
        for (int i = 0; i < PLAYER_NUM ; i++){
            for (int j = 0; j < DICE_NUM; j++){
                dice = (int) (Math.random() * range + MIN);
                diceSum[i] += dice;
            }
        }

        //특수 주사위
        for (int i = 0; i < PLAYER_NUM ; i++) {
            switch (diceSum[i]) {
                case SKILL_NUM1:
                    System.out.println("상대방 주사위 눈금 -2");
                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (j == i) {
                            continue;
                        }
                        diceSum[j] -= 2;
                    }
                    break;

                case SKILL_NUM2:
                    System.out.println("다같이 -6");
                    diceSum[i] -= 6;
                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (j == i) {
                            continue;
                        }
                        diceSum[j] -= 6;
                    }
                    break;

                case SKILL_NUM3:
                    System.out.println("끝");
                    diceSum[i] = DEATH;
                    break;

                case SKILL_NUM4:
                    System.out.println("상대방 -3, 내꺼 +3");
                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (i == j) {
                            continue;
                        }
                        diceSum[j] -= 3;
                        diceSum[i] += 3;
                    }
                    break;

                default:
                    diceSum[i] += dice;
            }
        }


        boolean checkWinner = true;

        //누가 이겼는지 확인
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] == DEATH) {
                System.out.printf("플레이어%d가 패배하였습니다!\n", i);
                boolean checkWinner = false;
            }
        }

        while (checkWinner) {
            if (diceSum[0] > diceSum[1]) {
                System.out.println("플레이어 1 승리!");
            } else if (diceSum[0] < diceSum[1]) {
                System.out.println("플레이어 2 승리!");
            } else {
                System.out.println("무승부!");
            }
            break;
        }
    }
}
