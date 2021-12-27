public class Answer05 {
    public static void main(String[] args) {
    /*
    - 문제5. 1~100까지 숫자 중 짝수만 출력해보자!

    - 구현 전략
    1~100까지 값을 증가시켜야 한다. -> for문 사용
    1부터 100까지 짝수에 해당하는 숫자가 있는지 확인하기 위한 조건이 필요하다.
    -> 나머지를 구하는 연산자(%)를 이용-> 변수 % 2 == 0 에 부합하면 짝수.
    그리고 이 조건에 대한 판별은 값을 하나 증가시킬 때마다 수행되어야 한다. -> for문 내부에 if문을 배치해 반복시킨다.
    if문 조건이 참일 경우 수행할 동작 : 짝수에 해당하는 숫자를 출력

     */
        final int START = 1;
        final int END = 100;
        final int DECISION = 2;
        final int REMAIN = 0;

        for (int i = START; i <= END; i++) {
            if (i % DECISION == REMAIN) {
                System.out.println("짝수 i = " + i);
            }
        }
    }
}