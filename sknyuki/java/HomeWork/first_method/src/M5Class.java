public class M5Class {
    static int Dice1;
    static int Dice2;

    public void printDiceSum() {
        Dice1 = (int) (Math.random() * 6 + 1);
        Dice2 = (int) (Math.random() * 6 + 1);
        int Sum = Dice1 + Dice2;

        System.out.printf("두 주사위의 합 %d\n", Sum);
    }
}
