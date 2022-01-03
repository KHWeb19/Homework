import java.util.stream.IntStream;

public class HW08 {
    // player1 vs player2 주사위 던지기
    // 주사위는 총 2개 첫번째 트라이에서 주사위합이 짝수가 나왔다면, 특수 스킬 주사위를 굴린다
    // 특수 스킬 주사위는 1번만 굴린다
    // 1,3,4,6 경우 동작
    // 1은 상대방 주사위 눈금 -2
    // 3은 다같이 -6, 결과는 0이하로 떨어지지않는다
    // 4는 나의 패배
    // 6 상대방의 3을 뺏어서 내 합에 더한다
    // 2,5는 내 합에 더한다

    public static void main(String[] args) {

        int[] player1 = new int[2];
        int[] player2 = new int[2];

        player1[0] = (int)(Math.random()*6+1);
        player1[1] = (int)(Math.random()*6+1);

        player2[0] = (int)(Math.random()*6+1);
        player2[1] = (int)(Math.random()*6+1);

        int sum1 = IntStream.of(player1).sum();
        int sum2 = IntStream.of(player2).sum();

        System.out.printf("플레이어1의 주사위: %d, %d, 합: %d\n", player1[0], player1[1], sum1);
        System.out.printf("플레이어2의 주사위: %d, %d, 합: %d\n", player2[0], player2[1], sum2);


        int playerOneSpecial=0 , playerTwoSpecial = 0;

        boolean playerOneLose = false, playerTwoLose = false;

        if (sum1 % 2 == 0){
            System.out.println("\n플레이어1의 주사위 눈금: " + sum1 + ". 특수 주사위를 굴립니다");
            int specialDice = (int)(Math.random()*6+1);
            System.out.printf("플레이어1이 뽑은 특수 주사위: %d\n", specialDice);
            
            if(specialDice == 1){
                System.out.println("플레이어2의 주사위를 2 깎았습니다");
                playerTwoSpecial -= 2;
            }
            else if (specialDice == 3){
                System.out.println("무승부 전략이 발동시킵니다");
                playerOneSpecial -= 6;
                playerTwoSpecial -= 6;
            }
            else if (specialDice ==4){
                System.out.println("플레이어2가 특수 주사위에서 4를 뽑지 않는 이상 자동패배합니다");
                playerOneLose = true;
            }
            else if (specialDice == 6){
                System.out.println("뺏어갈 3이 있는지 확인합니다");
                if (player2[0] == 3){
                    System.out.println("플레이어2로부터 3을 뺏어갑니다");
                    playerOneSpecial += 3;
                    playerTwoSpecial -= 3;
                }
                if (player2[1] == 3){
                    System.out.println("플레이어2로부터 3을 뺏어갑니다");
                    playerOneSpecial += 3;
                    playerTwoSpecial -= 3;
                }
            }
            else{
                System.out.println("플레이어1 주사위 합에 특수주사위 눈금을 더합니다");
                sum1+= specialDice;
            }
        }
        else{
            System.out.println("\n플레이어1 특수 주사위 뽑기에 실패했습니다");
        }

        if (sum2 % 2 == 0){
            System.out.println("\n플레이어2의 주사위 눈금: " + sum2 + ". 특수 주사위를 굴립니다");
            int specialDice = (int)(Math.random()*6+1);
            System.out.printf("플레이어2가 뽑은 특수 주사위: %d\n", specialDice);

            if(specialDice == 1){
                System.out.println("플레이어1의 주사위를 2 깎았습니다");
                playerOneSpecial -= 2;
            }
            else if (specialDice == 3){
                System.out.println("무승부 전략이 발동시킵니다");
                playerOneSpecial -= 6;
                playerTwoSpecial -= 6;
            }
            else if (specialDice ==4){
                System.out.println("플레이어1이 특수 주사위에서 4를 뽑지 않은 이상 자동패배합니다");
                playerTwoLose = true;
            }
            else if (specialDice == 6){
                System.out.println("뺏어갈 3이 있는지 확인합니다");
                if (player1[0] == 3){
                    System.out.println("플레이어1로부터 3을 뺏어갑니다");
                    playerOneSpecial -= 3;
                    playerTwoSpecial += 3;
                }
                if (player1[1] == 3){
                    System.out.println("플레이어1로부터 3을 뺏어갑니다");
                    playerOneSpecial -= 3;
                    playerTwoSpecial += 3;
                }
            }
            else{
                System.out.println("플레이어2 주사위 합에 특수주사위 눈금을 더합니다");
                sum2 += specialDice;
            }
        }
        else{
            System.out.println("\n플레이어2 특수 주사위 뽑기에 실패했습니다");
        }
        System.out.println("\n특수 주사위 사용 결과를 더합니다.");
        sum1 += playerOneSpecial;
        sum2 += playerTwoSpecial;

        if (sum1 < 1){
            sum1 = 1;
        }
        if (sum2<1) {
            sum2=1;
        }

        if (playerOneLose && playerTwoLose){
            System.out.println("\n두 플레이어 모두 특수 주사위에서 4를 뽑았으므로 무승부입니다");
        }
        else if (playerOneLose){
            System.out.println("\n플레이어1이 특수 주사위에서 4를 뽑았으므로 자동패배합니다");
        }
        else if (playerTwoLose){
            System.out.println("\n플레이어2가 특수 주사위에서 4를 뽑았으므로 자동패배합니다");
        }
        else{
            System.out.printf("플레이어1의 주사위 합: %d, 플레이어2의 주사위 합: %d\n", sum1, sum2);
            if (sum1 == sum2){
                System.out.println("무승부입니다");
            }
            else if(sum1>sum2){
                System.out.println("플레이어1의 승리입니다");
            }
            else{
                System.out.println("플레이어2의 승리입니다");
            }
        }

    }
}
