public class P5 {
    // 1~100까지의 숫자중 짝수만 출력

    public static void main(String[] args) {
        int num;

        for (num = 1; num <= 100; num++){
            if (num % 2 == 0) {
                System.out.println("짝수 : " + num);
            }
        }
    }
}
