public class Q7 {
    public static void main(String[] args) {

        // 1 ~ 100까지 숫자중 4의 배수를 더한 결과를 출력해보자!

        int sum = 0;

        for (int i = 0; i<100; i++) {
            if ( i%4==0 ) {
                sum += i;
            }
        }

        System.out.println("1~100까지 4의 배수 합 = " + sum);


        }
    }

