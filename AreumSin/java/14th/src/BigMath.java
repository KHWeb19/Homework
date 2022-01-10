import java.math.BigInteger;

import static java.math.BigInteger.*;

public class BigMath {
    static int arrLength;
    static BigInteger bigNum;
    // 유틸리티 메서드란
    // Math.rand()
    // 범용화 되어 있고 일반화 시킬 수 있을때, 예) 수학 (변하지 않음) -> log 구하는 방식은 변하지 않는다.

    static public int log10(BigInteger num){
        bigNum = num;
        BigInteger mantissa = ZERO;

        int tmp;
        BigInteger n = num.divide(TEN);

        while (n.compareTo(ZERO) == 1) {
            n = n.divide(TEN);
            mantissa = mantissa.add(ONE);
        }
        tmp = mantissa.intValue();

        arrLength = tmp+1;
        return arrLength;
    }

    static public void bigLocationCheck(){
        int[] numArr = new int[arrLength];


        for (int i = arrLength -1; i >= 0; i--) {

            numArr[i] = bigNum.divide(
                    new BigInteger(
                            String.valueOf(
                                    //Math.pow(BASE, i)
                                    TEN.pow(i)
                            )
                    )
            ).mod(
                    TEN
            ).intValue();
            System.out.printf("numArr[%d] = %d\n", i, numArr[i]);
        }

        System.out.println("실제 집어넣은 값: " + bigNum);
    }

}
