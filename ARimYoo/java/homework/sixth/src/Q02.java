import java.math.BigInteger;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        // 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
        // BigInteger를 통해서 50번째 항을 구해보자!

        Scanner scan = new Scanner(System.in);
        System.out.print("구하고자 하는 등비수열의 열을 입력하시오 : ");
        int end = scan.nextInt();

        final int START = 0;
        BigInteger[] arr = new BigInteger[end];
        BigInteger Base = new BigInteger("2");   //// BigInteger 연산에서 숫자의 값을 바로 연산에 쓰지 못하므로 변수명 할당

        arr[0] = new BigInteger("1");

        for (int i = START; i < end; i++) {

            if (i == 0) {       /// 초항도 출력할 수 있도록 예외 지정
                System.out.println(arr[0]);
            } else {
                arr[i] = Base.multiply(arr[i - 1]);
                System.out.println(arr[i]);

            }
        }
    }
}
