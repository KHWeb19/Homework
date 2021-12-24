public class work6 {
    public static void main(String[] args) {
        // 1~100까지 숫자중 3의 배수만 출력해보자!
        int num = 0;

        while (num++ < 101) {

            if (num % 3 == 0) {
                System.out.printf("num은 3의 배수 = %d\n" , num);
            }
        }
    }
}
