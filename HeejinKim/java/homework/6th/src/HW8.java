public class HW8 {
    public static void main(String[] args) {
        /* 2명이 주사위 게임을 한다. (배열 활용)
     주사위는 각자 2개씩 굴릴 수 있다.
     처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
     (2, 4, 6, 8, 10, 12)
     한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
     (특수 스킬 주사위는 1번만 굴린다)
     이 특수 스킬들은 1, 3, 4, 6에서 동작한다.
     1번의 경우 상대방의 주사위 눈금을 2 떨군다.
     3번의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
     4번의 경우 그냥 패배 처리한다.
     6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
     2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다.*/
        //1.2명의 플레이어의 배열을 만든다
        //2.주사위는 랜덤으로 정해진다
        //3. 짝수라면.....if절 사용

        final int PLAYER = 2;
        final int DICE_NUM = 2;
        final int DICE_MAX = 6;
        final int DICE_MIN = 1;

        final int DEATH = 4141;

        int range = DICE_MAX - DICE_MIN + 1;

        int[] diceSum = new int[PLAYER];
        int dice;


        for (int i = 0; i < PLAYER; i++) {
            for (int j = 0; j < DICE_NUM; j++) {

                dice = (int) (Math.random() * range + DICE_MIN);
                dice += j;
                diceSum[i] = dice;

            }
        }

        for (int i = 0; i < PLAYER; i++) {
            if (diceSum[i] % 2 == 0) {
                dice = (int) (Math.random() * range + DICE_MIN);

                if (dice == 1) {                        //남의 수를 어떻게 -2를 떨어뜨리지?, 상대방은 어떻게 정의하나?
                    System.out.println("상대방 주사위 눈금 -2");
                    //안되겠다.. 상대방과 나를 분리하자
                    //int player1_Sum ,player2_Sum 그럼 하나부터 다고쳐야하는데..흠 어떻게 할까
                    for (int j = 0; j < PLAYER; j++) {
                        if (i != j) {

                            diceSum[j] -= 2;
                        }
                    }
                } else if (dice == 3) {
                    System.out.println("다같이 -6!");
                    for (int j = 0; j < DICE_NUM; j++) {
                        diceSum[j] -= 6;

                    }
                } else if (dice == 4) {
                    System.out.println("나만 die!");
                    diceSum[i] = DEATH;
                } else if (dice == 6) {
                    System.out.println("상대방꺼 -3 내꺼 +3");
                    for (int j = 0; j < DICE_NUM; j++) {
                        diceSum[j] -= 3;
                        diceSum[i] += 3;
                    }
                } else if (dice == 2) {
                    diceSum[i] += 2;
                } else if (dice == 5) {
                    diceSum[i] += 2;


                }

            }
        }

        //이제 음수 처리랑 결과를 내야함.


        for (int j = 0; j < DICE_NUM; j++) {
            if (diceSum[j] < 0) {
                diceSum[j] = 0;   //if문 을  사용하여 음수가 나올경우 0으로 만들어줌
            }

        }

        //결과를 내야되는데 //여기에 또 4가 나와서 내가 바로 지는 경우 추가 ....선생님의 코드를 보고 정리함
        boolean check = true;

        for (int i = 0; i < PLAYER; i++) {// 플레이어들이 순서대로 하는 동안


            if (diceSum[i] == DEATH) {    //diceSum이 death가 나오면 끝!이라고 해서 check라는 boolean이 false가 되니
                                          // 밑의 if절을 돌지 않음. 바로 결과가 나옴.
                System.out.printf("플레이어[%d]가 패배하였습니다\n", i);  //이렇게 바로 출력이 되는건  먼저 한 사람이 불리한듯..
                                                                     //둘다 이렇게 죽을수도 있는데 ..
                                                                     // 순서가 상관이 없다면 다시 boolean을 설정해서 만들어줘야겠지...?
                check = false;
            }
        }
        if (check) {
            if (diceSum[0] > diceSum[1]) { //그런데 보통이렇게 결과를 선언할때는  diceSum[0], diceSum[1] 처럼 직접 인덱스를 넣어주는 것일까?
                                           //편하긴 하지만 나중에 플레이어가 추가되면 이쪽은 다시 이렇게 작업을 해줘야하나?
                System.out.println("플레이어1의 승리!!");
            } else if (diceSum[0] == diceSum[1]) {
                System.out.println("무승부!!!");
            } else {
                System.out.println("플레이어2의 승리!!!");
            }

        }

    }
}




