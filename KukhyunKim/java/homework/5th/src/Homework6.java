import java.math.BigInteger;

import static java.math.BigInteger.*;

public class Homework6 {
    public static void main(String[] args) {
        /*
        6. 45678911234라는 숫자를 Biginteger에 배치한다.
           각 자리수에 맞는 숫자를 배열에 배치하도록한다.
           ex) 1234 = 1X10^3 + 2X10^2 + 3X10^0
               arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1
         */

        /*
          4  5  6  7  8  9  1  1  2  3  4 라는 엘리먼트를
         [0][1][2][3][4][5][6][7][8][9][10]라는 인덱스에 넣는다.

         1. 10의 제곱으로 나눈다.
         2. 나온 몫을 인덱스에 넣는다.
         3. 출력
         */
        BigInteger testNum = new BigInteger("45678911234");
        // 표현할 슛자 상자에 지정

        final BigInteger BASE = TEN;
        // 10의 제곱마다 상자에 배열상자에 넣을것이므로 베이스를 10으로 잡음.

        BigInteger mantissa = ZERO;
        // 나머지값을 없애려고? 상자를 만듦 <----- 이게 맞나..?
        // mantissa = 소수 이니깐 맞는것 같음

        BigInteger n = testNum.divide(TEN);
        // 표현할 숫자를 베이스(TEN)로 나눠서 확인하기 위해 상자 n을 만듦

        while (n.compareTo(ZERO) == 1) {
            // n과 zero상자의 값을 비교 == 같은가?를 확인
            // 같으면 0, n이 ZERO보다 크면 1

            n = n.divide(TEN);
            // 1. 비교해서 나온 n값을 n.divide(TEN)상자에 넣는다??
            // 2. divide = 나눈값 이므로, n을 ten으로 나눈값을 상자n으로 하겠다라고 표현..?
            // 3. 와일문 이전에 만든 n상자에 와일문에서 나온 n값을
            //    베이스(TEN)상자에 들어있는것으로 나눈후 넣는다?

            mantissa = mantissa.add(ONE);
            // ??????????????
            // 몫을 n에 넣고 남은 소수 부분을 mantissa.add(ONE)이라는 상자에 넣는다????????
        }
            int length = mantissa.intValue();
            // 와일문에서 나온값(BigInteger)을 int상자에 int크기로 지정..??

            System.out.println("45678911234의 길이: " + (length + 1));
            // 표현할 숫자의 총길이 출력
            // * +1 한이유는 길이가 0부터 시작해서 1을 더한다

            int[] numArr = new int[length + 1];
            // 배열에쓸 상자 갯수 생성

            for (int i = length; i >= 0; i--) {
                // 각 상자에 Length 값을 1씩 빼면서 각상자에 엘리멘트 배정

                numArr[i] = testNum.divide(
                        // 배열 상자i마다 표현숫자를 ()로 나눠라 뿌려라

                        new BigInteger(
                                // BigInteger로 크기 지정

                                String.valueOf(
                                        // ????
                                        // ()안의 값을 스트링으로 표현한다? 음..
                                        // 무슨 뜻인가요 아직도 잘모르겠네요..

                                        BASE.pow(i)
                                        // 10^i승만큼

                                )
                        )
                ).mod(
                        TEN
                ).intValue();
                // .intValue()가 메소드라는데 메소드가 뭘까요..?
                // 일단 해당 명령문이 나온값을 다시 인티져값으로 변환해주는것같은데
                // 이게 맞는지 모르겠네요..
                // mod(TEN) 값을 int벨류로 변환 이 맞는거같은데

                System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
                 // 줄세워놓은 인덱스에 지정된값이 몇인지 세워보기 출력
            }
            System.out.println("실제 집어넣은 값: " + testNum);
             // 처음 표현하고자 했던 숫자를 출력
    }
}

/* Q1. while 부분부터 해석이 잘안되는데 해석을 다시 해주실수있으신지..
       분명 수업들을때는 이해가 됬던거같은데 혼자서 코드를보고 해석해보려니
       해석이 전혀안되네요.. 어째서 사용한거고 사용한게 어떤역할을 하는지 궁금하네요.

   Q2. for (int i = length; i >= 0; i--) {
        numArr[i] = testNum.divide(new BigInteger(String.valueOf(BASE.pow(i)))).mod(TEN).intValue();
        }
        이부분중 String.valueOf, mod(TEN).intValue() 이부분이 해석이 안되서
        어떤이유에서 사용한거고 어떤역할을 하는지 알고싶습니다.
 */