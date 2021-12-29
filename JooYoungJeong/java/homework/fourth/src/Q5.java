public class Q5 {
    public static void main(String[] args) {



        final int START = 1;
        final int END = 100;
        final int DECISION = 2;
        final int REMAIN = 0;

        for (int i = START; i <= END; i++) {
            if (i % DECISION == REMAIN) {
                System.out.println("짝수 i = " + i);

                // 1~100 까지 범위 설정
                // 2의 배수만 출력
            }
        }
    }
}


