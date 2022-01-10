import java.math.BigInteger;

public class HW6 {
    public static void main(String[] args) {
       /* 45678911234라는 숫자를 BigInteger에 배치한다.
        각 자리수에 맞는 숫자를 배열에 배치하도록 한다
        ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0  */

        //------구상-----
        //1. BigInteger를 만든다
        //2. 일단은 고정값으로 넣고 ...나중에 랜덤값을 넣자
        //3. 나머지를 취하자!!
        //4.이렇게 되면 끝 자리가 먼저 출력된다

        BigInteger num = new BigInteger("45678911234");
        BigInteger[] arr = new BigInteger[11];// 일단 11자리로 고정해놓고 처음에 풀어보자


        for (int i=0; i< 11 ;i++) {

            if ((!num.equals(BigInteger.valueOf(0)))) {
                arr[i] = num.remainder(BigInteger.valueOf(10));
                num = num.divide(BigInteger.valueOf(10));

            }
            System.out.printf("arr[%d]:%d\n",i, arr[i]);
        }












    }
}
