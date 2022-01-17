public class Practice1 {
    public static void main(String[] args) {

        //주사위 n개  - 2개
        //플레이어 n개 - 2개
        //주사위 합 짝수 특수주사위
        //특수주사위 설정
        // 순번은 돌아가면서
        // 먼저 30달성한 사람이 승리하는걸로
        GameManager gm = new GameManager(3,4);

        gm.gameStart();

    }
}
