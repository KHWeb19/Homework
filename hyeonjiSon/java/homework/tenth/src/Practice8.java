public class Practice8 {
    public static void main(String[] args) {
        Dice dice = new Dice(); //Dice 클래스를 객체화 한다.

        dice.initDice(); //dice객체를 초기화 한다.
        System.out.println("랜덤 주사위 결과 : " + dice.rollDice());
        //Dice메서드를 호출하여 랜덤 주사위 결과를 출력한다.

    }
}
