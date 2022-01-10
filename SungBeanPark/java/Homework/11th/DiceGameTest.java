public class DiceGameTest {
    public static void main(String[] args) {
        DiceManager dm = new DiceManager(2); // 인스턴스(객체)화

        dm.playDiceGame();              // dm안에 있는 playDiceGame호출
        System.out.println(dm);
    }
}
