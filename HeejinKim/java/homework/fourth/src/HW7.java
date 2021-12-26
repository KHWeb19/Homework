public class HW7 {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 100;
        final int DECISION = 4;
        final int REMAIN = 0;
        int sum=0;



        for (int i = MIN; i <= MAX; i++) {
            if (i % DECISION == REMAIN ) {
                System.out.println("4의 배수 i = " + i);
                sum+=i;
            }
        }
        System.out.println("4의 배수의 합"+sum);
    }
}
