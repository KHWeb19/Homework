public class Q9 {
    public static void main(String[] args) {


        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;


        boolean isRandomAllocCheck = false;
        int decision = 0;
        int sum = 0;

        for (int i = START; i <= END; i++) {
            while (!isRandomAllocCheck) {
                decision = (int) (Math.random() * range + MIN);
                isRandomAllocCheck = true;
            }

            if (i % decision == REMAIN) {
                System.out.printf("%d의 배수 i = %d\n", decision, i);
                isRandomAllocCheck = false;

                sum += i;
            }
        }

        // 1~100 숫자 루프 2~10 사이 랜덤 숫자 선택후 배수 출력
        // 실제 난수 할당 했는지 판정하기

        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}
