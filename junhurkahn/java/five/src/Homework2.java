import java.math.BigInteger;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        /* 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
   BigInteger를 통해서 50번째 항을 구해보자!*/

  /* 이문제도 1번문제에서 BigInteger[] 만 추가 하면 될것같다*/

        final int START = 2;

        BigInteger[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("등수의 수열의 몇 번째 항을 구할까요 ? ");
        int end = scan.nextInt();

        sequence = new BigInteger[end];

        sequence[0] = new BigInteger("1");
        sequence[1] = new BigInteger("2");

        for (int i = START; i < end; i++) {
            // 여기에서 .add(sequence[i * 2]); 바꿔 보았지만 출력이 되지않는다//
            sequence[i] = sequence[i - 1].add(sequence[i * 2]);
            System.out.println("arr[" + i + "] = " + sequence[i]);
        }
    }
}


