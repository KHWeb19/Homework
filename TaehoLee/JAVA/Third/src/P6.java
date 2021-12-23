public class P6 {
    // 1~100까지의 숫자중 3의 배수만 출력

    public static void main(String[] args) {
        int num;

        for (num = 1; num <= 100; num++){
            if (num % 3 == 0) {
                System.out.println("3의 배수 : " + num);
            }
        }
    }
}
