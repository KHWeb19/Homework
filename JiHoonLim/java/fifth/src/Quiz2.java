import java.math.BigInteger;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {

        /*
        1. 1번문제에서 그대로 사용할 수 있는 int -> BigInteger 로 변환
        2. BigInteger에서 곱셈은 multiply
        +++ BigInteger 에서의 사칙연산, 나머지 +++
        덧셈 - .add
        뺼셈 - .subtract
        곱셈 - .multiply
        나눗셈 - .divide
        나머지 - .remainder
         */

        final int START = 1;
        BigInteger WANT = new BigInteger("2");

        BigInteger[] arr;

        Scanner scan = new Scanner(System.in);

        System.out.print("몇번째 항을 구할까요? ");
        int end = scan.nextInt();

        arr = new BigInteger[end];

        arr[0]= new BigInteger("1");
        System.out.println("arr[0] = " +arr[0]);

        for (int i = START; i < end; i++){
            arr[i] = arr[i-1].multiply(WANT);
            System.out.println("arr[" +i+ "] = " +arr[i]);
        }
    }
}
