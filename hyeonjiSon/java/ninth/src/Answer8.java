public class Answer8 {
    public static void main(String[] args) { //선생님 답안 분석해보기
        // 1. 사용자 수: 2
        // 2. 주사위 수: 2
        // 3. 특수 주사위 수: 1 ???
        // 4. 특수 스킬: 1, 3, 4, 6
        // 5. 각 스킬 이펙트 값들 ???
        // 6. 주사위 생성

        final int PLAYER_NUM = 2;
        final int DICE_NUM = 2;

        final int SKILL_NUM1 = 1;
        final int SKILL_NUM2 = 3;
        final int SKILL_NUM3 = 4;
        final int SKILL_NUM4 = 6;

        final int DEATH = 4444;

        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;

        int dice;
        int[] diceSum = new int[PLAYER_NUM];

        // 2명의 플레이어가 두 개의 주사위를 굴림
        for (int i = 0; i < PLAYER_NUM; i++) {

            for (int j = 0; j < DICE_NUM; j++) {
                dice = (int) (Math.random() * range + MIN);
                diceSum[i] += dice;
            }
        }

        // 각 플레이어들의 주사위 값을 비교해서 특수 주사위를 굴릴지 여부 판정
        for (int i = 0; i < PLAYER_NUM; i++) {

            if (diceSum[i] % 2 == 0) { // diceSum[i] 값이 짝수인 경우만 if문 조건을 만족한다.
                dice = (int) (Math.random() * range + MIN);

                if (dice == SKILL_NUM1) {
                    System.out.println("상대방 주사위 눈금을 2 떨군다.");

                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (j == i) { // j가 i와 같으면 스킵하라는 건...
                                      // SKILL_NUM1을 발동시킨 플레이어의 주사위 합계도 -2되면 안되니까 continue로 처리?
                            continue;   // skip의 의미임
                        }
                        diceSum[j] -= 2; //<- 이 j가 어떤 식으로 작동을 하는 건지 아직 잘 이해가 가지 않습니다.
                                         // 처음으로 육면체주사위 2개를 굴릴 때 나온 결과는 dice[i], dice[i+1] 위치에
                                         // 주사위 값 두개를 더한 변수들이 저장된 것 아닌가요?
                                         // 어떻게 위에서 쓴 적이 없는 dice[j]에 -= 2가 적용될 수 있는 건지 모르겠어요.
                                         // dice[i] 였던 것이 어떻게 조건식을 통과하지 못한 나머지 dice[j]로 처리되는 걸까요?
                    }
                } else if (dice == SKILL_NUM2) {
                    System.out.println("모두 함께 자폭 ^^ -6");

                    for (int j = 0; j < PLAYER_NUM; j++) {
                        diceSum[j] -= 6; // 여기에선 왜 변수 두개가 다 적용되는거지... 진짜 dice[i] = dice[j]로 사용되는건가?
                         //이유가 뭘까... 변수 이름은 고유한데... 똑같은 내용물을 잠시 다른 박스에 담았을 뿐인? 그렇게 생각하면 되나?
                    }
                } else if (dice == SKILL_NUM3) {
                    System.out.println("그냥 가세요 ㅠㅜ");

                    diceSum[i] = DEATH;
                } else if (dice == SKILL_NUM4) {
                    System.out.println("모두에게서 3씩 뺏어서 내거에 추가한다.");

                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (i == j) {
                            continue;
                        }

                        diceSum[j] -= 3; // j는 상대
                        diceSum[i] += 3; // i는 조건식을 통과한 해당 플레이어인 건 확실해보이는데...
                    }
                } else {
                    diceSum[i] += dice;
                }
            }
        }

        // 음수 처리
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] < 0) { //diceSum의 값이 0보다 작은 경우...
                diceSum[i] = 0; //int가 음수를 표현하지 못하는 것도 아닌데 굳이 0으로 변경해주는 이유가 궁금해요!
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
