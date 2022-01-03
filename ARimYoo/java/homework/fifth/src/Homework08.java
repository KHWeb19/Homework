public class Homework08 {
    public static void main(String[] args) {

        // 2명이 주사위 게임을 한다. (배열 활용)
        // 주사위는 각자 2개씩 굴릴 수 있다.
        // 처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
        // 한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
        // (특수 스킬 주사위는 1번만 굴린다)
        // 이 특수 스킬들은 1, 3, 4, 6에서 동작한다.
        //   1번의 경우 상대방의 주사위 눈금을 2 떨군다.
        //   3번의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
        //   4번의 경우 그냥 패배 처리한다.
        //   6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
        //   2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다.


        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;

        // 주사위 굴리기 = 랜덤
        // 풀어보긴 했는데 전혀 배열이랑은 관련없는 풀이방식 같습니다 ,,,,

        boolean isRand = true;

        int[] special = {1, 2, 3, 4, 5, 6};

        while (isRand) {

            // 각 플레이어의 주사위 수 구하기

            int rand1 = (int) (Math.random() * range + MIN);
            int rand2 = (int) (Math.random() * range + MIN);

            int dice1 = rand1 + rand2;

            int rand3 = (int) (Math.random() * range + MIN);
            int rand4 = (int) (Math.random() * range + MIN);

            int dice2 = rand3 + rand4;

            // 주사위의 값이 짝수라면 ~ 해당 조건들 실행

            if (dice1 % 2 == 0) {

                System.out.println("A의 주사위의 값 : " + dice1);
                System.out.println("B의 주사위의 값 : " + dice2);

                rand1 = (int) (Math.random() * range + MIN);
                System.out.println("A의 특수 주사위의 값 : " + rand1);

                // 다시 돌린 랜덤값이 special의 값과 같다면 (특수주사위 조건 발동)
                if (rand1 == special[0]) {

                    dice2 = dice2 - 2;

                    System.out.printf("내 주사위의 값 : %d, 상대방 주사위의 값 : %d\n", dice1, dice2);

                } else if (rand1 == special[1]) {

                    dice1 = dice1 + rand1;

                    System.out.printf("내 주사위의 값 : %d, 상대방 주사위의 값 : %d\n", dice1, dice2);

                } else if (rand1 == special[2]) {

                    dice1 = (dice1 - 6);
                    dice2 = (dice2 - 6);

                    System.out.printf("내 주사위의 값 : %d, 상대방 주사위의 값 : %d\n", dice1, dice2);

                } else if (rand1 == special[3]) {

                    System.out.println("패배했습니다");

                } else if (rand1 == special[4]) {

                    dice1 = dice1 + rand1;

                    System.out.printf("내 주사위의 값 : %d, 상대방 주사위의 값 : %d\n", dice1, dice2);

                } else if (rand1 == special[5]) {

                    dice2 = dice2 - 3;
                    dice1 = dice1 + 3;

                    System.out.printf("내 주사위의 값 : %d, 상대방 주사위의 값 : %d\n", dice1, dice2);

                }

                if (dice1 > dice2) {
                    System.out.println("승리했습니다");
                } else if (dice1 == dice2) {
                    System.out.println("무승부입니다");
                } else {
                    System.out.println("패배했습니다");
                }

                    isRand = false;

                }


            }
        }
    }


