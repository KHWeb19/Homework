import java.util.Arrays;

public class DiceGame {
    final int PLAYER_NUM = 2;
    final int DICE_NUM = 2;

    final int DEATH_FLAG = 4000;

    boolean[] deathId;

    private GameManager[] gmArr;

    public DiceGame(){
        gmArr = new GameManager[PLAYER_NUM];
        deathId = new boolean[PLAYER_NUM];

        for (int id =0; id<PLAYER_NUM; id++){
            gmArr[id] = new GameManager(id, DICE_NUM);
        }
    }

    public void startGame(){
        for (int id =0; id<PLAYER_NUM; id++){
            gmArr[id].rollEveryDice();
            gmArr[id].checkSpecialDice();
            gmArr[id].rollSpecialDice();
        }
    }

    public void checkDeath(){
        for (int id =0; id<PLAYER_NUM; id++){
            if (gmArr[id].getSum() > DEATH_FLAG){
                deathId[id] = true;
            }
        }
    }

    public void settleResult(){
        boolean death = false;

        for (int id =0; id<PLAYER_NUM; id++){
            if(deathId[id]){
                System.out.printf("플레이어 %d가 패배하였습니다!\n", id);
                death = true;
            }
        }

        if (!death){
            int res = gmArr[0].compareTo(gmArr[1]);

            if (res >0){
                System.out.println("플레이어 0 승리!");
            }
            else if (res<0){
                System.out.println("플레이어 1 승리!");
            }
            else{
                System.out.println("무승부");
            }

        }

    }

    public void printResult(){
        checkDeath();
        settleResult();
    }

    public void applySkillEffect(){
        int tmp;
        for (int i =0; i<PLAYER_NUM; i++){
            if (gmArr[i].isGetSpecial()){
                switch (tmp = gmArr[i].getSepcialDiceNum()){
                    case 1:
                        for (int j = 0; j <PLAYER_NUM; j++){
                            if (i == j){
                                continue;
                            }

                            gmArr[j].operateDice(-2);
                        }
                        break;
                    case 3:
                        for (int j = 0; j <PLAYER_NUM; j++){
                            gmArr[j].operateDice(-6);
                        }
                        break;
                    case 4:
                        System.out.println("4번 - 잘가");
                        gmArr[i].operateDice(4444);
                        break;
                    case 6:
                        for (int j = 0; j <PLAYER_NUM; j++){
                            if (i == j){
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
                ", DICE_NUM=" + DICE_NUM +
                ", gmArr=" + Arrays.toString(gmArr) +
                '}';
    }
}
