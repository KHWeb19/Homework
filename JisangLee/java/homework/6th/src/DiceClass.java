public class DiceClass {
    public static void main(String[] args) {
        Dice dice = new Dice();

        dice.initDice();
        System.out.println ("주사위를 굴리세요:  " + dice.rollDice());
    }
}


