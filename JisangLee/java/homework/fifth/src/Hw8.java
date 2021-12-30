public class Hw8 {
    public static void main(String[] args) {
        //2명이 주사위 게임을 한다. (배열 활용)
        //주사위는 각자 2개씩 굴릴 수 있다.
        //처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
        //(2, 4, 6, 8, 10, 12)

        //한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
        //(특수 스킬 주사위는 1번만 굴린다)
        //이 특수 스킬들은 1, 3, 4, 6에서 동작한다.
        //1번의 경우 상대방의 주사위 눈금을 2 떨군다.
        //3번의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
        //4번의 경우 그냥 패배 처리한다.
        //6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
        //2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다.

        //사용자 2명, 주사위 수 2개
        //주사위 2개의 합이 짝수라면 특수 주사위 한 번 더 돌릴 수 있다
        //특수 주사위는 1,3,4,6,에서 각각의 스킬을 동작
        //2,5가 나왔을 때는 기존 주사위 합에서 더해진다.

        final int PLAYER_NUM = 2; //사용자 2명 설정
        final int DICE_NUM = 2; //주사위 수 2개 설정

        //특수 주사위 나온 숫자 스킬 지정
        final int SKILL_NUM1 = 1;
        final int SKILL_NUM2 = 3;
        final int SKILL_NUM3 = 4;
        final int SKILL_NUM4 = 6;

        final int DEATH = 44;

        final int MAX = 6; //주사위의 최대값 설정
        final int MIN = 1; //주사위의 최소값 설정
        int range = MAX - MIN + 1; //주사위의 범위 지정

        int dice;
        int[] diceSum = new int[PLAYER_NUM];

        for (int i = 0; i < PLAYER_NUM; i++) {  //2명의 플레이어 지정
            for (int j = 0; j < DICE_NUM; j++) {  //2개의 주사위 지정
                dice = (int) (Math.random() * range + MIN);
                diceSum[i] += dice; // 주사위 굴려 나온 값을 서로 더해준다
            }
        }
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] % 2 == 0) { //주사위의 합이 짝수이면 특수 스킬 발동
                dice = (int) (Math.random() * range + MIN);
                if (dice == SKILL_NUM1) {
                    System.out.println("상대방 주사위 눈금을 2 떨군다.");
                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (j == i) {
                            continue;
                        }
                        diceSum[j] -= 2;
                    }
                } else if (dice == SKILL_NUM2) {
                    System.out.println("사용자 모두 주사위 눈금을 6 떨군다.");
                    for (int j = 0; j < PLAYER_NUM; j++) {
                        diceSum[j] -= 6;
                    }

                } else if (dice == SKILL_NUM3) {
                    System.out.println("그냥 패배ㅠㅠ");
                    diceSum[i] = DEATH;
                } else if (dice == SKILL_NUM4) {
                    System.out.println("모든 상대방에게 3을 뺏어서 내거에 추가한다");
                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (i == j) {
                            continue;
                        }
                        diceSum[j] -= 3;
                        diceSum[i] += 3;
                    }
                } else {
                    diceSum[i] += dice;
                }
            }
        }
        // 음수 처리
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] < 0) {  //주사위의 합이 0보다 작으면
                diceSum[i] = 0;  //0으로 처리
            }

            System.out.printf("dice[%d] = %d\n", i, diceSum[i]);
        }

        boolean checkWinner = true;

        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] == DEATH) {
                System.out.printf("플레이어%d가 패배하였습니다!\n", i);
                checkWinner = false;
            }
        }

        // 승부 판정
        if (checkWinner) {
            if (diceSum[0] > diceSum[1]) {
                System.out.println("플레이어 1 승리!");
            } else if (diceSum[0] < diceSum[1]) {
                System.out.println("플레이어 2 승리!");
            } else {
                System.out.println("무승부!");

            }
        }
    }
}


