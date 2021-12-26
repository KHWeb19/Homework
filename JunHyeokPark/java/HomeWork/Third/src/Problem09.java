public class Problem09 {
    public static void main(String[] args) {
        int i = 0; int sum = 0;
        while (i++ < 100) {
            int rand = (int) (Math.random() * 9 + 2);
            if (i % rand == 0) {
                System.out.printf("%d의 배수 %d 입니다.\n", rand, i);
                sum += i ;
            }
        }
        System.out.printf("랜덤 배수들의 합은 %d 입니다.", sum);
    }
}