import java.math.BigInteger;

import static java.math.BigInteger.*;
import static java.math.BigInteger.TEN;

public class hw6 {
    public static void main(String[] args) {
        BigInteger testNum = new BigInteger("45678911234");

        final BigInteger BASE = TEN;

        BigInteger mantissa = ZERO;

        BigInteger n = testNum.divide(TEN);

        while (n.compareTo(ZERO) == 1) { // n이 0 보다 크면 여전히 10^n 으로 나눌 수 있으므로 계속 나눔
            n = n.divide(TEN);          // 두 번째 10 으로 나누기 (즉 100 나누기), 다음 1000 나누기 ...
            mantissa = mantissa.add(ONE); // log10(100) = 2 이므로
        }

        int length = mantissa.intValue();   // 최종 결과에 + 1을 해야함 (초기 10 나눈건 계산 안함)
        System.out.println("45678911234의 길이: " + (length + 1));

        int[] numArr = new int[length + 1];

        // 조건이 없음 - 언제 끝날지 모르니까 (feat by 무한 정수)
        for (int i = length; i >= 0; i--) {

            numArr[i] = testNum.divide(
                    new BigInteger(
                            String.valueOf(BASE.pow(i)))).mod(TEN).intValue();   // BigInteger를 int로 변환함

            System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
        }
        System.out.println("실제 집어넣은 값: " + testNum);
    }
}