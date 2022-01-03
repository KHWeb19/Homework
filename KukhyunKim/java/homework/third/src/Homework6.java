public class Homework6 {
    public static void main(String[] args) {
        // 6. 1~100까지 숫자중 3의 배수만 출력해보자!

        /*
        1. 상자만들기 (시작점, 끝점, 변수, 변수통제 )
        2. 루프
        3. 출력
         */

        final int Start = 1;
        final int End = 100;
        final int Decision = 3;
        final int Remain = 0;

        for (int i = Start; i <= End; i++) {
            if (i % Decision == Remain) {
                System.out.println("3의배수 i = " + i);
            }
        }
    }
}
