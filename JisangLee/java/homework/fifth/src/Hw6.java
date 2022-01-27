import java.math.BigInteger;

import static java.math.BigInteger.*;

public class Hw6 {
    public static void main(String[] args) {
        //45678911234라는 숫자를 BigInteger 에 배치한다.
        //각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        //ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
        //arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

        //   4            5           6        7           8          9        1          1          2            3         4
        // arr[10]     arr[9]     arr[8]   arr[7]      arr[6]     arr[5]      arr[4]    arr[3]     arr[2]      arr[1]     arr[0]
        //4 x 10^10   5 x 10^9   6 x 10^8   7 x 10^7   8 x 10^6   9 x 10^5   1 x 10^4  1 x 10^3   2 x 10^2    3 x 10^1   4 x 10^0
        //이런 식으로 배치하면 되는 거군..
        //배열이 총 11개가 필요하고
        //for 문을 이용하여 10 ~ 0 까지 i-- 하면 되는건가?

        BigInteger testNum = new BigInteger("45678911234"); // BigInteger로 45678911234 선언

        // 각각의 자리수를 배치하라는 뜻은 두 가지로 구현이 가능하다.
        // 10^n승으로 나눠서 몫을 취하는 방법과
        // 10^n승으로 나눈 나머지를 취하는 방법이 있다.
        // 구현의 난이도를 생각하면 10^n승으로 나눠서
        // 몫을 취하는 방법이 보다 쉬울 것이므로 이 방식을 선택하도록 한다.

        // 1. 몫을 구하는 전략 선택
        // 2. 근대 언제까지 몫을 구해야 하는가 ?
        //    초기 전체 숫자를 10^n승으로 나눠서 몫이 없는지 파악하면 된다.
        // 3. 각 반복마다 찾은 몫은 배열에 배치하는 구조로 구성하면 끝

        // 추가적으로 필요한 사항이 발생!
        // - BigInteger에서 10^n승을 처리할 방법
        // - log_10 (100) = 2
        // - BigInteger.Log (~~~~) = 7.6

        final BigInteger BASE = TEN; //10에^n으로 나누면서 몫을 구할 것이므로 BASE 를 10으로 지정

        BigInteger mantissa = ZERO; //초기 가수를 0으로 설정
        // 초기 testNum을 10으로 나눠서 몫이 있는지 검사함
        BigInteger n = testNum.divide(TEN);
        // compareTo는 n값과 ZERO(0)을 비교하는 것임
        // n이 더 크면 결과가 1이 나오고 같으면 0이 나옴
        while (n.compareTo(ZERO) == 1) { // n이 0 보다 크면 여전히 10^n 으로 나눌 수 있으므로 계속 나눔
            n = n.divide(TEN);          // 두 번째 10 으로 나누기 (즉 100 나누기), 다음 1000 나누기 ...
            mantissa = mantissa.add(ONE); // log10(100) = 2 이므로
        }

        // log10(100) ===> 10^x = 100일 경우 x는 얼마냐 ?
        // log10(1000) ==> 10^x = 1000 등등
        // 2, 3, 4로 길이값을 알아낼 수 있음

        int length = mantissa.intValue();   // 최종 결과에 + 1을 해야함 (초기 10 나눈건 계산 안함)
        System.out.println("45678911234의 길이: " + (length + 1));

        int[] numArr = new int[length + 1];

        // 조건이 없음 - 언제 끝날지 모르니까 (feat by 무한 정수)
        for (int i = length; i >= 0; i--) {
            // 실제 BigInteger의 경우엔 new BigInteger("문자열") 형식으로 숫자를 초기화함
            // 그러므로 String.valueOf()를 활용하여
            // valueOf() 내에 들어가는 숫자를 문자열로 변환하도록 한다.
            // 그리고 이 변환된 문자열 값을 new BigInteger() 내부에 배치하면 완료!
            numArr[i] = testNum.divide(
                    new BigInteger(
                            String.valueOf(
                                    //Math.pow(BASE, i)
                                    BASE.pow(i)   //10의 i승
                            )
                    )
            ).mod(
                    TEN
            ).intValue();   // BigInteger를 int로 변환함

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
