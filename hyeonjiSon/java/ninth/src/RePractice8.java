public class RePractice8 {
    public static void main(String[] args) {
        //복습 포인트!
        //1. 배열을 적용하여 중복패턴을 개선해보자
        //   point.  ex)  for (int i = 0; i < 2; i++) {
        ////          for (int j = 0; j < 2; j++) {
        ////              ~~~~~
        ////              이 케이스는 실제 i, j가 분리된 형식으로
        ////              for 문 내부에서 또 다른 for 문을 돌리기 위함
        //----------------------------------------------------------

        //1. 2명의 플레이어가 2D6 주사위를 굴린다.

        final int PLAYER = 2;
        final int DICENUM = 2;

        //  1-1. 2D6 주사위를 만들어준다.
        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;
        int dice;

        int firstDice;
        int diceSum[] = new int[PLAYER];

        //  1-2. 2명의플레이어가 for문 안에서 2D6 주사위를 굴려준다.(플레이어 i, 플레이어 j)
        for (int i = 0; i < PLAYER; i++) { // 플레이어 2명 분의 주사위를 굴리기 위한 반복문
            for (int j = 0; j < DICENUM; j++) { // 육면체 주사위리를 2번 굴리기 위한 반복문
                dice = (int) (Math.random() * range + MIN);
                diceSum[i] += dice;
                // 배열을 사용하여 dice1 이 출력한 결과를 firstDiceSum[i]에 저장하면
                // 2번째 반복 때 누적되었던 결과와 새로 뽑은 수가 합쳐져 2D6 주사위가 된다.
            }
            //  1-3. 처음 굴린 주사위 2D6(x2)의 값을 출력한다.
            System.out.printf("1회차. 플레이어[%d]의 주사위 값은 = %d\n", i + 1, diceSum[i]);
        }

//------------------------------------------------------------------------------------------------------

        //2. 2D6의 결과가 짝수인 경우(2, 4, 6, 8, 10, 12) 육면체 주사위를 한 개를 추가로 굴릴 수 있는 조건문을 만든다.
        //라고 생각했지만 if 안에는 배열[i]가 들어가지 않는 것 같은데 맞나요?
        //2번(플레이어 숫자만큼) 돌아가는 for 반복문을 만들어주자.

            for (int i = 0; i < PLAYER; i++) {
                //3. 이제 여기에 진짜 처음 굴린 주사위 2개를 합친 값이 짝수인 경우
                //육면체 주사위를 한 개 더 추가로 굴릴 수 있는 if 조건문을 만들어준다.

                if (diceSum[i] % 2 == 0) {
                    System.out.printf("짝수가 나온 플레이어[%d]는 육면체 주사위를 한 번 더 굴릴 수 있습니다!\n", i + 1);
                    dice = (int) (Math.random() * range + MIN);

                    System.out.printf("2회차. 플레이어[%d]의 주사위 값은 = %d\n", i + 1, diceSum[i]);

                    // 이제 세번째 주사위 눈의 결과가 1, 3, 4, 6인 경우 특수한 스킬을 넣어준다.
                    //주사위 값, 플레이어 1 = firstDiceSum[i], 플레이어 2 = firstDiceSum[i+1] 이라는 걸 잘 기억하자)

                    if (dice == 1) { //dice 3 결과가 1, 3, 4, 6인 경우 특수한 스킬을 넣어준다.
                        //     1의 경우 상대방의 주사위 눈금을 2 떨군다.
                        System.out.printf("특수스킬1. 플레이어[%d]의 가 상대의 주사위 눈금을 2 떨어트립니다.\n", i + 1);

                        for (int j = 0; j < PLAYER; j++) {
                            if (j == i) {
                                continue; // = 반복문 끝으로 이동하여 다음 반복으로 넘어가게 해주는 것
                            }
                            diceSum[j] -= 2; //상대의 주사위 눈금을 2 떨어트림
                        }

                    } else if (dice == 3) { //     3의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
                        System.out.printf("특수스킬2. 플레이어[%d]의 가 전원의 주사위 눈금을 6 떨어트립니다.\n", i + 1);
                        for (int j = 0; j < PLAYER; j++) { // int i로 설정해뒀더니
                            // 조건식을 통과하지 못한 주사위결과도 들어와서 같이 돌아감...!
                            diceSum[j] -= 6;
                        }
                    } else if (dice == 4) {  //     4의 경우 그냥 패배 처리한다.
                        System.out.printf("특수스킬3. 플레이어[%d]가 무조건 패배합니다. 게임종료\n", i + 1);
                        break;

                    } else if (dice == 6) {    //     6의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
                        System.out.printf("특수스킬4. 플레이어[%d]의 가 모든 상대의 눈금을 3씩 빼앗습니다.\n", i + 1);
                        for (int j = 0; j < PLAYER; j++) {
                            if (j == i) {
                                continue;
                            }
                            diceSum[j] -= 3;
                            diceSum[i] += 3; // 플레이어 숫자만큼 반복되는 for문이니까 +3도 누적되는구나.
                        }


                    } else { //2, 5는 평범하게 diceSum(dice1 + dice2) 결과에 + dice3 해준다.
                        System.out.printf("특수스킬X. 플레이어[%d]의 두 번째 주사위 결과가 더해집니다 + %d\n", i + 1, dice);
                        diceSum[i] += dice; // 플레이어 숫자만큼 반복되는 for문이니까 +3도 누적되는구나.
                    }
                }
            }

            for (int i = 0; i < PLAYER; i++) {
                System.out.printf("최종 합계. 플레이어[%d]의 주사위 값은 = %d\n", i + 1, diceSum[i]);
            }


        }

}
