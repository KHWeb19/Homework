public class Dice {

    //8. 주사위 클래스를 만들어봅시다.

    final int MAX = 6;
    final int MIN = 1;

    int range;

    public void initDice () {
        range = MAX - MIN + 1;
    }
    public int rollDice () {
        return (int)(Math.random()*range+MIN);
    }

}
