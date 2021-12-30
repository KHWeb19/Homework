import java.math.BigDecimal;
import java.math.BigInteger;

public class HW02 {
    // 1번에서 BigInteger로 타입을 바꾸고 50번째 항을 구해보자
    // 50번째 항: 562949953421312


    public static void main(String[] args) {
        final int MAX=  50;

        BigInteger[] myBigInteger = new BigInteger[MAX];

        for (int i=0; i<MAX; i++){

            BigInteger result = BigDecimal.valueOf(Math.pow(2,i)).toBigInteger();

            myBigInteger[i] = result;

            System.out.printf("myBigInteger[%d]: %d\n",i,myBigInteger[i]);

        }

    }

}
