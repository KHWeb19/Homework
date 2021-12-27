public class Answer07 {
    public static void main(String[] args) {
    /*
    - 문제7. 1~100까지 숫자 중 4의 배수를 더한 결과를 출력해보자!

    - 구현 전략
    1~100까지 값을 증가시켜야 한다. -> for문 사용
    4의 배수들의 합을 저장시킬 변수 필요 -> sum = 0
    1부터 100까지 4의 배수에 해당하는 숫자가 있는지 확인하기 위한 조건이 필요하다.
    -> 나머지를 구하는 연산자(%)를 이용-> 변수 % 4 == 0 에 부합하면 4의 배수.
    그리고 이 조건에 대한 판별은 값을 하나 증가 시킬 때마다 수행되어야 한다. -> for문 내부에 if문을 배치해 반복시킨다.
    if문 조건이 참일 경우 수행할 동작 : sum에 현재 값 더하기
    1~100까지의 반복이 끝나면 더해진 값을 출력시킨다.

     */
        final int START = 1;
        final int END = 100;
        final int DECISION = 4;
        final int REMAIN = 0;

        int sum = 0;

        for (int i = START; i <= END; i++) {
            if (i % DECISION == REMAIN) {
                System.out.printf("%d의 배수 i = %d\n", DECISION, i);
                sum += i;
            }
        }

        System.out.printf("%d ~ %d까지 %d의 배수들의 합은 %d\n", START, END, DECISION, sum);
    }
}