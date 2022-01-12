public class Homework6 {
    public static void main(String[] args) {
        /* 3의 배수를 출력해야 한다 일단 for문으로 1부터 100까지 출력
        거기서 if 문으로 i % 3 == 0 을 만들어 3의 배수를 출력
         */
        final int START = 1;
        final int END = 100;
        final int DECISION = 3;
        final int REMAIN = 0;

        for (int i = START; i <= END; i++) {
            if (i % DECISION == REMAIN) {
                System.out.println("3의 배수 i = " + i);
            }
        }
    }
}