public class DiceClass {
    public static void main(String[] args) {
        Dice dice = new Dice(); // 객체 생성.

        dice.initDice();
        System.out.println("주사위 : "+dice.rollDice());
    }
}
