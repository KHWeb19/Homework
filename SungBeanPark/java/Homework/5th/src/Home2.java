import java.math.BigInteger;
import java.util.Scanner;
//1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
//
//BigInteger를 통해서 50번째 항을 구해보자!
public class Home2 {
    public static void main(String[] args) {
    final int START = 1;

    BigInteger[] sequence;
    Scanner scan = new Scanner(System.in);

    System.out.print("등차수열의 몇 번째 항을 구할까요 ? ");
    final int END = scan.nextInt();

    sequence = new BigInteger[END];

    sequence[0] = new BigInteger("1");
    sequence[1] = new BigInteger("2");

    for (int i = START; i < END; i++) {
        sequence[i] = sequence[1].multiply(sequence[i - 1]);
        System.out.printf("arr[%d] = %d\n", i, sequence[i]);
    }
}
}

