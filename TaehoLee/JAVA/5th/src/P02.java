import java.math.BigInteger;
import java.util.Scanner;

public class P02 {
    // 1, 2, 4, 8 ... 의 등비수열
    // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍
    // BigInteger를 사용

    public static void main(String[] args) {

        final int START = 1;
        int i;

        BigInteger[] sequence;

        Scanner scan = new Scanner(System.in);
        System.out.print("등비수열의 항은 ? : ");

        int end = scan.nextInt();

        sequence = new BigInteger[end];
        sequence[0] = new BigInteger("1");

        for(i = START; i < end; i++) {
            sequence[i] = sequence[i - 1].add(sequence[i - 1]);
        }
        System.out.printf("등비수열의 %d 번째 항 : %d\n", i, sequence[i - 1]);

    }
}
