public class Dice {
    //8. 주사위 클래스를 만들어봅시다.

    private final int MAX = 6, MIN=1, RANGE = MAX-MIN+1;

    private int numberRolled;


    public Dice(){
        roll();
    }

    public void roll(){
        this.numberRolled = (int) (Math.random() * RANGE + MIN);
    }
}
