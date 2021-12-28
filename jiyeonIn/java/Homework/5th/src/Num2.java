import java.math.BigInteger;

public class Num2 {
    public static void main(String[] args) {
        /*
        1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
        BigInteger를 통해서 50번째 항을 구해보자!
         */

        final int END = 50;
        BigInteger[] sequence = new BigInteger[END];


        final int START = 1;

        sequence[0]= new BigInteger("1");
        System.out.printf("arr[%d] 값은 %d\n",0,sequence[0]);
//
//        for(int i = START ; i<END;i++){
//            sequence[i] = sequence. // 빅인티져의 제곱하는 법을 모르겠습니다.
//            System.out.printf("arr[%d] 값은 %d\n",i,sequence[i]);

        }

    }

