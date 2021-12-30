import java.math.BigInteger;

import static java.math.BigInteger.*;

public class HW6_1 {                           //큰 정수를 고정값으로 놓지 말고 구해보자
    public static void main(String[] args) {

        BigInteger num = new BigInteger("45678911234");


        BigInteger mantissa = ZERO;  //초기화한거

        BigInteger n = num.divide(TEN);       //초기 num을 10으로 나눠서 몫이 있는지를 검사함(**)
        //자리수의 길이를 알아내려고 하는 것
        while (n.compareTo(ZERO) >0) {      // compareTo는 n값과 ZERO(0)을
                                              // n이 더 크면 결과가 1이 나오고 같으면 0이 나옴
            n = n.divide(TEN);
            mantissa = mantissa.add(ONE);     //while을 도는 동안 몫의 자리가 계속 나눠지면 자리수는 +1씩 더해진다
         }

        int length = mantissa.intValue();   // 최종 결과에 + 1을 해야함 (**) 이때의 값을 더하는 것
        System.out.println("45678911234의 길이: " + (length + 1));

        int[] numArr = new int[length + 1];

        for (int i = length; i >= 0; i--) { //여기엔 왜 int i = [length+1]이 들어가지 않나??배열이라 0부터 시작이라 그런가?

            //numArr[i] = num.divide(Math.pow(BASE,i)).mod(TEN);
            // 원래는 이 형식이나 BigInteger이라 써지지가 않음.

            numArr[i] = num.divide(new BigInteger(String.valueOf(TEN.pow(i)))).mod(TEN).intValue();
            //(BASE.pow(i))를 문자열로 만들어주고 그것을  BigInteger에 넣은 다음 나머지 10을 하여
            // 남은 값을 .intValue()을 통해서 int형으로 바꿔준건가?

            System.out.printf("arr[%d]:%d\n", i, numArr[i]);
        }
        System.out.println("실제값: " + num);
    }
}


