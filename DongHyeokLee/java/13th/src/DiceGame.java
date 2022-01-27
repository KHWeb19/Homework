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
        }

        applySkillEffect();
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



    //* 결합이 많이 되면 리팩토링(코드 개선)시 왜 힘든지에 대한 분석

    // 강사님의 말을 종합해보자면 지금 이 applySkillEffect 매소드에는
     // 이미 3가지 기능을 하고 있기 때문에 위에 startGame 메소드 부분에서 코드를 짤 때 비슷한 형식(gmArr[id].applySkillEffect)으로 짜고싶으나
     // for 부분에서 플레이어 수만큼 루프를 도는 기능이 중복이 되기 때문에 비슷한 형식으로 짜기 어려워졌다.
     // applySkillEffect 매소드가 세가지 기능을 담고 있기 때문에
     // 이것을 다시 리팩토링 하기에는 아마 크게 많은 기능이 없어서 당장은 힘들지 않다고 생각되나 그것 자체가 엔티티 오염의 시작이고
     // 만약에 이 기능들을 세부적으로 나눴을때 새로이 추가된 기능이나 코드를 작성할 때 기존 엔티티 오염이 덜 하고
     // 이와 같은 것처럼 더 코드를 깔끔한 형식으로 짤 수 있다는 측면에서 봤을때
     // 결합이 많이 되면 이러한 것들을 방해하기 때문에 반대로 힘들어 진다고 말하는 것 같다.


    //그럼 applySkillEffect 매소드에 for문을 없애고 i에 id를 넣고 이 매소드를 GameManager나 Player에 옮겨야 될까나?
    // 그럼 id는 매소드 안에서 0으로 초기화 하는게 맞나?
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

