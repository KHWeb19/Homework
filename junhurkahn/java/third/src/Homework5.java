public class Homework5 {
    public static void main(String[] args) {
        /* 2의 배수를 출력해야 한다 일단 for문으로 1부터 100까지 출력한다 그리고 거기서
         if문을 만들어 조건 i % 2 == 0 을 만들어 짝수만 출력
         */final int START = 1;
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
