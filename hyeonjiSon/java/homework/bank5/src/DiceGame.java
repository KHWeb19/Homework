import java.util.Arrays;

public class DiceGame {
    final int PLAYER_NUM = 2; //플레이어 수
    final int DICE_NUM = 2; //주사위 수

    final int DEATH_FLAG = 4000; //특수 주사위 4 스킬에 대비한 DEATH_FLAG

    boolean[] deathId;

    private GameManager[] gmArr; // gmArr라는 배열을 만들었다는 선언
                             //GameManager데이터 타입과 무관함

    public DiceGame () {
        gmArr = new GameManager[PLAYER_NUM]; // [0], [1]번 까지 있는 배열
                                       //근데 이건 어떤 변수타입인지 정하지 않은 것 같은데 되는건가?
        deathId = new boolean[PLAYER_NUM]; //이건 불린타입 배열인건가

        for (int id = 0; id < PLAYER_NUM; id++) {
            gmArr[id] = new GameManager(id, DICE_NUM);
        }
    }

    public void startGame () { //이게 ExtendsProblem에서 호출되는 부분!
        for (int id = 0; id < PLAYER_NUM; id++) { //id는 0; id가 PLAYER_NUM보다 작은 동안에만;루프마다 1씩 증가하며 반복
                                           //즉 이 코드에서는 2보다 작은 0, 1까지만 반복되는 코드. 그 동안!
            gmArr[id].rollEveryDice(); //플레이어 0, 1 - 2회 주사위를 굴려라.
            gmArr[id].checkSpecialDice(); // 플레이어 0, 1 주사위 합의 값 - 짝수 검사
            gmArr[id].rollSpecialDice(); //플레이어 0, 1 - 스페셜 주사위를 굴려라
            //궁금한 점...
        }

        applySkillEffect(); //스페셜 주사위 결과에 따른 효과 적용!
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

    // 숫자(sum)값이 4000 보다 크다면 무조건 패배이므로 상대편이 승리함
    // 숫자값이 4000인 케이스가 없다면 정상적인 처리가 진행되어야함
    public void printResult() {
        // deathId 부분에서 누가 죽었는지를 알고 있으므로
        // 이를 기반으로 검사를 진행하면 된다.
        checkDeath();
        settleResult();
    }

    public void applySkillEffect () {
        int tmp;
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (gmArr[i].isGetSpecial()) {
                switch (tmp = gmArr[i].getSpecialDiceNum()) {
                    case 1:
                        // 1번의 경우 상대방의 주사위 눈금을 2 떨군다.
                        System.out.println("1번 - 상대 눈금을 2떨굼");
                        for (int j = 0; j < PLAYER_NUM; j++) {
                            if (i == j) {
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
                        gmArr[i].operateDice(4444);
                        break;
                    case 6:
                        // 6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
                        System.out.println("6번 - 상대편 3을 뺏어서 내쪽으로 3을 땡겨옴");
                        for (int j = 0; j < PLAYER_NUM; j++) {
                            if (i == j) {
                                continue;
                            }

                            gmArr[j].operateDice(-3);
                            gmArr[i].operateDice(3);
                        }
                        break;
                    default:
                        System.out.println("디폴트 2, 5!!!");
                        gmArr[i].operateDice(tmp);
                        break;
                }
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