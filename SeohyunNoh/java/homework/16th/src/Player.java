public class Player {
    private int diceCnt;
    private Dice[] diceArr;
    private Dice special;

    private int sum;
    private boolean getSpecial;

    public Player(final int diceCnt){
        System.out.printf("Player() : diceCnt - %d\n", diceCnt);

        this.diceCnt = diceCnt;
        diceArr = new Dice[diceCnt];

        for (int i = 0 ; i < diceCnt ; i++){
            diceArr[i] = new Dice();
        }

        special = new Dice();
    }

    public void rollEveryDice(){
        sum = 0;

        for(int i = 0 ; i < diceCnt ; i++){
            diceArr[i].rollDice();
            sum += diceArr[i].getDiceNum();
        }
    }

    public void rollSpecialDice(){
        if(getSpecial){
            special.rollDice();
        }
    }

    public boolean checkSpecialDice(){
        if(sum % 2 == 0){
            getSpecial = true;
            return getSpecial;
        } else{
            getSpecial = false;
            return getSpecial;
        }
    }

    public boolean isGetSpecial(){
        return getSpecial;
    }

    public int getSpecialDiceNum(){
        return special.getDiceNum();
    }

    public void operateDice (int num){
        sum += num;

        if(sum < 0 ){
            sum = 0;
        }
    }

    public int getSum(){
        return sum;
    }

    @Override
    public String toString() {
        return "Player{" +
                "special=" + special +
                ", sum=" + sum +
                '}';
    }
}
