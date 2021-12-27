public class Question9 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;
        int sum = 0;
        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;

        boolean isRandomAllocCheck = false;
        int decision = 0;

        for (int i = START; i <= END; i++) {
            while (!isRandomAllocCheck) {
                decision = (int) (Math.random() * range + MIN);
                isRandomAllocCheck = true;
            }
            if (i % decision == REMAIN) {
                System.out.printf("%d의 배수  i = %d\n", i);
                isRandomAllocCheck = false;
            }

                    if (i % decision == REMAIN) {
                        System.out.printf("%d의 배수 i = %d\n", decision, i);
                        isRandomAllocCheck = false;

                        sum += i;
                    }
                }

                System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
            }
        }


