public class M7Class {
    static int Dice;

    public void printDice() {
        Dice = (int) (Math.random() * 6 + 1);
        if (Dice % 2 == 1) {
            System.out.println("넌 나에게 굴욕감을 주었어");
        }
    }
}