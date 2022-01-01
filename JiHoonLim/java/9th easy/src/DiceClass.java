public class DiceClass {
    final int MAX = 6;
    final int MIN = 1;

    int range;
    public static int rand;

    public void initDice(){
        range = MAX - MIN + 1;
        rollDice();
    }

    public void rollDice(){
        rand = (int)(Math.random() * range + MIN);
    }
}

