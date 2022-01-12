public class HW5 {
    //5. 1 ~ 100까지 숫자중 짝수만 출력해보자.


    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 100;
        final int DECISION = 2;
        final int REMAIN = 0;


        for (int i = MIN; i <= MAX; i++) {
            if (i % DECISION == REMAIN ) {
                System.out.println("짝수 i = "+i);
            }
        }

    }
}
