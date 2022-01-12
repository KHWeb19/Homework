public class Ans8 {
    public static void main(String[] args) {
        ////불변의 플레이어 2명
        final int PLAYER_NUM = 2;
        ////불변의 주사위 개수 2개
        final int DICE_NUM = 2;
        ////부정할 수 없는 특수주사위 숫자 1,3,4,6의 스킬
        final int SKILL_NUM1 = 1;
        final int SKILL_NUM2 = 3;
        final int SKILL_NUM3 = 4;
        final int SKILL_NUM4 = 6;

        ////어쩔 수 없는 쥬금
        final int DEATH = 4444;

        ////불변의 정육면체 주사위
        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;

        ////dice 라는 정수형 변수를 선언해줌.
        int dice;
        ////플레이어 수를 diceSum이라는 정수의 배열 객체로 만듦.
        int[] diceSum = new int[PLAYER_NUM];

        // 2명의 플레이어가 두 개의 주사위를 굴림
        for (int i = 0; i < PLAYER_NUM; i++) {
            ////주사위 2개의 확실한 차이를 보여주기 위해 중첩for문 사용
            for (int j = 0; j < DICE_NUM; j++) {
                ////변수 dice는 랜덤의 주사위 눈
                dice = (int) (Math.random() * range + MIN);
                ////주사위 굴린값의 합.
                diceSum[i] += dice;
            }
        }

        // 각 플레이어들의 주사위 값을 비교해서 특수 주사위를 굴릴지 여부 판정
        for (int i = 0; i < PLAYER_NUM; i++) {
            ////주사위 굴린 값의 합이 짝수라면??
            if (diceSum[i] % 2 == 0) {
                ////특수 주사위도 눈은 랜덤하게 나오지?
                dice = (int) (Math.random() * range + MIN);
                ////근데 특수 주사위가 1이 나왔으면??
                if (dice == SKILL_NUM1) {
                    ////상대 주사위 눈금을 2 떨군다!
                    System.out.println("상대방 주사위 눈금을 2 떨군다.");

                    ////만약에 결과가 짝수면 한번 더!
                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (j == i) {
                            continue;   // skip의 의미임
                        }
                        ////주사위 눈 더한 값에서 2를 빼!
                        diceSum[j] -= 2;
                    }
                    ////만약 특수 주사위가 3이 나왔으면??
                } else if (dice == SKILL_NUM2) {
                    ////점수는 0이하로 안떨어지는 선에서 둘 다 -6
                    System.out.println("모두 함께 자폭 ^^ -6");

                    for (int j = 0; j < PLAYER_NUM; j++) {
                        ////둘 다 주사위 눈 더한 값에서 6을 빼!
                        diceSum[j] -= 6;
                    }
                    ////만약 특수 주사위가 4가 나오면??
                } else if (dice == SKILL_NUM3) {
                    ////RIP
                    System.out.println("그냥 가세요 ㅠㅜ");
                    ////패배.
                    diceSum[i] = DEATH;
                    ////만약 특수 주사위가 6이 나오면??
                } else if (dice == SKILL_NUM4) {
                    ////니꺼 3점 내놔라.
                    System.out.println("모두에게서 3씩 뺏어서 내거에 추가한다.");
                    ////만약에 결과가 짝수면 한번 더!
                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (i == j) {
                            continue;
                        }
                        ////당하는 사람 -3
                        diceSum[j] -= 3;
                        ////6나온 사람 +3
                        diceSum[i] += 3;
                    }
                } else {
                    ////뭣도 아니고 홀수면 그냥 더해!
                    diceSum[i] += dice;
                }
            }
        }

        // 음수 처리
        for (int i = 0; i < PLAYER_NUM; i++) {
            ////만약에 결과값이 음수면 0으로 처리함.
            if (diceSum[i] < 0) {
                diceSum[i] = 0;
            }

            System.out.printf("dice[%d] = %d\n", i, diceSum[i]);
        }
        ////누가 이겼는지 체크해봄.
        boolean checkWinner = true;
        ////누군가 4가 나와서 졌다.
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] == DEATH) {
                ////졌다고 쪽준다.
                System.out.printf("플레이어%d가 패배하였습니다!\n", i);
                ////이건 승자가 아닌거다.
                checkWinner = false;
            }
        }

        // 승부 판정
        if (checkWinner) {
            ////플레이어 1의 주사위 값이 플레이어 2의 주사위 값보다 크면
            if (diceSum[0] > diceSum[1]) {
                System.out.println("플레이어 1 승리!");
                ////반대 상황이면
            } else if (diceSum[0] < diceSum[1]) {
                System.out.println("플레이어 2 승리!");
                ////둘 다 아니면(두 값이 같으면)
            } else {
                System.out.println("무승부!");
            }
        }
    }
}

