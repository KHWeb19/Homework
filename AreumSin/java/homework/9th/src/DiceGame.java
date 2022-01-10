public class DiceGame {

    final int PLAYER = 2;
    final int DICE_NUM =2;
    final int DEATH =4444;

    final int MAX = 6;
    final int MIN = 1;

    int dice, range;

    int[] score;

    public void init_game(){
        range = MAX - MIN +1;
        score = new int[PLAYER];
    }

    public void dice_roll(){ // 주사위 돌리기

        for(int i =0; i < PLAYER; i++){
            for(int j = 0; j < DICE_NUM; j++){
                dice =  (int)(Math.random()* range +MIN);
                score[i] += dice;
                System.out.printf("%d의 주사위 점수 %d \n",i+1, dice);
            }
        }

        System.out.println();
        special_dice();
    }

    public void special_dice(){ // 2짝수일 경우 발동
        for(int i =0; i < PLAYER; i++){

            if(score[i] % 2 == 0){
                dice = (int)(Math.random() * range + MIN);

                if(dice == 1) {
                    System.out.printf("%d 상대 점수를 -2 하겠습니다\n", i + 1);

                    for (int j = 0; j < PLAYER; j++) {
                        if (j == i) {
                            continue;
                        }
                        score[j] -= 2;
                    }
                    System.out.printf("%d의 %d 점수 추가\n", i + 1, dice);
                }else if(dice == 3) {
                    System.out.printf("%d 전부 점수 -6 하겠습니다\n", i + 1);

                    for (int j = 0; j < PLAYER; j++) {
                        score[j] -= 6;
                    }
                    System.out.printf("%d의 %d 점수 추가\n", i + 1, dice);
                }else if(dice == 4) {
                    System.out.printf("%d 당신의 패배할거야\n", i + 1);
                    score[i] = DEATH;
                    System.out.printf("%d의 %d 점수 추가\n", i + 1, dice);
                }else if(dice == 6) {
                    System.out.printf("%d 다른사람 -3 나 +3 갯수\n", i + 1);

                    for (int j = 0; j < PLAYER; j++) {
                        if (i == j) {
                            continue;
                        }
                        score[i] += 3;
                        score[j] -= 3;
                    }
                    System.out.printf("%d의 %d 점수 추가\n", i + 1, dice);
                }else{
                    score[i] += dice;
                    System.out.printf("%d %d만큼 추가\n",i+1, dice);
                    System.out.printf("%d의 %d 점수 추가\n",i+1, dice);
                }
            }
        }

        score_comparison();
    }

    boolean checkWinner = true;
    public void score_comparison(){ // 점수가 음수일경우 0으로
        for(int i =0; i < PLAYER; i++){
            if(score[i] < 0){
                score[i] = 0;
            }
        }
    }

    String win;
    public String winner(){ // 승리 결과
        if(checkWinner){
            if (score[0] > score[1]){
                win = "플레이어 1이 승리";
            }else if(score[0] < score[1]){
                win = " 플레이어 2가 승리";
            }else
                win = "무승부";
        }

        return win;
    }
}
