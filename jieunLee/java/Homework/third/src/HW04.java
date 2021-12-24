public class HW04 {
    public static void main(String[] args) {
        final int STAGE = 7;
        final int START = 1;
        final int END = 10;
        System.out.printf("4. 구구단 %d단을 출력해보자!\n", STAGE);
        for (int i=START; i<END; i++) {
            System.out.printf("%d * %d = %d\n", STAGE, i, STAGE*i);
        }
    }
}
