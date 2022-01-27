import java.util.Arrays;

public class Dice {



    final int DICE_MAX = 6;
    final int DICE_MIN = 1;
    final int DICE_NUM = 2;

    int range = DICE_MAX - DICE_MIN + 1;
    int diceSum = 0;

    int[] diceArr = new int[DICE_NUM];

    public void rollDice() {
        for (int i = 0; i < DICE_NUM; i++) {
            diceArr[i] = (int) (Math.random() * range + DICE_MIN);

            diceSum += diceArr[i];
        }
    }

    public void checkSum(){
            if(diceSum % 2 == 0){
                System.out.println("당첨 입니다");
            }else{
            System.out.println("손모가지를 내놔라");
        }

        }

    @Override
    public String toString() {
        return "Dice{" +
                "DICE_MAX=" + DICE_MAX +
                ", DICE_MIN=" + DICE_MIN +
                ", DICE_NUM=" + DICE_NUM +
                ", range=" + range +
                ", diceSum=" + diceSum +
                ", diceArr=" + Arrays.toString(diceArr) +
                '}';
    }
}
