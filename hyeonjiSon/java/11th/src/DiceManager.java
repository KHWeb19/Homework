import java.util.Arrays;

public class DiceManager {
    int diceNum;

    Dice[] diceArr;
    int sum;

    public DiceManager (int diceNum){
        sum = 0;
        this.diceNum = diceNum;
        diceArr = new Dice[diceNum];
    }

    public void checkWin(int sum){
        if(sum % 2 == 0){
            System.out.println("당첨");
        } else {
            System.out.println("손모가지");
        }
    }

    public void playDiceGame () {
        int tmp;

        for (int i = 0; i < diceNum; i++) {
            // 주사위 객체 생성
            diceArr[i] = new Dice();
            // 주사위를 굴려야함
            // 합산
            tmp = diceArr[i].rollDice();
            System.out.printf("tmp = %d\n", tmp);
            sum += tmp;
        }

        checkWin(sum);
    }

    @Override
    public String toString() {
        return "DiceManager{" +
                ", diceArr=" + Arrays.toString(diceArr) +
                ", sum=" + sum +
                '}';
    }
}
