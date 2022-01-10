public class Num8Dice {

    private int MAX = 6;
    private int MIN = 1;
    private int SKILL_NUM1 = 1;
    private int SKILL_NUM2 = 3;
    private int SKILL_NUM3 = 4;
    private int SKILL_NUM4 = 6;
    static int PLAYER_NUM = 2;
    static int DICE_NUM = 2;

    private int DEATH = 4444;

    static int[] diceSum;

    private int diceNum;
    private int range;
    private int dice;

    public void initDice() {
        range = MAX - MIN + 1;
    }

    public void rollDice() {
        dice = (int) (Math.random() * range + MIN);
    }


    public void rollArry() {
        diceSum = new int[PLAYER_NUM];
    }

    public void player() {
        for (int i = 0; i < PLAYER_NUM; i++) {
            for (int j = 0; j < DICE_NUM; j++) {
                diceSum[i] = dice;
            }
        }
    }

    public void playSum() {
        rollDice();
        player();
        for (int i = 0; i < PLAYER_NUM; i++) {
            for (int j = 0; j < DICE_NUM; j++) {
                dice = (int) (Math.random() * range + MIN);
                diceSum[i] += dice;
            }
            System.out.println((i + 1) + "친구의 합 :" + diceSum[i]);
        }
    }


    public void speacialDice() {
        for (int i = 0; i < PLAYER_NUM; i++) {

            if (diceSum[i] % 2 == 0) {
                dice = (int) (Math.random() * range + MIN);
                System.out.println((i+1)+"의 주사위:"+dice);

                if (dice == SKILL_NUM1) {
                    System.out.println("상대방 주사위 눈금을 2 떨군다.");

                    for (int j = 0; j < PLAYER_NUM; j++) {
                        if (j == i) {
                            continue;
                        }
                        diceSum[j] -= 2;
                    }
                } else if (dice == SKILL_NUM2) {
                    System.out.println("모두 함께 자폭 ^^ -6");

                    for (int j = 0; j < PLAYER_NUM; j++) {
                        diceSum[j] -= 6;
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

                        diceSum[j] -= 3;
                        diceSum[i] += 3;
                    }
                } else {
                    diceSum[i] += dice;
                }
            }
            System.out.println((i+1)+"="+diceSum[i]);
        }
    }

    public void minus(){
        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] < 0) {
                diceSum[i] = 0;
            }
        }
    }

    public void winner(){
        boolean checkWinner = true;

        for (int i = 0; i < PLAYER_NUM; i++) {
            if (diceSum[i] == DEATH) {
                System.out.printf("친구%d가 패배하였습니다!\n", (i+1));
                checkWinner = false;
            }
        }
        if (checkWinner) {
            if (diceSum[0] > diceSum[1]) {
                System.out.println("친구 1 승리!");
            } else if (diceSum[0] < diceSum[1]) {
                System.out.println("친구 2 승리!");
            } else {
                System.out.println("무승부!");
            }
        }

    }

}
/*

 */