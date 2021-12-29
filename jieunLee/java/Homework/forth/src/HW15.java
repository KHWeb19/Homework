public class HW15 {
    public static void main(String[] args) {
        //1 ~ 100까지 숫자중 4의 배수만 출력해보자
        final int MIN = 1;
        final int MAX = 100;
        final int DECISION = 4;
        final int REMAIN = 0;
        for (int i=MIN; i<=MAX; i++) {
            if (i % DECISION == REMAIN) {
                System.out.println(i);
            }
        }
    }
}
