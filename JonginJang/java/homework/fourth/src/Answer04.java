public class Answer04 {
    public static void main(String[] args) {
    /*
    - 문제4. 구구단 7단을 출력해보자.

    - 구현 전략
    구구단 7단을 모두 출력하기 위해 반복문 for 사용
    구구단 7단만 출력하면 되기 때문에 이중반복문 불필요
    7 X 1 ~ 7 X 9에 대한 결과를 모두 보여주기 위해 for문 제어변수의 값을 1부터 9까지 증가시켜야 한다.
    for문 제어변수의 초기값은 1, 증가된 변수의 값이 10보다 작을 때까지 반복
    for문에서 반복시킬 동작 -> 출력문 printf
     */
        final int STAGE = 7;
        final int START = 1;
        final int END = 10;

        // i = i + 7 ===> i += 7 ===> i += STAGE
        for (int i = START; i < END; i++) {
            System.out.printf("%d x %d = %d\n", STAGE, i, STAGE * i);
        }
    }
}