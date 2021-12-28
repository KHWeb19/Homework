import java.math.BigInteger;
import java.util.Scanner;
//1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
//Biglnteger를 통해서 50번째 항을 구해보자!

public class Q2 {
    public static void main(String[] args) {
        final int START = 1;

        BigInteger[] num1;

        Scanner scan = new Scanner(System.in);

        System.out.println("몇 항?");
        int num2 = scan.nextInt();

        num1 = new BigInteger[num2];

        num1[0] = new BigInteger("1");

        for(int i = START; i < num2; i++){
            num1[i] = num1[i-1].multiply(BigInteger.valueOf(2));
            System.out.println("arr[" + i + "] = " + num1[i]);
        }
    }
}
