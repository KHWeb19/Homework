public class DiceClass {
    public static void main(String[] args) {
        //8. 주사위 클래스를 만들어봅시다.

        Dice dice = new Dice();

        dice.initDice();
        System.out.println("주사위 : "+dice.rollDice());

    }
}
