public class Homework7 {
    public static void main(String[] args) {
        // 7.  1~100까지 숫자중 4의 배수를 더한 결과를 출력해보자!

        int a = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 4 == 0) {
                a += i;
            }
        }
        System.out.printf("4의 배수 = %d\n", a);
    }
}
