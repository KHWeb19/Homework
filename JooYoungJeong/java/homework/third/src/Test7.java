public class Test7 {
    public static void main(String[] args) {

        // 1 ~ 100 까지 숫자중 4의 배수를 더한 결과 출력

        int n = 0;

        while (n < 101) {
            n++;

                for (int i = 4; i < 101;)

                    n += i;

                System.out.println("4의 배수 더한 결과 : " + n);
            }
        }
    }