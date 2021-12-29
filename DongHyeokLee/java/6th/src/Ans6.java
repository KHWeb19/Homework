import java.math.BigInteger;

import static java.math.BigInteger.*;




public class Ans6 {
    public static void main(String[] args) {

        BigInteger testNum = new BigInteger("45678911234");


        final BigInteger BASE = TEN; //Q. TEN이나 ZERO를 리터럴값으로 사용하면 10이랑 0으로 되는건가??
        BigInteger mantissa = ZERO;

        BigInteger n = testNum.divide(TEN);

        while (n.compareTo(ZERO) == 1) { // 이것은 몫이 0이나오면 그전까지가 자릿값이므로 그것을 구분하는것인거 같다
            n = n.divide(TEN); // 이것은 지금 문제에 나온 숫자의 자릿값을 구하는것 같다
            mantissa = mantissa.add(ONE); // 자릿값이 몇인지 구하는것 같다
        }

        int length = mantissa.intValue();
        System.out.println("45678911234의 길이: " + (length + 1)); // 최종 결과에 +1을해야함 (초기 10나눈거 계산안함)

        int[] numArr = new int[length + 1]; // 자릿값 만큼 배열의 길이 지정

        for (int i = length; i >= 0; i--) {

            numArr[i] = testNum.divide(
                    new BigInteger(
                            String.valueOf(

                                    BASE.pow(i)
                            )
                    )
            ).mod(  // 이것은 결국 최종적으로 4가남기때문에 4를 10으로 나누고 나머지인 4를 구하기위해 쓴
                    TEN // 자릿수만큼 나누면 4.5678911234 가나옴 그것을 int형으로 바꾸면 그 자릿수에 대응하는 값 4가나옴
            ).intValue();
            System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
        }
        System.out.println("실제 집어넣은 값: " + testNum);
    }
}
