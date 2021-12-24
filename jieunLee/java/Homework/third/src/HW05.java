public class HW05 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        System.out.printf("5. %d~%d까지 숫자중 짝수만 출력해보자!\n", START, END);
        for (int i=START; i<=END; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
