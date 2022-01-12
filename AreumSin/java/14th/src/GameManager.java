public class GameManager {
    Player[] players;
    int playNum;

    public GameManager(final int playerNum, final int diceCnt){
        players = new Player[playerNum];
        this.playNum = playerNum;

        for(int i = 0; i < playerNum; i++){
            players[i] = new Player(diceCnt);
        }
    }

    public void rollPlayerDice(){
        for(int i = 0; i < playNum; i++){
            players[i].rollEveryDice();
        }
    }

    public void rollSpecialDice(){
        for(int i = 0; i < playNum; i++){
            if(players[i].checkSpecialDice()) {
                players[i].rollSpecialDice();
            }
        }
    }

    public void applySkillEffect(){
        int tmp;
        for(int i = 0; i < playNum; i++){
            if(players[i].isGetSpecial()){
                switch (tmp = players[i].getSpecialDiceNum()){
                    case 1:
                        for(int j = 0;  j < playNum; j++){
                            if(j == i){
                                continue;
                            }
                            players[j].operateDice(-2);
                        }
                        break;
                    case 3:
                        for(int j = 0; j < playNum; j++){
                            players[j].operateDice(-6);
                        }
                        break;
                    case 4:
                        players[i].operateDice(4444);
                        break;
                    case 6:
                        for(int j = 0; j <playNum; j++){
                            if(j == i){
                                continue;
                            }
                            players[j].operateDice(-3);
                            players[i].operateDice(+3);
                        }
                        break;
                    default:
                        players[i].operateDice(tmp);
                        break;
                }
            }
        }
    }

    public void checkSum(){
        for(int i = 0; i < playNum; i++){
            System.out.println(players[i].getSum());
        }
    }
    public void startGame(){
        System.out.println("주사위 게임 시자!");

        rollPlayerDice();
        checkSum();
        rollSpecialDice();
        applySkillEffect();

    }


}
