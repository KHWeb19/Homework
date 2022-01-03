import java.math.BigInteger;
import java.util.Scanner;

public class Homework_02 {
    public static void main(String[] args) {
        //2. 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
        //   BigInteger를 통해서 50번째 항을 구해보자!
        final int NUMBER = 2;
        final BigInteger NUMBER2 = new BigInteger("2");

        Scanner scanner = new Scanner(System.in);

        System.out.println("몇번째를 보기를 원하시나요? ");
        int scanNum = scanner.nextInt();
        int num1 = 2;
        BigInteger num2 = new BigInteger("1");
        BigInteger num3 = new BigInteger("2");
        for(int i = 0; i < scanNum; i++){
            // num2.multiply() 까지는 알겠는데 거기에 num1을 넣으려고 하니 둘이 데이터 타입이 달라서 안된다고한다.
            // num1을 BigInteger로 변경해야하나..?

            //num2 = num2.multiply(BigInteger.valueOf(NUMBER)); // 데이터 타입을 변경하는 방법.
            //num2 = num2.multiply(BigInteger.valueOf(num1)); // 데이터 타입을 변경하는 방법.
            num2 = num2.multiply(NUMBER2); // num3라는 변수를 BigInteger로 생성.
        }
        System.out.println(num2);
    }
}
