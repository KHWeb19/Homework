public class HW16 {
    public static void main(String[] args) {
        //1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!
        final int MIN = 1;
        final int MAX = 100;
        final int DECISION = 11;
        final int REMAIN = 0;
        int sum = 0;
        for (int i=MIN; i<=MAX; i++) {
            if (i%DECISION==REMAIN) {
                System.out.println(i);
                sum += i;
            }

        }
        System.out.println("합: " + sum);
    }
}
