import java.math.BigInteger;
import static java.math.BigInteger.*;

public class Q6 {
    public static void main(String[] args) {

        // 6. 45678911234라는 숫자를 BigInteger에 배치한다.
        //    각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        //    ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
        //    arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

        /* 선생님 구현전략
        1. 먼저 BigInteger 형태의 큰 숫자(A)를 배치한다.
        2. 상용로그(log10)을 활용하여 큰 숫자(A)의 길이를 계산한다.
        이 녀석은 어렵게 생각할 필요없이 큰 숫자(A)가 몇 자리가 되는지 판별하는 것임
        예로 1234는 10^3.xxx 로 10의 3승 정도 되는 것을 판정하는 역할
        3. 알아낸 길이값을 기반으로 배열의 개수를 할당한다.
        4. 루프를 돌면서 10^n승을 나눠 몫을 구하고
        이 몫을 다시 10으로 나눠서 나머지를 배열에 배치한다.
        5. n값을 3번에서 알아낸 길이값부터 0까지 내려가면서 진행한다.
        6. 최종적으로 결과를 보면 각 자리숫자를 모두 추출해낸 결과를 얻는다.
        7. 결국 배열 인덱스 0에 들어간 녀석(x)는 10^0 * x를 의미하며
        인덱스 1에 들어간 녀석(y)는 10^1 * y를 의미하게 된다.
        나머지 인덱스들도 마찬가지 역할이 된다. */

        BigInteger bigNum = new BigInteger("45678911234"); // 숫자 배치

        final BigInteger BASE = TEN;
        BigInteger mantissa = ZERO;

        BigInteger n = bigNum.divide(TEN); // 초기 testNum을 10으로 나눠서 몫이 있는지 검사

        while (n.compareTo(ZERO) == 1) { // compareTo는 n값과 ZERO(0)을 비교
            n = n.divide(TEN);
            mantissa = mantissa.add(ONE);

        } // n이 0 보다 크면 여전히 10^n 으로 나눌 수 있으므로 계속 나눔

        int length = mantissa.intValue(); // + 1을 해주어야 함
        System.out.println("45678911234의 길이= " + (length + 1));

        int[] numArr = new int[length + 1];

        for (int i = length; i >= 0; i--) {

            // 조건 X
            // 실제 BigInteger의 경우엔 new BigInteger("문자열") 형식으로 숫자를 초기화함
            // 그러므로 String.valueOf()를 활용하여
            // valueOf() 내에 들어가는 숫자를 ★문자열로 변환★하도록 한다.
            // 그리고 이 변환된 문자열 값을 new BigInteger() 내부에 배치.

            numArr[i] = bigNum.divide(
                    new BigInteger(
                            String.valueOf(
                                    BASE.pow(i)
                            )
                    )
            ).mod(
                    TEN
            ).intValue();

            System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
        }
        System.out.println("실제 집어넣은 값= " + bigNum);

    }
}
