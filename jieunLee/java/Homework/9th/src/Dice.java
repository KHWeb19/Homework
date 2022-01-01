public class Dice {
    final int MIN = 1;
    final int MAX = 6;

    public int initDice() {
        return (int)(Math.random()*(MAX-MIN+1)+MIN);
    }
}
