import java.util.Arrays;

public class Player2 {
    /*
    2. Player2클래스 생성
        - playerNum에 입력된 수만큼 player수 할당
        - 각각의 player에게 hp 50만큼 할당
        - 각각의 player가 난수를 뽑아야함
     */
    int playerNum;
    int[] playerArr = new int[playerNum];

    final int PLAYER_NUM = 2;
    final int HP = 50;

    final int MAX = 10;
    final int MIN = 1;
    int range = MAX - MIN + 1;

    int rand;

    public Player2(int playerNum) {
        this.playerNum = playerNum;
    }

    public void allocHp() {
        // HP 50값을 playerArr[0]에게 저장
        // HP 50값을 playerArr[1]에게 저장
        for (int i = 0; i < playerNum; i++) {
            playerArr[i] = HP;
        }
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        // playerArr에 HP값이 잘 들어갔나 확인해보려고 하니 위와 같은 에러가 떴다.
        // i=0부터 시작하니까 playerArr[0] = 50, playerArr[1] = 50 이렇게 된 거 아닌가?
        // 왜 out of bounds지?
        System.out.printf("playerArr[%d] : %d\n", playerArr, HP);
    }

    public void generateRandomNum() {
        for (int i = 0; i < playerNum; i++) {
            rand = (int) (Math.random() * range + MIN);
        }
    }


}