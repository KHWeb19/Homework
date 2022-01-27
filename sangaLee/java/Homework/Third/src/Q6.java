public class Q6 {
    public static void main(String[] args) {

        //1 ~ 100까지 숫자중 3의 배수만 출력해보자!
        int i = 0;

        while (i<100) {
            i++;
            if (i % 3 == 0) {
                System.out.printf("100까지 3의 배수만 출력 = %d\n", i);
            }
        }

    }
}
