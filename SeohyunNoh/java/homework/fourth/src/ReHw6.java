import java.math.BigInteger;

public class ReHw6 {
    public static void main(String[] args) {
        //다시 해보기!!!
        /*
        1. BigInteger형태의 큰 숫자 배치
        2. 숫자길이가 얼마인지를 알아낼 수 있는 장치가 필요함
        --> 상용로그 활용
            log10(100) = 2 , log10(1000) = 3 ... 이런 원리로 자릿수 판별가능

        3. 알아낸 길이값을 배열의 개수로서 할당
        4. 루프를 돌면서 10^n승을 나눠서 몫을 구하고
            이 몫을 다시 10으로 나눠서 나머지를 배열에 배치
        5. n값을 3번에서 알아낸 길이값부터 0까지 내려가면서 진행
        6. 최종적으로 각 자리 숫자를 모두 추출
        7. 배열 인덱스 0에 들어가는 x는 10^0 * x 를 의미
           배열 인덱스 1에 들어가는 y는 10 * y 를 의미
         */

        BigInteger testNum = new BigInteger("45678911234");

        // 10으로 나눌 것이기에 이렇게 지정
        // BigInteger는 숫자를 10이 아닌 문자(TEN)으로 쓰기
        final BigInteger BASE = BigInteger.TEN;

        // mantissa : 소수 부분
        BigInteger mantissa = BigInteger.ZERO;
        // 초기 testNum을 10으로 나눠서 몫이 있는지 검사
        BigInteger n = testNum.divide(BigInteger.TEN);

        while(n.compareTo(BigInteger.ZERO) == 1){
            n = n.divide(BigInteger.TEN);
            mantissa = mantissa.add(BigInteger.ONE);
        }

        int length = mantissa.intValue();
        System.out.println("45678911234의 길이 : " + (length + 1));

        int[] numArr = new int[length + 1];

        for(int i = length ; i >= 0 ; i--){
            numArr[i] = testNum.divide(
                    new BigInteger(
                    String.valueOf(
                            BASE.pow(i)
                    )
                    )
            ).mod(
                    BigInteger.TEN
            ).intValue();

            System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
        }

        System.out.println("실제 집어넣은 값: " + testNum);

    }
}
