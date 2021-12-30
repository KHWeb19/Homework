import java.math.BigInteger;

import static java.math.BigInteger.*; // BigInteger.를 제외해도 쓸 수 있게 만듬

public class P06 {
    /* Q. 45678911234라는 숫자를 BigInteger에 배치, 각 자리에 맞는 숫자를 배열에 배치

     (전략)
     1. 값을 BigInteger에 입력
     2. 값의 자리수를 찾기 -- 값의 자리수만큼 순환
     3. 자리수 크기의 배열 생성
     4. 배열 생성후 배열[자리수]에 자리수 몫만큼 입력
     5. 결과 출력

     (필요한 구문)
     1. 값을 BigInteger에 입력
     2. 자리수 찾기
     3. 배열에 배치

     */
    public static void main(String[] args) {

        // BigInteger에 배치
        BigInteger testNum = new BigInteger("45678911234");

        /* testNum의 자릿수 찾기

         (전략 1)
         1. 몫이 존재하면 자릿수
         2. testNum값을 10으로 나누고 정수화시켰을때, 1보다 크거나 같으면 몫이 존재한다고 말할 수 있음
         3. ex) 101
            101 / 10 = 10.1 -- 몫 존재 + 1
            10.1 / 10 = 1.01 -- 몫 존재 + 1
            1.01 / 10 = 0.101 -- 몫 없음 + 0
              cf) testNum은 양의 정수값이므로, 최소 1자리는 차지하고 있음 --- 0.x = 10^(음수값) or 음의 정수를 고려할 필요가 없음.
         4. 몫이 0이 될때까지 반복하여 자릿수를 구할 수 있음

         (전략 2)
         1. 상용로그를 취해서 나온 값 + 1 : 자릿수! (마찬가지로 로그값이 음수일경우를 고려할 필요가 없음)
         ----- BigInteger 에는 log값을 찾는 연산자가 없음. == 1번 전략을 이용해야함!
         */

        final BigInteger BASE = TEN; // BigInteger.TEN = 10의 BigInteger값 || BASE = 진수값 -- 10진수이므로 10
        BigInteger mantissa = ZERO; // 자리수 계산 변수 || Zero = new BigInteger

        BigInteger n = testNum.divide(TEN); // n을 10으로 나누었을때 몫

        // 자릿수 찾기
        while(n.compareTo(ZERO) == 1){ //n.compareTo(ZERO) = n값과 ZERO를 비교 || n이 더크면 결과가 1, 같으면 0
            n = n.divide(TEN); // 몫이 1이상이면 다시 10으로 나누기
            mantissa = mantissa.add(ONE); // 몫이 1 이상이면 자릿수에 1 추가
        }

        int length = mantissa.intValue(); // 자릿수 입력, intValue = int로 변환 -- int 배열을 사용할 것이기 때문!

        int[] numArr = new int[length + 1]; // 배열 생성 || 자릿수이므로 + 1 필요

        /* 배열에 배치

        (최초 전략 -- 정답 확인 전)

        1. testNum을 10^length로 나누어 생긴 몫을 numArr[]에 입력
        2. 그냥 나눈 몫을 넣으면 오류가 생기므로, 추가 변수 sum을 생성후 sum을 나누어 입력
        3. (int로 코드를 짠다면)

           int sum = testNum
           for (int i = length; i >= 0; i--){
           numArr[i] = (int)(sum / Math.Pow(BASE, i))
           sum -= numArr[i] * Math.Pow(BASE, i)
           }

        (최종 전략)

         ex)  1234
              1234 % 10        = 4
              1234 / 10 % 10   = 3
              1234 / 100 % 10  = 2
              1234 / 1000 % 10 = 1

        1. testNum을 자릿수로 나눈값에 첫째자리만 필요하므로
        2. 값을 다시 10으로 나누어서 나머지를 numArr[length]에 입력!

         */

        for(int i = length; i >= 0; i--){
            numArr[i] = testNum.divide( //testNum을 BASE(= 10)의 진수로 나누기
                    new BigInteger(
                            String.valueOf(
                                    // Math.pow(BASE, i)
                                    BASE.pow(i) // BigInteger 입력이므로 String으로 입력 || String. = 문자열로
                            )
                    )
            ).mod( // 나머지 값 계산
                    TEN
            ).intValue(); // int값으로 변환 || numArr = int 값이므로

            System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
        }
        System.out.println("입력 값 : " + testNum);
    }
}