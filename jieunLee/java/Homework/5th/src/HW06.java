import java.math.BigInteger;

public class HW06 {
    public static void main(String[] args) {
        //6. 45678911234라는 숫자를 BigInteger에 배치한다.
        //   각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        //   ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
        //        arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

        //1) 변수 선언
        //2) 10의 n승으로 나눠서 각 자리의 숫자 구하기
        //2) 자릿수만큼의 갯수를 가진 배열 생성
        //3) for문으로 한자리씩 배열에 넣기

        //BigInteger 1~1000000000를 for문으로 한자리씩 추가하고싶은데
        //어떻게 하면 좋을지 모르겠습니다!

        final int LENGTH = 11;
        BigInteger[] arr = new BigInteger[LENGTH];

        BigInteger num = new BigInteger("45678911234");
        BigInteger quo = num.divide(new BigInteger("10000000000"));
        arr[10] = quo;
        System.out.println(arr[10]);

        num = num.subtract(quo.multiply(new BigInteger("10000000000")));
        quo = num.divide(new BigInteger("1000000000"));
        arr[9] = quo;
        System.out.println(arr[9]);

        num = num.subtract(quo.multiply(new BigInteger("1000000000")));
        quo = num.divide(new BigInteger("100000000"));
        arr[8] = quo;
        System.out.println(arr[8]);

        num = num.subtract(quo.multiply(new BigInteger("100000000")));
        quo = num.divide(new BigInteger("10000000"));
        arr[7] = quo;
        System.out.println(arr[7]);

        num = num.subtract(quo.multiply(new BigInteger("10000000")));
        quo = num.divide(new BigInteger("1000000"));
        arr[6] = quo;
        System.out.println(arr[6]);

        num = num.subtract(quo.multiply(new BigInteger("1000000")));
        quo = num.divide(new BigInteger("100000"));
        arr[5] = quo;
        System.out.println(arr[5]);

        num = num.subtract(quo.multiply(new BigInteger("100000")));
        quo = num.divide(new BigInteger("10000"));
        arr[4] = quo;
        System.out.println(arr[4]);

        num = num.subtract(quo.multiply(new BigInteger("10000")));
        quo = num.divide(new BigInteger("1000"));
        arr[3] = quo;
        System.out.println(arr[3]);

        num = num.subtract(quo.multiply(new BigInteger("1000")));
        quo = num.divide(new BigInteger("100"));
        arr[2] = quo;
        System.out.println(arr[2]);

        num = num.subtract(quo.multiply(new BigInteger("100")));
        quo = num.divide(new BigInteger("10"));
        arr[1] = quo;
        System.out.println(arr[1]);

        num = num.subtract(quo.multiply(new BigInteger("10")));
        quo = num.divide(new BigInteger("1"));
        arr[0] = quo;
        System.out.println(arr[0]);







    }
}
