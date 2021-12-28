import java.math.BigInteger;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        /* 문제 2. 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
                    BigInteger를 통해서 50번째 항을 구해보자!
         */

        /*
        1. for문으로 범위 변수지정(50번째항은 데이터양이 크므로 BigInteger사용)
        2. 배열의 베이스가될 인덱스에 엘리먼트 지정
        3. 베이스를 사용하여 나머지 인덱스에 엘리먼트 자동조정
        4. 1,2,3이 마친 값중 스캔가능하게 조정
        5. 스캔값 출력
         */

        final int START = 2;

        BigInteger[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("등비수열의 몇 번째 항을 구할까요 ? ");
        int end = scan.nextInt();

        sequence = new BigInteger[end];

        sequence[0] = new BigInteger("1");
        sequence[1] = new BigInteger("2");

        for (int i = START; i < end; i++) {
            sequence[i] = sequence[i - 1].add(sequence[i - 1]);
            System.out.println("arr[" + i + "] = " + sequence[i]);
        }
    }
}
