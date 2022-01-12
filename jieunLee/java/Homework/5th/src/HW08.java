public class HW08 {
    public static void main(String[] args) {
        //8. 2명이 주사위 게임을 한다. (배열 활용)

        //1) 유저마다 주사위를 여러개 굴려서 나온 합을 배열에 넣기
        //2) 합이 짝수면 특수 주사위 돌리기
        //3) 특수값에 따라 점수 바꾸기
        //4) 점수가 0 아래로 떨어지면 0으로 만들기
        //5) 점수에 따라 승패 정하기

        final int PLAYER_NUM = 2;
        final int DICE_NUM = 2;
        int[] diceSum = new int[PLAYER_NUM];
        int rand;
        boolean isWinner = true;

        System.out.println("두개의 주사위를 던집니다.");
        for (int i=0; i<PLAYER_NUM; i++) {
            for (int j=0; j<DICE_NUM; j++) {
                rand = (int) (Math.random() * 6 + 1);
                diceSum[i] += rand;
            }
            System.out.printf("유저%d= %d\n", i, diceSum[i]);
        }

        for (int i=0; i<PLAYER_NUM; i++) {
            if (diceSum[i] % 2 == 0) {
                rand = (int) (Math.random() * 6 + 1);
                System.out.printf("특수 주사위를 던집니다. (유저%d= %d)\n", i, rand);
                if (rand == 1) {
                    System.out.println("상대방의 주사위 눈금을 2 떨군다.");
                    for (int j=0; j<PLAYER_NUM; j++) {
                        if (j != i) {
                            diceSum[j] -= 2;
                        }
                    }
                } else if (rand == 3) {
                    System.out.println("다 같이 -6을 적용한다.");
                    for (int j=0; j<PLAYER_NUM; j++) {
                        diceSum[j] -= 6;
                    }
                } else if (rand == 4) {
                    System.out.println("DIE");
                    isWinner = false;
                } else if (rand == 6) {
                    System.out.println("모든 상대방에게 3을 뺏어서 내거에 3을 더한다.");
                    for (int j=0; j<PLAYER_NUM; j++) {
                        if (j != i) {
                            diceSum[i] += 3;
                            diceSum[j] -= 3;
                        }
                    }
                } else {
                    System.out.println("그냥 특수 스킬이 동작하지 않고 단순히 더해진다.");
                    diceSum[i] += rand;
                }
            }
        }

        for (int i=0; i<PLAYER_NUM; i++) {
            if (diceSum[i]<0) {
                diceSum[i]=0;
            }
        }

        if (isWinner) {
            if (diceSum[0]>diceSum[1]) {
                System.out.println("유저0가 승리하였습니다.");
                System.out.println("유저1가 패배하였습니다.");
            } else if (diceSum[0]<diceSum[1]) {
                System.out.println("유저0가 패배하였습니다.");
                System.out.println("유저1가 승리하였습니다.");
            } else {
                System.out.println("무승부입니다.");
            }
        }
    }
}
