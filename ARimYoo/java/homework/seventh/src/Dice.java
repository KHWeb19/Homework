public class Dice {

    final int MAX = 6;
    final int MIN = 1;

    int range;

    public void initDice () {
        range = MAX - MIN + 1;
    }

    public int rollDice() { // 리턴값이 존재할 시 , void 대신 리턴할 데이터 타입을 넣는가 ?
        return (int)(Math.random() * range + MIN);
    }

}
