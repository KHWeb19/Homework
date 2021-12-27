public class HW07 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int DECISION = 3;
        System.out.printf("%d~%d까지 숫자중 %d의 배수를 더한 결과를 출력해보자!\n", START, END, DECISION);
        int sum = 0;
        for (int i=START; i<=END; i++) {
            if (i%DECISION==0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("총합: " + sum);
    }
}
