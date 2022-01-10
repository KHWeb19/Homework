public class Dice {
    final int MAX = 6;
    final int MIN = 1;

    int diceNum;
    int range;

    // 객체를 생성.
    // new 생성자
    // 객체화 하는게 -> 생성자
    // 클래스를 객체화 하려면 생성자 호출을 해야합니다.

    public void initDice () {
        range = MAX - MIN + 1;
    }

    public int rollDice () {
        return (int) (Math.random() * range + MIN);
    }
}
