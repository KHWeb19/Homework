import java.math.BigInteger;
import static java.math.BigInteger.*;

public class HW06 {
    public static void main(String[] args) {
        //6. 45678911234라는 숫자를 BigInteger에 배치한다.
        //   각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        //   ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
        //        arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

        //1) 변수의 자릿수구하고 그 크기의 배열 만들기
        //   ---> 변수를 0과 비교해서 변수가 더 큰 동안에 10^0~10^N까지 나눠서 N을 구함
        //        BigInteger.* import하면 10=TEN 0=ZERO로 선언가능
        //2) 10의 n승으로 나눠서 각 자리의 숫자 구하기
        //   for문으로 한자리씩 배열에 넣기
        //   bigInteger n제곱 구하기 --> .pow(n)

        BigInteger num = new BigInteger("45678911234");

        final BigInteger NTEN = TEN;
        BigInteger pow = ZERO;
        BigInteger n = num;

        while (n.compareTo(ZERO) == 1) {
            n = n.divide(NTEN);
            pow = pow.add(ONE);
        }

        int length = pow.intValue();
        BigInteger[] arr = new BigInteger[length];
        BigInteger quo;

        for (int i=length; i>0; i--) {
            quo = num.divide(NTEN.pow(i-1));
            num = num.subtract(quo.multiply(NTEN.pow(i-1)));
            arr[length-i] = quo;
            System.out.println("arr[" + (length-i) + "] = " + quo);
        }
    }
}
