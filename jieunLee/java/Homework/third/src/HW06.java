public class HW06 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int DECISION = 3;
        final int REMAIN = 0;
        System.out.printf("6. %d~%d까지 숫자중 %d의 배수만 출력해보자!\n", START, END, DECISION);
        for (int i=START; i<=END; i++) {
            if (i%DECISION==REMAIN) {
                System.out.println(i);
            }
        }
    }
}
