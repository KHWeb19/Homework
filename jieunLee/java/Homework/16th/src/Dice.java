public class Dice {
    final int MAX = 6;
    final int MIN = 1;

    int range;
    int diceNum;

    public Dice () {
        range = MAX - MIN + 1;
    }

    public void rollDice () {
        diceNum = (int) (Math.random() * range + MIN);
    }

    public int getDiceNum () {
        return diceNum;
    }
}
