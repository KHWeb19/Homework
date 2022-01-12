public class Player {

    //플레이어가 주사위를 굴린다
    int playerNum;

    Dice[] player;

    public Player(final int playerNum , final int diceCnt){
        this.playerNum = playerNum;
        player = new Dice[playerNum];

        for(int i = 0; i < playerNum; i++){
                player[i] = new Dice(diceCnt);
            }
    }
    // 각 플레이어의 sum값이 나옴
    // 그럼 짝수 홀수인지 판단
    public void playerRollDice(){

        for(int i = 0; i < player.length; i++){
         player[i].rollDice();

        }
    }

    public void skillEffect() {

            int tmp;
        for (int i = 0; i < playerNum; i++) {
            if (player[i].checkSum()) {
                switch(tmp = player[i].specialDice()){
                    case 1:
                        // 1번의 경우 상대방의 주사위 눈금을 2 떨군다.
                        System.out.println("1번 - 상대 눈금을 2떨굼");
                        for (int j = 0; j < playerNum; j++) {
                            if (i == j) {
                                continue;
                            }

                            player[j].operateDice(-2);
                        }
                        break;
                    case 3:
                        // 3번의 경우 다 같이 -6을 적용한다.
                        System.out.println("3번 - 다같이 6떨굼");
                        for (int j = 0; j < playerNum; j++) {
                            player[j].operateDice(-6);
                        }
                        break;
                    case 4:
                        // 4번의 경우 그냥 패배
                        System.out.println("4번 - 잘가");
                        player[i].operateDice(4444);
                        break;
                    case 6:
                        // 6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
                        System.out.println("6번 - 상대편 3을 뺏어서 내쪽으로 3을 땡겨옴");
                        for (int j = 0; j < playerNum; j++) {
                            if (i == j) {
                                continue;
                            }

                            player[j].operateDice(-3);
                            player[i].operateDice(3);
                        }
                        break;
                    default:
                        System.out.println("디폴트 2, 5!!!");
                        player[i].operateDice(tmp);
                        break;
                }
            }
        }


    }

    public void gameStart(){
        playerRollDice();


    }
}




