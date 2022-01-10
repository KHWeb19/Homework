public class DiceGameClass {
    public static void main(String[] args) {
        // 문제은행[3] 8번 주사위 게임

        // main에서 출력해야할 결과
        // 1. 게임 결과

        DiceGame dicegame = new DiceGame();

        dicegame.init_game();
        dicegame.dice_roll();
        dicegame.winner();

        System.out.println("결과" + dicegame.winner());
    }
}
