import java.math.BigInteger;

public class Homework_06 {
    public static void main(String[] args) {
        //6. 45678911234라는 숫자를 BigInteger에 배치한다.
        //   각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        //   ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
        //   arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

        BigInteger num1 = new BigInteger("45678911234");

        BigInteger[] arr = new BigInteger[11];

        // 세는 법은 모르니 일단 갯수를 지정해야겠다. >>> 11자리 숫자임.

        BigInteger numTen = new BigInteger("10");
        //BigInteger result = new BigInteger("0");
        for (int i =0; i < arr.length; i++){
            arr[i] = num1.remainder(numTen);
            num1 = num1.divide(numTen);
            System.out.printf("arr[%d]에 들어있는 값은 %d\n",i,arr[i]);
        }

    }
}
