import java.math.BigInteger;

import static java.math.BigInteger.*;

public class Homework6 {
    public static void main(String[] args) {
        //45678911234라는 숫자를 BigInteger에 배치한다.
        //각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        // ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
       // arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

       // 숫자를 어떻게 분해할까나아아아 그냥 노가다 문제인가... 아닌가 그것이 문제로다
        // 숫자 구조 분해를 코딩으로 할 수 있는가??
        // 4 x 10^0, 3 x 10^1 , 2 x 10^2 , 1x 10^3 , 1x 10^4, 9 x 10^5 , 8 x 10^6, 7 x 10^7 , 6 x 10^8 , 5 x 10^9 , 4 x 10^10

        //45678911234라는 숫자를 BigInteger에 배치한다.
        //각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        // ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
        // arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

        //몇자리수인지 구함
        // 자릿수로 나누기 시작함
        //나눈 값을 인트로전환
        // 그값을 배열에 대입 (배열 대입전에 배열생성)

        //혼자선 작성 힘들어서 따라적어보면서 복습함
        final BigInteger BASE = TEN;

        BigInteger mantissa = ZERO;
        BigInteger numTest = new BigInteger("45678911234");


        BigInteger n = numTest.divide(TEN);

        while(n.compareTo(ZERO) == 1){
            n = n.divide(TEN);
            mantissa = mantissa.add(ONE);
        }                    // 몇자리수인지 구함 , mantissa 타입 변경

        int length = mantissa.intValue(); // length +1 하면 길이 나옴 -> 초기에 한번 10으로 나누었기 때문

        int[] numArr = new int[length + 1];

        for(int i = length; i >= 0 ; i -- ){ // 자릿수보다 한자릿수 낮은 10의제곱근으로 나누면 그 몫이 자릿수의 숫자이기 떄문에 length로 시작
                numArr[i] = numTest.divide(
                        new BigInteger(
                                String.valueOf(
                                        BASE.pow(i)
                                )
                        )
                ).mod(
                        TEN
                ).intValue();
            System.out.printf("numArr[%d] = %d\n", i, numArr[i]);


        }

        System.out.println("실제 집어넣은 값: " + numTest);









    }
}
