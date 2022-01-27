public class Bank3Ans8ClassTest {
    public static void main(String[] args) {
        // 주사위 2개를 굴려서 눈금의 합을 출력해봅시다.
        // 주사위의 개수 자체가 확장이 가능함

        GameManager gm = new GameManager(2, 2);
        gm.startGame();
    }
}
