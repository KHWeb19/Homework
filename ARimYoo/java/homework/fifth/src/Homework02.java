import java.math.BigInteger;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        // 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
        // BigInteger를 통해서 50번째 항을 구해보자!


        // 무한정수를 나타내기 위해서는 BigInteger이 필요하다.

        Scanner scan = new Scanner(System.in);
        System.out.print("등비수열 몇번째 항을 구할까요? : ");
        int end = scan.nextInt();

        final int START = 2;

        BigInteger [] arr = new BigInteger[end];

        arr[0] = new BigInteger("1");
        arr[1] = new BigInteger("2");

        for (int i = START; i <= end; i++){

            // BigInteger의 연산에는 단순 숫자가 안들어가나 보다.. -> 빨간줄이 뜸
            // 그래서 arr[1]이 2의값을 가지기 때문에 연산에 넣었음

            arr[i] = arr[1].multiply(arr[i-1]);

            System.out.println(arr[i]);

        }
    }
}
