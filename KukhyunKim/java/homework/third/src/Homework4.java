public class Homework4 {
    public static void main(String[] args) {
        // 구구단 7단을 출력해보자!

        /*
        1. 상자만들기 (시작숫자, 시작점, 끝점)
        2. 루프
        3. 출력
         */

        final int STAGE = 7;
        final int START = 1;
        final int END = 10;

        for (int i = START; i < END; i++){
            System.out.printf("%d X %d = %d\n", STAGE, i, STAGE * i);
        }
    }
}
