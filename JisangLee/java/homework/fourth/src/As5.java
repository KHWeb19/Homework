public class As5 {
    //1 ~ 100까지의 숫자 중 짝수만 출력
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int DECISION = 2; //짝수이므로 2로 설정
        final int REMAIN = 0;

        System.out.printf("%d ~ %d 까지의 짝수 출력\n", START, END);

        for (int i = START; i <= END; i++) {
            if (i % DECISION == REMAIN) {
                System.out.println("          " + i);
            }

        }
    }
}
