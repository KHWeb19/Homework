public class Quiz8 {
    public static void main(String[] args) {
        /*
        1. 2명이 2개로 주사위 게임 랜덤값 부여
        2. 굴린 주사위의 합이 짝수라면 주사위 한개만 한번더 굴림
        3. 보너스 주사위에는 특수 능력이 있다.
        4. 능력
        1 - 상대방 -2
        2,5 - 무능력
        3 - 둘다 -6
        4 - 패배
        6 - 상대방 -3 자신 +3

        내가 만든 방식은 2명의 게임에서만 사용가능함 -> 인원을 바꿔도 문제가 없도록 다시 제작
         */

        final int PLAYER = 2;
        final int DICENUM = 2;

        final int SKILLNUM1 =1;
        final int SKILLNUM2 =3;
        final int SKILLNUM3 =4;
        final int SKILLNUM4 =6;

        final int DEATH = 4444;

        final int MAX = 6;
        final int MIN = 1;

        int range = MAX - MIN +1;

        int dice;
        int[] diceSum = new int[PLAYER];

        // 플레이어가 각각 주사위를 굴려 합산작업
        for (int i = 0; i < PLAYER; i++){
            for (int j = 0 ; j < DICENUM; j++){
                dice = (int)(Math.random() * range + MIN);
                diceSum[i] += dice;
            }
            System.out.println(i+1 + "번 플레이어의 주사위값 합은 " +diceSum[i]);
        }


        // 합산값이 짝수라면 보너스 기회 작업
        for (int i =0; i < PLAYER; i++){
            // 보너스 주사위 굴리기
            if (diceSum[i] % 2 == 0){
                System.out.println(i+1 + "번 플레이어가 보너스 기회를 얻습니다.");
                dice = (int)(Math.random() * range + MIN);

                if (dice == SKILLNUM1){
                    System.out.println("1번 능력 : 상대방 -2");

                    for (int j = 0; j < PLAYER; j++){
                        if (j == i){
                            continue;
                        }

                        diceSum[j] -= 2;
                    }
                } else if (dice == SKILLNUM2){
                    System.out.println("2번 능력 : 모두 -6");

                    for (int j =0; j < PLAYER; j++){
                        diceSum[j] -= 6;
                    }
                }else if (dice == SKILLNUM3){
                    System.out.println("3번 능력 : 잘 죽어~");
                    diceSum[i] = DEATH;
                }else if (dice == SKILLNUM4){
                    System.out.println("4번 능력 : 3씩 가져온다. ");

                    for (int j = 0 ; j < PLAYER; j++){
                        if ( i == j){
                            continue;
                        }

                        diceSum[j] -= 3;
                        diceSum[i] += 3;
                    }
                }else {
                    diceSum[i] += dice;
                }
            }
        }

        // 음수는 0으로 바꾸기
        for (int i = 0; i < PLAYER; i ++){
            if (diceSum[i] <0){
                diceSum[i] =0 ;
            }
            System.out.printf("%d번 플레이어의 주사위 합은 %d\n", i+1, diceSum[i]);
        }

        boolean CheckWinner = true;

        // 패배 주사위 작업
        for (int i = 0; i < PLAYER; i++) {
            if (diceSum[i] == DEATH){
                System.out.printf("플레이어 %d 패배\n", i);
                CheckWinner = false;
            }
        }

        // 승무패 작업
        if (CheckWinner){
            if (diceSum[0] > diceSum[1]){
                System.out.println("플레이어 1 승리");
            }else if (diceSum[0] < diceSum[1]){
                System.out.println("플레이어 2 승리");
            }else{
                System.out.println("무승부");
            }
        }
    }
}



        /*
        final int PLAYER = 2;
        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN +1;

        int [] ply1 = new int[2];
        int [] ply2 = new int[2];

        int dice1, dice2;
        int sum1 =0, sum2 =0;

            for (int i = 0; i < PLAYER; i++){
                dice1 = (int)(Math.random() * range +MIN);
                ply1[i] = dice1;
                sum1 += ply1[i];
                dice2 = (int)(Math.random() * range +MIN);
                ply2[i] = dice2;
                sum2 += ply2[i];
            }

            System.out.println("1번 플레이어의 주사위값 합은 " +sum1);
            System.out.println("2번 플레이어의 주사위값 합은 " +sum2);

            if (sum1 % 2 == 0){
                System.out.println("1번 플레이어가 보너스 기회를 얻었습니다.");
                dice1 = (int)(Math.random() * range +MIN);
                System.out.println("1번 플레이어가 다시 굴린 주사위값은" +dice1);

                if (dice1 == 1){
                    sum2 -= 2;
                    System.out.println("1번 능력 : 상대방 -2");
                }else if (dice1 == 3){
                    sum1 -= 6;
                    sum2 -= 6;
                    System.out.println("3번 능력 : 모두 -6");
                } else if (dice1 == 4){
                    sum1 -= 1000;
                    System.out.println("4번 능력 : 패배");
                } else if (dice1 == 6){
                    sum2 -= 3;
                    sum1 += 3;
                    System.out.println("6번 능력 : 상대방 3점 가져오기");
                } else if (dice1 == 2 || dice1 == 5){
                    System.out.println("보너스 기회 날아감");
                }
            }

            if (sum2 % 2 == 0){
                System.out.println("2번 플레이어가 보너스 기회를 얻었습니다.");
                 dice2 = (int)(Math.random() * range +MIN);
                 System.out.println("2번 플레이어가 다시 굴린 주사위값은" +dice2);

                if (dice2 == 1){
                    sum1 -= 2;
                     System.out.println("1번 능력 : 상대방 -2");
                 }else if (dice2 == 3){
                    sum1 -= 6;
                    sum2 -= 6;
                    System.out.println("3번 능력 : 모두 -6");
                 } else if (dice2 == 4){
                    sum2 -= 1000;
                    System.out.println("4번 능력 : 패배");
                } else if (dice2 == 6){
                    sum1 -= 3;
                    sum2 += 3;
                    System.out.println("6번 능력 : 상대방 3점 가져오기");
                 }else if (dice2 == 2 || dice2 == 5){
                    System.out.println("보너스 기회 날아감");
                }
              }
        System.out.println("1번 플레이어 최종 점수는 " +sum1);
        System.out.println("2번 플레이어 최종 점수는 " +sum2);
        if (sum1 == sum2){
            System.out.println("무승부");
        }else if(sum1 > sum2 || sum2 < -10){
            System.out.println("1번 승리");
        }else if (sum2 > sum1 || sum1 < -10){
            System.out.println("2번 승리");
        }
        */