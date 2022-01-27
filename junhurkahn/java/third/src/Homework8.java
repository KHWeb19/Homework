public class Homework8 {
    public static void main(String[] args) {
        /* 일단 1 ~ 100까지 숫자를 순회해야 하기 떄문에 for문을 사용
        하지만 순서대로 순회하는게 아니기때문에 Math.random 사용
        for문 만들어주고 Math.random 만들어주고 범위 정해줌
        그리고 for문에서 Math.random 수를 출력해줘야 하니 for문 if문에서
        Math.random 숫자를 집어 넣어준다
        i % decision == 0 거기에 decision = Math.random 숫자를 집어 넣어주고 출력
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
