public class hw8 {
    public static void main(String[] args) {

        final int MAX = 6, MIN = 1;
        final int range = MAX - MIN;
        final int game_num = 3;
        final int user_num = 2;

        int [] score_sum = new int [user_num];

        int a=0;
        while ( a++ < game_num) {
            System.out.printf("\n\n===========%d번째 게임===========\n", a+1);

                for (int i=0; i<user_num; i++) {
                    int dice1 = (int) (Math.random() * range + MIN);
                    int dice2 = (int) (Math.random() * range + MIN);

                    score_sum[i] += dice2+ dice1;
                    System.out.printf("<User%d차례> 주사위2개를 굴리세요 : %d + %d = %d\n", i+1, dice1, dice2, (dice1 + dice2));

                    if ((dice1 + dice2) % 2 == 0) {
                            int diceSpecial = (int) (Math.random() * range + MIN);
                            System.out.printf("짝수입니다!특별한 주사위를 굴리세요 : %d\n", diceSpecial);

                            if (diceSpecial == 1) {
                                for(int j=0; j<user_num; j++){
                                    if (j==i) {
                                        break;
                                    }
                                    else
                                        score_sum[j] -=2;
                                }
                                System.out.printf("상대방을 -2점 하세요. user%d 점수 : %d\n", i+1, score_sum[i]);
                            }
                            else if (diceSpecial == 3) {
                                for (int j =0; j<user_num; j++){
                                    score_sum[j] -=6;
                                    if (score_sum[j] < 0) {
                                        score_sum[j] = 0;
                                    }
                                }
                                System.out.printf("모두 -6을 하세요. user%d의 점수 : %d\n", i+1, score_sum[i]);
                            }
                            else if (diceSpecial == 4) {
                                System.out.printf("*****USER %d 패배\n", i+1);
                            }
                            else if (diceSpecial == 6) {
                                for(int j=0; j<user_num; j++){
                                    if (j==i){
                                        score_sum[j] +=3;
                                    }
                                    else{
                                        score_sum[j] -=3;
                                    }
                                }
                                System.out.printf("user%d의 점수 : %d\n",i+1, score_sum[i]);
                            }
                            else{
                                score_sum[i] += diceSpecial;
                                System.out.printf("user%d의 점수 : %d\n",i+1, score_sum[i]);
                            }
                    }
                    else {
                        System.out.printf("user%d의 점수 : %d\n", i+1, score_sum[i]);
                    }
                }
        }
        System.out.println("\n\n===최종점수===");
        System.out.printf("user1 점수 : %d\n user2 점수 : %d\n",score_sum[0], score_sum[1]);

        boolean winnerCheck = true;
        if (winnerCheck){
           if(score_sum[0] > score_sum[1]){
               System.out.println("user1 승리");
           }
           else if (score_sum[0] < score_sum[1]){
               System.out.println("user2 승리");
           }
           else{
               System.out.println("무승부");
           }
        }
    }
}