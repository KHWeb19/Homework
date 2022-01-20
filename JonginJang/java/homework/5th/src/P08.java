import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
/*8. 2명이 주사위 게임을 한다. (배열 활용)
   주사위는 각자 2개씩 굴릴 수 있다.
   처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
   (2, 4, 6, 8, 10, 12)
   한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
   (특수 스킬 주사위는 1번만 굴린다
   이 특수 스킬들은 1, 3, 4, 6에서 동작한다.
   1번의 경우 상대방의 주사위 눈금을 2 떨군다.
   3번의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
   4번의 경우 그냥 패배 처리한다.
   6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
   2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다.
 */
        //게임 종료 조건 ??
        //-> 임의로 지정: 3판 2선승
        //기본 규칙: 각 판마다 각자 주사위 2개를 굴려 눈금의 합이 더 큰 사람이 승리한다.
        // 순서 : 플레이어1 -> 플레이어 2
        final int FULLROUD = 3;
        final int WIN = 2;
        //무승부일 때는 해당 라운드를 무효화 처리한다.
        boolean draw = false;
        //두 명의 플레이어의 승점을 기록할 변수 2개 필요
        int p1WinCnt = 0;
        int p2WinCnt = 0;

        //2명이 게임을 하기 때문에 3의 크기를 갖는 배열을 2개 만든다.
        //0번 인덱스가 플레이어1, 1번 인덱스가 플레이어2
        final int PARRMAX = 2; // 임시값 저장하기 때문에 크기 2로 지정
        int playerSum[] = new int[PARRMAX];
        playerSum[0]=0;
        playerSum[1]=0;
        //각 판의 승자의 이름을 저장할 변수 생성
        String winPlayerval = "";
        //각 판에 승리한 사람의 이름을 저장할 배열 생성
        String winPlayer[] = new String[FULLROUD];
        //최종 승리자를 지정할 변수
        String finalWinner = "";
        //주사위값에 해당하는 난수 범위를 지정한다.
        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;
        //각 판마다 기본적으로 굴리는 주사위값 지정
        int dice1 = 0;//(int)(Math.random()*range+MIN);
        int dice2 = 0;//(int)(Math.random()*range+MIN);
        //주사위 값의 합
        int diceSum = 0;
        //특수 주사위
        int specialDice = 0; //(int)(Math.random()*range+MIN);
        //특수 주사위의 눈금값이 4가 될 경우 해당 주사위를 굴린 사람은 패배하고 다음 판으로 넘어감 . 여기에 대한 조건
        boolean specialDice4 = false;
        //특수 주사위 발동 조건
        final int EVENNUM = 2;
        boolean activateSpDice = false;
        // 특수 스킬 적용하기 위해 누구의 턴인지 정의 ..
        int turn = 0;  //초기값 0은 플레이어1, 1로 바뀌면 플레이어2
        //주사위를 굴려도 되는지 결정하는 조건, 각 판이 종료되었는지
        boolean condition = false;
        // 전체 루프는 while로 가두고 3번 반복시킨다.
        // 반복 종료 조건: wincnt라는 변수를 2개 두고 각 플레이어가 이길 때마다 값을 1증가시킨다. 둘 중 먼저 2가 되는 사람이 승리
        // 예외 종료 조건: 주사위값이 4번이 나왔을 경우, 해당 주사위를 굴린 사람이 패배하고 게임이 종료된다.
        //while문을 제어하기 위한 변수 생성
        int round = 0;

        //사용자의 이름을 입력받는다. 이름을 저장할 문자열 변수 선언
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("player1의 이름을 입력해주세요 : ");
        String player1 = scan.next(); // 문자열을 입력받는다. 공백까지 입력받는다.
        System.out.print("player2의 이름을 입력해주세요 : ");
        String player2 = scan.next();
        System.out.printf("-> player1 = %s, player2 = %s\n",player1,player2);
        System.out.println("====================================================");


        while(round < FULLROUD){
            draw = false;
            System.out.println("-----------------------------------------------------");
            System.out.printf("!) %d번째 판이 시작됩니다.\n",round+1);
            //주사위 게임 시작
            // 플레이어 1과 플레이어 2가 순서대로 주사위를 굴린다.
            for(int j=0;j<2;j++){
                System.out.println("-----------------------------------------------------");
                System.out.printf("player%d가 주사위를 굴립니다.\n",j+1);
                dice1 = (int)(Math.random()*range+MIN);
                System.out.printf("첫 번째 주사위의 값 = %d\n",dice1);
                if((dice1%EVENNUM)==0) {
                    activateSpDice = true;
                }
                if(activateSpDice){
                    System.out.println("!) 특수주사위를 굴립니다.");
                    specialDice = (int)(Math.random()*range+MIN);
                    System.out.printf("-> 특수주사위의 눈금값 = %d\n", specialDice);
                    if(specialDice == 1){ // 상대방 주사위 눈금을 2 떨군다.
                        if(turn == 0){
                            playerSum[1]=playerSum[1]-2;
                            System.out.printf("★ 특수스킬1이 발동되어 %s의 눈금값을 2 떨굽니다.. ★\n",player2);
                        }
                        else if(turn == 1){
                            playerSum[0]= playerSum[0]-2;
                            System.out.printf("★ 특수스킬1이 발동되어 %s의 눈금값을 2 떨굽니다.. ★\n",player1);
                        }
                    }
                    else if(specialDice == 3){ // 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다
                        /*if((playerSum[0]>5)&&(playerSum[1]>5)){ // 0이하로 떨어지지 않으려면 최소 6
                            playerSum[0]= playerSum[0]-6;
                            playerSum[1]= playerSum[1]-6;
                            System.out.printf("특수스킬3이 발동되어 %s와 %s의 눈금값이 6 감소됩니다.\n",player1,player2);
                        }
                        else{
                            System.out.println("특수스킬3이 발동되지 않습니다.");
                        }*/
                        System.out.printf("★ 특수스킬3이 발동되어 %s와 %s의 눈금값이 6 감소됩니다. ★\n",player1,player2);
                        playerSum[0]= playerSum[0]-6;
                        playerSum[1]= playerSum[1]-6;
                        //매판마다 바뀌는 임시배열값을 사용해 구현했으므로, 위 주석처리 부분의 스킬은 발동되지 X
                        // 조건없이 발동하는 것으로 수정
                    }
                    else if(specialDice == 4){ //그냥 패배 처리한다
                        if(turn == 0){

                            System.out.printf("★ 특수스킬4가 발동되어 %s가 패배합니다.. ★\n",player1);
                            playerSum[0]=10;// 플레이어2가 이기는 임의값 지정
                            playerSum[1]=11;
                            specialDice4 = true;
                            break;
                        }
                        else if(turn == 1){

                            System.out.printf("★ 특수스킬4가 발동되어 %s가 패배합니다.. ★\n",player2);
                            playerSum[0]=11;// 플레이어1이 이기는 임의값 지정
                            playerSum[1]=10;
                            specialDice4 = true;
                            break;
                        }

                    }
                    else if(specialDice == 6){ //상대방에게 3을 뺏어서 내거에 3을 더한다.
                        if(turn == 0){
                            System.out.printf("★ 특수스킬6이 발동되어 %s의 주사위값 3을 뺏어옵니다. ★\n",player2);
                            playerSum[0]= playerSum[0]+3;
                            playerSum[1]= playerSum[1]-3;

                        }
                        else if(turn == 1){
                            System.out.printf("★ 특수스킬6이 발동되어 %s의 주사위값 3을 뺏어옵니다. ★\n",player1);
                            playerSum[0]= playerSum[0]-3;
                            playerSum[1]= playerSum[1]+3;

                        }

                    }
                    else{ //2,5는 그냥 더해진다.
                        if(turn == 0){
                            System.out.printf("★ 특수스킬%d가 발동되어 특수주사위값%d가 총합에 더해집니다. ★\n",specialDice,specialDice);
                            playerSum[0]= playerSum[0]+specialDice;
                        }
                        else if(turn == 1){
                            System.out.printf("★ 특수스킬%d가 발동되어 특수주사위값%d가 총합에 더해집니다. ★\n",specialDice,specialDice);
                            playerSum[1]= playerSum[1]+specialDice;
                        }

                    }

                }
                if(!specialDice4) {
                    dice2 = (int) (Math.random() * range + MIN);
                    System.out.printf("두 번째 주사위의 값 = %d\n", dice2);
                    diceSum = dice1 + dice2;
                    playerSum[j] += diceSum;
                    System.out.printf("던진 주사위의 총합 = %d\n", playerSum[j]);

                    activateSpDice = false;
                    turn++;
                    System.out.println("-----------------------------------------------------");
                }
            }
            if(playerSum[0]>playerSum[1]){
                winPlayerval = player1;
                p1WinCnt++;
                winPlayer[round] = winPlayerval;
                turn = 0;
                activateSpDice = false;
                specialDice4 = false;
                System.out.println("====================================================");
                System.out.printf("%s의 주사위합 = %d, %s의 주사위합 = %d\n",player1,playerSum[0],player2,playerSum[1]);
                System.out.println("====================================================");
                System.out.printf("%d라운드의 승리자 : %s\n",round+1,winPlayer[round]);
                System.out.printf("현재 %s의 승점 = %d\n",player1,p1WinCnt);
                System.out.printf("!) %d번째 판이 종료되었습니다.\n",round+1);
                System.out.println("====================================================");
                playerSum[0]=0;
                playerSum[1]=0;
            }
            else if(playerSum[0]<playerSum[1]){
                winPlayerval = player2;
                p2WinCnt++;
                turn = 0;
                activateSpDice = false;
                specialDice4 = false;
                winPlayer[round] = winPlayerval;
                System.out.println("====================================================");
                System.out.printf("%s의 주사위합 = %d, %s의 주사위합 = %d\n",player1,playerSum[0],player2,playerSum[1]);
                System.out.println("====================================================");
                System.out.printf("%d라운드의 승리자 : %s\n",round+1,winPlayer[round]);
                System.out.printf("현재 %s의 승점 = %d\n",player2,p2WinCnt);
                System.out.printf("!) %d번째 판이 종료되었습니다.\n",round+1);
                System.out.println("====================================================");
                playerSum[0]=0;
                playerSum[1]=0;
            }
            else{
                draw = true;
                turn = 0;
                System.out.println("====================================================");
                System.out.printf("!) 무승부입니다! %d라운드를 다시 진행합니다\n",round+1);
                System.out.println("====================================================");
                playerSum[0]=0;
                playerSum[1]=0;
            }

            if((p1WinCnt==WIN)||(p2WinCnt==WIN)){
                break;
            }
            else{
                if(draw){
                    round--;
                }
                round++;
            }
        }
        if(p1WinCnt==2){
            finalWinner = player1;
        }
        else if(p2WinCnt == 2){
            finalWinner = player2;
        }
        System.out.println("- 승부 기록 -");
        for(int j = 0 ; j<3  ; j++){
            System.out.printf("%d번째 판 승리자: %s / ",j+1,winPlayer[j]);
        }
        System.out.println("\n-------------------------------------------");
        System.out.printf("-> 최종 승리자는 %s입니다!",finalWinner);

    }
}
