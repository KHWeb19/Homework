import java.math.BigInteger;
import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        //문제2. 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
        // BigInteger를 이용해 50번째 항을 구해보자!)

        final int START_IDX = 0;
        final BigInteger BASE = new BigInteger("2");

        System.out.printf("찾고자 하는 수열의 항을 입력해주세요 : ");

        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt();

        BigInteger[] seq  = new BigInteger[idx];
        seq[START_IDX] = new BigInteger("1");

            for(int i = START_IDX; i < idx; i++){
                //Math.pow()는 n승을 계산함
                //Math.pow(x, y) = x^y로 x의 y승을 계산함
                //즉 Math.pow(2, i)는 2의 i승을 의미함
                //2^0 = 1, 2^1 = 2, 2^2 = 4 ...
                seq[i] = seq[i-1].multiply(BASE);
                System.out.println("seq[" + i + "] =" + seq[i]);
            }
        }

    }
