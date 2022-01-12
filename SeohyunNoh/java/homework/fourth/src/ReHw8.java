public class ReHw8 {
    public static void main(String[] args) {
        final int PLYR_NUM = 2;
        final int DICE_NUM = 2;

        final int SKILL_NUM1 = 1;
        final int SKILL_NUM2 = 3;
        final int SKILL_NUM3 = 4;
        final int SKILL_NUM4 = 6;

        final int DEATH = 4444;

        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;

        int dice = 0;
        int[] diceSum = new int[PLYR_NUM];

        // 두명의 플레이어가 두개의 주사위를 돌림
        for(int i = 0 ; i < PLYR_NUM; i++){
            for(int j = 0 ; j < DICE_NUM ; j++){
                dice = (int)(Math.random() * range + MIN);
                diceSum[i] += dice;
            }
        }

        for(int i = 0; i < PLYR_NUM; i++){
            if(diceSum[i] % 2 == 0){
                dice = (int)(Math.random() * range + MIN);

                if(dice == SKILL_NUM1){
                    System.out.println("상대방 주사위 눈금을 2 떨군다.");

                    for(int j = 0; j < PLYR_NUM; j++){
                        if(j == i){
                            continue; // skip
                        }
                        diceSum[j] -= 2;
                    }
                } else if(dice == SKILL_NUM2){
                    System.out.println("모두 함께 -6");

                    for(int j = 0 ; j < PLYR_NUM ; j++){
                        diceSum[j] -= 6;
                    }
                } else if(dice == SKILL_NUM3){
                    System.out.println("그냥 패배");

                    diceSum[i] = DEATH;
                } else if(dice == SKILL_NUM4){
                    System.out.println("모두에게 3을 뺏어서 내거에 더하기");

                    for(int j = 0; j < PLYR_NUM ; j++){
                        if(i == j) {
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

        for(int i = 0; i < PLYR_NUM; i++){
            if(diceSum[i] < 0){
                diceSum[i] = 0;
            }
            System.out.printf("dice[%d] = %d\n", i, diceSum[i]);
        }

        boolean checkWinner = true;

        for(int i = 0; i < PLYR_NUM; i++){
            if(diceSum[i] == DEATH){
                System.out.printf("플레이어 %d가 패배하였습니다", i);
                checkWinner = false;
            }
        }

        if(checkWinner){
            if(diceSum[0] > diceSum[1]){
                System.out.println("플레이어 1 승리");
            } else if(diceSum[0] < diceSum[1]){
                System.out.println("플레이어 2 승리");
            } else{
                System.out.println("무승부");
            }
        }
    }
}
