import java.math.BigInteger;

public class Ans6 {
    public static void main(String[] args) {

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
