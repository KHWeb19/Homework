import java.math.BigInteger;

import static java.math.BigInteger.*;

public class Ans6 {
    public static void main(String[] args) {
        BigInteger testNum = new BigInteger("45678911234");


        final BigInteger BASE = TEN;

        BigInteger mantissa = ZERO;
        // 초기 testNum을 10으로 나눠서 몫이 있는지 검사함
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
            // 실제 BigInteger의 경우엔 new BigInteger("문자열") 형식으로 숫자를 초기화함
            // 그러므로 String.valueOf()를 활용하여
            // valueOf() 내에 들어가는 숫자를 문자열로 변환하도록 한다.
            // 그리고 이 변환된 문자열 값을 new BigInteger() 내부에 배치하면 완료!
            numArr[i] = testNum.divide(new BigInteger( String.valueOf(BASE.pow(i)))).mod(TEN).intValue();   // BigInteger를 int로 변환함

            // 실제로 몫이 0이 나올때까지 돌려봐야 전체 길이를 판정할 수 있음
            // 결국 0이 된 시점에서 i값이 큰 숫자의 전체 길이가 될 것임

            // 앞에 숫자가 남아있는 상황이 문제가 되는 케이스
            // ex)  1234
            //      1234 / 1000 = 1
            //      1234 / 100  = 12
            //      1234 / 10   = 123

            //      1234 % 10        = 4
            //      1234 / 10 % 10   = 3
            //      1234 / 100 % 10  = 2
            //      1234 / 1000 % 10 = 1
            System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
        }

        System.out.println("실제 집어넣은 값: " + testNum);
    }
}
