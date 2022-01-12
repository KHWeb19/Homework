public class M6Class {
    static int Dice;

    public void printDice() {
        Dice = (int) (Math.random() * 6 + 1);
        if (Dice % 2 == 0) {
            System.out.println("축하합니다 당첨입니다");
        } else {
            System.out.println("넌 나에게 굴욕감을 주었어");
        }
    }
}