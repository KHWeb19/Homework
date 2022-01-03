import java.math.BigInteger;
import java.util.Scanner;

public class reviewWork2 {
    public static void main(String[] args) {
        final int START = 2; // 2의n승 이기때문에 START값을 2로 지정

        BigInteger[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("몇번째 항을 구할까요? ");
        int end = scan.nextInt(); // end로 스캔 값을 지정

        sequence = new BigInteger[end]; // end값까지 BigInteger로 설정

        sequence[0] = new BigInteger("1");
        sequence[1] = new BigInteger("1");

        for (int i = START; i < end; i++) {
            sequence[i] = sequence[i - 1].add(sequence[i - 2]);
            // sequence[i - 1].add(더할 대상 입력)
            System.out.println("arr[" + i + "] = " + sequence[i]);
        }

    }
}
/*  1. BigInteger를 사용하기 때문에 MAX값을 지정하는것은 의미가 없음.
    2. Scanner를 이용하여 입력할 수 있게 하여 50번째 항을 출력하기.
 */

// Q1. 초항을 잡아주는 이유가 단순히 START값이 2로 시작하기 때문에 0, 1을 1로
//     초항을 잡아주고 시작하는건가요??