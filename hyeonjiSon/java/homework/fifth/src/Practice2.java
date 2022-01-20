import java.math.BigInteger;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        //문제2. 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
        // BigInteger를 이용해 50번째 항을 구해보자!)

        //1.int []arr 을 BigInteger를 사용하여 수정
        BigInteger[] arr;

        Scanner scan = new Scanner(System.in);
        System.out.print("몇 번째 항의 결과를 찾고 싶나요? : ");
        int end = scan.nextInt(); // 정수를 입력할 수 있음.

        arr = new BigInteger[end];
        arr[0] = new BigInteger("1");

        BigInteger num = new BigInteger("1");
        BigInteger num2 = new BigInteger("2");

        //2-2. for문을 이용하여 반복문이 내가 입력하는 수 만큼만 arr를 배열하도록 만든다.


        for(int i = 1; i < end; i++){
            // BigInteger 타입의 변수로 작업해야함
            // System.out.println(변수1.multiply(변수2));
            // 곱셈할 대상 또한 BigInteger 타입이어야 합니다.

            System.out.println("arr[" + i + "] = " + num.multiply(num2));

            num = num.multiply(num2); //for 문 맨 위로 돌아가 반복하기 전, num의 값을 바꿔준다.
        }

    }

}
