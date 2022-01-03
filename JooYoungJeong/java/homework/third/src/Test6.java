public class Test6 {
    public static void main(String[] args) {

        // 1 ~ 100 까지 숫자중 3의 배수만 출력

        int n = 0;

        while (n < 100){
            n++;
            if (n % 3 == 0){
                System.out.printf("1 ~ 100 사이 3의 배수 = %d\n", n);
            }
        }
    }
}
