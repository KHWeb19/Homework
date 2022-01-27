public class Num8Again {
    public static void main(String[] args) {
         /*  2명이 주사위 게임을 한다. (배열 활용)
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
            2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다. */

        // 배열을 만들기 플레이어 2명의 배열 - 그 값 안에 주사위 합 넣을 예정
        // 랜덤수 만들기1~6
        // 두명이서 주사위를 두번 던져서 나오는 합산이 짝수라면 특수 주사위 발동
        // 특수 주사위를 플레이어가 던질 수 있는거니까 for문 2번 진행.
        // 0 이하로 떨어지면 무승부.. 승패 결과 확인, 4번 패배처리 해결

        final int PLAYER = 2;
        final int DICE_NUM = 2;
        int [] diceSum = new int[PLAYER];

        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN +1;
        int dice = 0;

        final int NUM1 = 1;
        final int NUM3 = 3;
        final int NUM4 = 4;
        final int NUM6 = 6;
        final int DEATH = 4444;

        for(int i=0;i<PLAYER;i++){
            for(int j=0;j<DICE_NUM;j++){
                dice = (int)(Math.random()*range+MIN);
                diceSum[i] += dice;
            }
            System.out.println("diceSum["+i+"]"+diceSum[i]);
        }

        for (int i=0;i<PLAYER;i++){
            if(diceSum[i]%2==0){
                dice = (int)(Math.random()*range+MIN);
                System.out.println(i+"가 특수주사위를 던짐 : " +dice);

                if(dice==NUM1){//1번의 경우 상대방의 주사위 눈금을 2 떨군다.
                    System.out.println("상대방의 주사위 눈금을 2 떨군다.");

                    for(int j=0;j<PLAYER;j++){
                        if(i==j){
                            continue;
                        }else
                            diceSum[j] -=2;
                    }

                }else if (dice == NUM3){
                    System.out.println("다 같이 -6을 적용한다.");
                    for (int j=0;j<PLAYER;j++){
                        diceSum[j] -=6;
                    }
                }else if (dice == NUM4){
                    System.out.println("빠이");
                    diceSum[i] = DEATH;
                }else if (dice == NUM6){//상대방에게 3을 뺏어서 내거에 3을 더한다.
                    System.out.println("나 +3, 너 -3");
                    for(int j=0;j<PLAYER;j++){
                        if(i==j){
                            continue;
                        }else {
                            diceSum[i] += 3;
                            diceSum[j] -= 3;
                        }
                    }
                }else {
                    diceSum[i] +=dice;
                }
            }
        }
        // 0 이하로 떨어지면 무승부.. 승패 결과 확인, 4번 패배처리 해결
        for(int i=0;i<PLAYER;i++){
            if(diceSum[i]<0){
                diceSum[i]=0;
            }
            System.out.printf("dice[%d] = %d\n", i, diceSum[i]);
        }
        boolean checkWinner = true;

        //death검사
        for(int i=0;i<PLAYER;i++){
            if(diceSum[i]==DEATH){
                System.out.println(i+"플레이어가 패했습니다.");
                checkWinner = false;//death면 더이상 승부를 볼 필요가 없다.
            }
        }

        //승부판정
        if(checkWinner){
            if(diceSum[0]>diceSum[1]){
                System.out.println("플레이어 1 승리");
            }else if(diceSum[0]<diceSum[1]){
                System.out.println("플레이어 2 승리");
            }else{
                System.out.println("무승부");
            }
        }
    }
}
