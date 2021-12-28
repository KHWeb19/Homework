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
         */
        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN +1;

        int [] ply1 = new int[2];
        int [] ply2 = new int[2];

        int dice1, dice2;
        int sum1 =0, sum2 =0;

            for (int i = 0; i < 2; i++){
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
        }else if(sum1 > sum2){
            System.out.println("1번 승리");
        }else if (sum1 < sum2){
            System.out.println("2번 승리");
        }
    }
}
