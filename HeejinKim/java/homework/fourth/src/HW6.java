public class HW6 {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 100;
        final int DECISION = 3;
        final int REMAIN = 0;


        for (int i = MIN; i <= MAX; i++) {
            if (i % DECISION == REMAIN ) {
                System.out.println("3의 배수 i = "+i);
            }
        }

    }
}
