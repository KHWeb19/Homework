public class Homework8 {
    public static void main(String[] args) {
        /* 8. 2명이 주사위 게임을 한다.(배열 활용)
              주사위는 각자 2개씩 굴릴 수 있다.
              처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
              (2, 4, 6, 8, 10, 12)

              한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
              (특수 스킬 주사위는 1번만 굴린다)
              이 특수 스킬들은 1, 3, 4, 6에서 동작한다.

              1번의 경우 상대방의 주사위 눈금을 2떨군다.
              3번의 경우 다 같이 -6을 적용한다.(결과는 0이하로 떨어지지 않는다 - 무승부 노리기)
              4번의 경우 그냥 패배 처리한다.
              6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
              2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다.
         */

        /*
           주사위 2개 생성
           1번 주사위 - 1~12
           짝수가 나오면 2번주사위로간다
           2번주사위 - 1 = 상대방 -2
                     2 = +2
                     3 = 다같이 -6
                     4 = 본인 LOSE
                     5 = +5
                     6 = 상대3 을 나의 3으로가저옴
        1. 1번주사위 돌리기
        2. 짝수가나오면 2번주사위 돌리기
        3. 2번주사위의 특수능력 부여
         */

        // 1. 사용자수, 주사위수 상자 생성
        final int PEOPLE_NUM = 2;
        final int DICE_MUM = 2;

        // 2. 스킬주사위용 상자 생성
        final int SKILL_1 = 1;
        final int SKILL_2 = 3;
        final int SKILL_3 = 4;
        final int SKILL_4 = 6;

        // 3. 패배스킬용 상자 생성
        final int DEATH = 4444;

        // 4. for문용 상자 만들기
        final int MAX1 = 12;
        final int MIN1 = 1;
        final int MAX2 = 6;
        final int MIN2 = 1;
        final int START = 0;
        int range1 = MAX1 - MIN1 + 1;
        int range2 = MAX2 - MAX2 + 1;

        // 5. 주사위 생성
        int dice;
        int[] diceSum = new int[PEOPLE_NUM];

        // 6. 플레이어들이 1번 주사위 던지는 반복문 시전
        for (int i = START; i < PEOPLE_NUM; i++) {
            for (int j = START; j < DICE_MUM; j++) {
                dice = (int) (Math.random() * range1 + MIN1);
                diceSum[i] += dice;
            }
        }
        // 7. 1번주사위가 짝수일 경우 반복문 시전
        for (int i = START; i < PEOPLE_NUM; i++) {
            if (diceSum[i] % 2 == 0) {
                dice = (int) (Math.random() * range2 + MIN2);

                // 8. 1, 3, 4, 6에 스킬 지정
                if (dice == SKILL_1) {
                    System.out.println("상대의 점수를 2내린다.");
                    for (int j = START; j < PEOPLE_NUM; j++) {
                        if (j == i) {
                            continue;
                        }
                        diceSum[j] -= 2;
                    }
                } else if (dice == SKILL_2) {
                    System.out.println("상대와 본인의 점수를 6내린다.");
                    for (int j = START; j < PEOPLE_NUM; j++) {
                        diceSum[j] -= 6;
                    }
                } else if (dice == SKILL_3) {
                    System.out.println("패배합니다.");
                    diceSum[i] = DEATH;
                } else if (dice == SKILL_4) {
                    System.out.println("상대의 점수를 3뺏어 본인의 점수로합니다.");
                    for (int j = START; j < PEOPLE_NUM; j++) {
                        if (i == j) {
                            continue;
                        }
                        diceSum[i] -= 3;
                        diceSum[j] += 3;
                    }
                }
                // 9. 2, 5 일때는 그냥 더한다.
                else {
                    diceSum[i] += dice;
                }
            }
        }
        // 10. 0보다 낮은 점수가 나왔을경우를 대비한 방어기제
        for (int i = START; i < PEOPLE_NUM; i++) {
            if (diceSum[i] < 0) {
                diceSum[i] = 0;
            }
            System.out.printf("dice[%d] = %d\n", i, diceSum[i]);
        }
        boolean checkWinner = true;

        for (int i = START; i < PEOPLE_NUM; i++) {
            if (diceSum[i] == DEATH) {
                System.out.printf("플레이어%d가 패배하였습니다!\n", i);
                checkWinner = false;
            }
        }
        if (checkWinner) {
            if (diceSum[0] > diceSum[1]){
                System.out.println("플레이어 1의 승리입니다.");
            } else if (diceSum[0] < diceSum[1]){
                System.out.println("플레이어 2의 승리입니다.");
            } else {
                System.out.println("동점으로 승부가 나지않습니다.");
            }
        }
    }
}
