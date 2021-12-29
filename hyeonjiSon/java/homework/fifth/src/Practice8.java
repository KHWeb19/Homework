public class Practice8 {
    public static void main(String[] args) {
        //문제8. _ 12/28
        //Answer8로 풀이 해주신 거에 비하면 좀 구구절절 코드라 유지보수성은 나쁘지만
        //제가 알아보기 쉬워야 하기도 해서 풀이와 상관없이 제 해석대로 풀어보았습니다.

        //1. 2명의 플레이어가 2D6 주사위를 굴린다.
        final int PLAYER = 2;

        //2D6 주사위를 만들어준다.
        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;

        int dice1, dice2;
        int diceSum1 = 0;
        int diceSum2 = 0;

        for (int i = 0; i < PLAYER; i++) { //2회 루프하는 반복문 - PLAYER i
            //2명의 플레이어가 각각 2D6 주사위를 굴려준다.
            dice1 = (int) (Math.random() * range + MIN);
            diceSum1 += dice1;
        }
        System.out.printf("플레이어 [1]의 주사위 값 = %d\n", diceSum1);

        for (int i = 0; i < PLAYER; i++) { //2회 루프하는 반복문 - PLAYER j
            //2명의 플레이어가 각각 2D6 주사위를 굴려준다.
            dice2 = (int) (Math.random() * range + MIN);
            diceSum2 += dice2;
        }
        System.out.printf("플레이어 [2]의 주사위 값 = %d\n\n", diceSum2);

// -------------------------------------------------------------------------------
        //2. 2D6 결과가 짝수인 경우(2,4,6,8,10,12) 한번 더 굴릴 육면체 주사위를 만든다.
        int dice3;
        int dice4;

// PLAYER i (1) -------------------------------------------------------------------------------
        if (diceSum1 == 2 || diceSum1 == 4 || diceSum1 == 6 || diceSum1 == 8 || diceSum1 == 10 || diceSum1 == 12) {
            dice3 = (int) (Math.random() * range + MIN);
            System.out.println("플레이어 [1]이 주사위 한 개를 추가로 굴립니다.");
            System.out.println("결과 = " + dice3);


            if (dice3 == 1) { //dice 3 결과가 1, 3, 4, 6인 경우 특수한 스킬을 넣어준다.
                //     1의 경우 상대방의 주사위 눈금을 2 떨군다.
                System.out.println("특수스킬 1. 플레이어 [2]의 주사위 값이 -2 됩니다.");
                diceSum2 -= 2;

            } else if (dice3 == 3) { //     3의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
                System.out.println("특수스킬2. 플레이어 전원의 주사위 값이 -6 됩니다.");
                diceSum1 -= 6;
                diceSum2 -= 6;

            } else if (dice3 == 4) {  //     4의 경우 그냥 패배 처리한다.
                System.out.println("특수스킬3. 플레이어 [1]의 패배입니다.");
                diceSum1 -= diceSum1;

            } else if (dice3 == 6) {    //     6의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
                System.out.println("특수스킬4. 플레이어 [2]의 주사위 값 3을 플레이어 [1]이 빼앗습니다.");
                diceSum2 -= 3;
                diceSum1 += 3;

            } else { //2, 5는 평범하게 diceSum(dice1 + dice2) 결과에 + dice3 해준다.
                System.out.println("특수스킬x. 플레이어 [1]의 주사위 값에 " + dice3 + "의 수가 더해집니다.");
                diceSum1 += dice3;
            }
        }

        System.out.printf("플레이어 [1]의 최종 주사위 값의 합 = %d\n\n", diceSum1);


// PLAYER j (2) -------------------------------------------------------------------------------
        if (diceSum2 == 2 || diceSum2 == 4 || diceSum2 == 6 || diceSum2 == 8 || diceSum2 == 10 || diceSum2 == 12) {
            dice4 = (int) (Math.random() * range + MIN);
            System.out.println("플레이어 [2]가 주사위 한 개를 추가로 굴립니다.");
            System.out.println("결과 = " + dice4);


            if (dice4 == 1) { //dice 3 결과가 1, 3, 4, 6인 경우 특수한 스킬을 넣어준다.
                //     1의 경우 상대방의 주사위 눈금을 2 떨군다.
                System.out.println("특수스킬 1. 플레이어 [1]의 주사위 값이 -2 됩니다.");
                diceSum1 -= 2;

            } else if (dice4 == 3) { //     3의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
                System.out.println("특수스킬2. 플레이어 전원의 주사위 값이 -6 됩니다.");
                diceSum1 -= 6;
                diceSum2 -= 6;

            } else if (dice4 == 4) {  //     4의 경우 그냥 패배 처리한다.
                System.out.println("특수스킬3. 플레이어 [2]의 패배입니다.");
                diceSum2 -= diceSum2;

            } else if (dice4 == 6) {    //     6의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
                System.out.println("특수스킬4. 플레이어 [1]의 주사위 값 3을 플레이어 [2]이 빼앗습니다.");
                diceSum1 -= 3;
                diceSum2 += 3;

            } else { //2, 5는 평범하게 diceSum(dice1 + dice2) 결과에 + dice4 해준다.
                System.out.println("특수스킬x. 플레이어 [2]의 주사위 값에 " + dice4 + "의 수가 더해집니다.");
                diceSum2 += dice4;
            }
        }

        System.out.printf("플레이어 [2]의 최종 주사위 값의 합 = %d\n\n", diceSum2);

// 결과 안내-------------------------------------------------------------------------------

        if (diceSum1 == diceSum2) {
            System.out.printf("플레이어 [1]의 주사위 값은 [%d],플레이어 [2]의 주사위 값은 [%d],\n", diceSum1, diceSum2);
            System.out.println("주사위 게임의 결과는 무승부 입니다.");
        } else if (diceSum1 < diceSum2) {
            System.out.printf("플레이어 [1]의 주사위 값은 [%d], 플레이어 [2]의 주사위 값은 [%d],\n", diceSum1, diceSum2);
            System.out.println("주사위 게임의 승자는 플레이어 [2] 입니다.");
        } else if (diceSum1 > diceSum2) {
            System.out.printf("플레이어 [1]의 주사위 값은 [%d], 플레이어 [2]의 주사위 값은 [%d],\n", diceSum1, diceSum2);
            System.out.println("주사위 게임의 승자는 플레이어 [1] 입니다.");
        } else {
        }
    }
}
