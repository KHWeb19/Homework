import java.math.BigInteger;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        /* 문제 2. 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
                    BigInteger를 통해서 50번째 항을 구해보자!
         */

        /*
        1. 32번째항이상은 데이터양이 크므로 BigInteger사용
        2. 수열만들기 for문(시작점. 끝점. 변수)
        3. for문에 배열로 인덱스값지정
        4. 인덱스값 32가 부터 데이터량이 많아진다 표시, 및 출력
        5. 1,2,3이 마친 값중 스캔가능하게 조정
        6. 스캔값 출력
         */

        final int START_IDX = 0;
        final BigInteger BASE = new BigInteger("2");

        System.out.print("수열의 몇 번째 항을 구할까요 ? ");

        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt();

        BigInteger[] Sequence = new BigInteger[idx];
        Sequence[START_IDX] = new BigInteger("1");

        for (int i = START_IDX + 1; i < idx; i++) {
            Sequence[i] = Sequence[i - 1].multiply(BASE);
            System.out.println("Sequence[" + i + "] = " + Sequence[i]);
        }
    }
}
