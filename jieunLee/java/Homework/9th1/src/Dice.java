public class Dice {
    public int initDice() {
        final int MIN = 1;
        final int MAX = 6;
        return (int)(Math.random()*(MAX-MIN+1)+MIN);
    }
    public int sumDice(int max) {
        int sum = 0;
        for (int i=0; i<max; i++) {
            sum += initDice();
        }
        return sum;
    }
    public void evenDice() {
        int dice = initDice();
        if (dice%2==0) {
            System.out.println("주사위: "+dice+" 당첨입니다!");
        } else {
            System.out.println("주사위: "+dice+" 손모가지를 내놔라");
        }
    }
}
