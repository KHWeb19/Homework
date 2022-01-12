import java.math.BigInteger;
import java.util.Scanner;

public class P02 {
    // 1, 2, 4, 8 ... 의 등비수열
    // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍
    // BigInteger를 사용

    public static void main(String[] args) {

        final int START_IDX = 0;
        final BigInteger BASE = new BigInteger("2"); // BASE의 등비수열

        Scanner scan = new Scanner(System.in);
        System.out.print("등비수열의 항은 ? : ");
        int idx = scan.nextInt();

        BigInteger[] seq = new BigInteger[idx];
        seq[START_IDX] = new BigInteger("1");


            for(int i = START_IDX + 1; i < idx; i++) {
                seq[i] = seq[i - 1].multiply(BASE);
            }
            System.out.printf("등비수열의 %d 번째 항 : %d\n", idx, seq[idx - 1]);
    }
}
