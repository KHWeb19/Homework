public class Dice {
    public static void main(String[] args) {

        DiceClass diceClass = new DiceClass();

        diceClass.initDice();
        System.out.println("주사위값은 " +DiceClass.rand);
    }
}
