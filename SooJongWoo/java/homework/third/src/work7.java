public class work7 {
    public static void main(String[] args) {
        // 1~100까지 숫자중 4의 배수를 더한 결과를 출력해보자!
        int sum = 0;
        for (int num = 1; num <= 100; num++) {
            if (num % 4 == 0) {
                sum += num;
            }
        }
        System.out.println("1~100까지의 숫자중 4의 배수의 합 = " + sum);
    }
}