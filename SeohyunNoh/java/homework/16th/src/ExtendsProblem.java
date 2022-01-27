public class ExtendsProblem {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();

        dg.startGame();
        System.out.println(dg);

        dg.printResult();
    }
}
