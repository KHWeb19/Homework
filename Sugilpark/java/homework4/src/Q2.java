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
// 수가 21억이니 Biglnteger를 이용해 나타낸다.
// 50번째 항을 입력받아야 하니 Scanner를 적용시킨다.
// Biglnteger에서 곱하기를 쓰려면.multiply(BigInteger.valueOf(2)를 이용해야 한다.