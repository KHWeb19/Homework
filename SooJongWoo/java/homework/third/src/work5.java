public class work5 {
    public static void main(String[] args) {
        // 1~100까지 숫자중 짝수만 출력해보자!
        for (int num = 1; num <= 100; num++) {
            if (num % 2== 0) {
                System.out.println("짝수 = " + num);
            }
        }
    }
}
