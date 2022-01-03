public class Answer08 {
    public static void main(String[] args) {
    /*
    - 문제8. 1~100까지 숫자를 순회한다.
            2~10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.

    - 구현 전략
    어떤 수의 배수를 출력시킬지 2~10 사이 난수 발생을 통해 결정
    2~10 사이의 난수를 발생시키기 위해 -> (int)(Math.random() * (10-2 +1) + 2))

    1~100까지 값을 증가시켜야 한다. -> for문 사용
    1부터 100까지 선택된 난수의 배수에 해당하는 숫자가 있는지 확인하기 위한 조건이 필요하다.
    -> 나머지를 구하는 연산자(%)를 이용-> 변수 % 선택된 난수 == 0 에 부합하면 선택된 난수의 배수.
    그리고 이 조건에 대한 판별은 값을 하나 증가 시킬 때마다 수행되어야 한다. -> for문 내부에 if문을 배치해 반복시킨다.
    if문 조건이 참일 경우 수행할 동작 : 선택된 난수의 배수를 출력

     */

        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        int decision = (int) (Math.random() * range + MIN);

        for (int i = START; i <= END; i++) {
            if (i % decision == REMAIN) {
                System.out.printf("%d의 배수 i = %d\n", decision, i);
            }
        }
    }
}
