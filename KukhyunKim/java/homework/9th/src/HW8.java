// 문제은행[4] - 8. 주사위 클래스를 만들어봅시다.

public class HW8 {
    public static void main(String[] args) {
        DiceClass dice = new DiceClass();

        dice.initDice();
        System.out.println("주사위의 눈금은? : " + dice.rollDice());
    }
}