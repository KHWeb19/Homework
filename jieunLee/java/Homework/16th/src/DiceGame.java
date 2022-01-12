import java.util.Arrays;

public class DiceGame {
    final int PLAYER_NUM = 2;
    final int DICE_NUM = 2;
    final int DEATH_FLAG = 4000;

    boolean[] deathId;
    private GameManager[] gmArr;

    public DiceGame () {
        gmArr = new GameManager[PLAYER_NUM];
        deathId = new boolean[PLAYER_NUM];

        for (int id = 0; id < PLAYER_NUM; id++) {
            gmArr[id] = new GameManager(id, DICE_NUM);
        }
    }

    public void startGame () {
        for (int id = 0; id < PLAYER_NUM; id++) {
            gmArr[id].rollEveryDice();
            gmArr[id].checkSpecialDice();
            gmArr[id].rollSpecialDice();
            applySkillEffect(id);
//          gmArr[id].applySkillEffect(id);
        }
//      applySkillEffect();
    }

    public void checkDeath () {
        for (int id = 0; id < PLAYER_NUM; id++) {
            if (gmArr[id].getSum() > DEATH_FLAG) {
                deathId[id] = true;
            }
        }
    }

    public void settleResult () {
        boolean death = false;

        for (int id = 0; id < PLAYER_NUM; id++) {
            if (deathId[id] == true) {
                System.out.printf("플레이어 %d가 패배하였습니다!\n", id);
                death = true;
            }
        }

        if (!death) {
            int res = gmArr[0].compareTo(gmArr[1]);

            if (res > 0) {
                System.out.println("플레이어 0 승리!");
            } else if (res < 0) {
                System.out.println("플레이어 1 승리");
            } else {
                System.out.println("무승부");
            }
        }
    }

    public void printResult() {
        checkDeath();
        settleResult();
    }

    public void applySkillEffect (int id) {
        int tmp;
        if (gmArr[id].isGetSpecial()) {
            switch (tmp = gmArr[id].getSpecialDiceNum()) {
                case 1:
                    // 1번의 경우 상대방의 주사위 눈금을 2 떨군다.
                    System.out.println("1번 - 상대 눈금을 2떨굼");
                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (id == j) {
                            continue;
                        }
                        gmArr[j].operateDice(-2);
                    }
                    break;
                case 3:
                    // 3번의 경우 다 같이 -6을 적용한다.
                    System.out.println("3번 - 다같이 6떨굼");
                    for (int j = 0; j < PLAYER_NUM; j++) {
                        gmArr[j].operateDice(-6);
                    }
                    break;
                case 4:
                    // 4번의 경우 그냥 패배
                    System.out.println("4번 - 잘가");
                    gmArr[id].operateDice(4444);
                    break;
                case 6:
                    // 6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
                    System.out.println("6번 - 상대편 3을 뺏어서 내쪽으로 3을 땡겨옴");
                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (id == j) {
                            continue;
                        }
                        gmArr[j].operateDice(-3);
                        gmArr[id].operateDice(3);
                    }
                    break;
                default:
                    System.out.println("디폴트 2, 5!!!");
                    gmArr[id].operateDice(tmp);
                    break;
            }
        }

    }

    @Override
    public String toString() {
        return "DiceGame{" +
                "PLAYER_NUM=" + PLAYER_NUM +
                ", DICE_NUM=" + DICE_NUM + '\n' +
                ", gmArr=" + Arrays.toString(gmArr) +
                '}';
    }
}