import java.util.Arrays;

public class DiceManager {
    int diceNum;

    Dice[] diceArr;
    int sum;

    public DiceManager(int diceNum){
        sum = 0;
        this.diceNum = diceNum;

        diceArr = new Dice[diceNum];
    }

    public void checkWin (int sum){
        if (sum% 2 == 0){
            System.out.println("당첨입니다");
        } else {
            System.out.println("손모가지");
        }
    }

    public void playDiceGame(){
        int tmp;

        for(int i = 0 ; i < diceNum ; i++){
            diceArr[i] = new Dice();
            tmp = diceArr[i].rollDice();
            System.out.printf("뽑은 주사위 : %d\n", tmp);
            sum += tmp;
        }

        checkWin(sum);
    }

    @Override
    public String toString() {
        return "DiceManager{" +
                "diceArr=" + Arrays.toString(diceArr) +
                ", sum=" + sum +
                '}';
    }
}
