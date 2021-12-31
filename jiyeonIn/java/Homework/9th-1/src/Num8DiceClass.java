public class Num8DiceClass {
    public static void main(String[] args) {
        Num8Dice dice = new Num8Dice();

        dice.initDice();
        dice.rollDice();
        dice.rollArry();

        System.out.println("각 친구의 주사위 합 :");
        dice.playSum();

        dice.speacialDice();

        for (int i = 0; i < Num8Dice.PLAYER_NUM; i++) {
            if (Num8Dice.diceSum[i] < 0) {
                Num8Dice.diceSum[i] = 0;
            }
        }
        dice.winner();
    }
}
