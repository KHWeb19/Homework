import java.math.BigInteger;

public class HW6 {
    /* 45678911234라는 숫자를 BigInteger에 배치한다.
     각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
     ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
     arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1 */
    //1. BigInteger를 만든다
    //2.배열 만든다
    //3.하나하나 넣는다...?
    public static void main(String[] args) {

        BigInteger num = new BigInteger("45678911234"); // 1번 완료
                                                            // 45678911234는 10의10승 자리까지 있음.
                                                            // 배열 10개 만들어야함...for문 사용

        //int arr [] = new int [11];
        BigInteger[] arr = new BigInteger[11];

        // arr[i]=num%(10^(i+1))
        for (int i = 0; i < 11; i++) {
            //arr[i]= num % 10 ^(i+1))//10^(i)
            while ((!num.equals(BigInteger.valueOf(0)))){

                //예를 들어 num=1234이면 10으로 나눈 나머지 =4 첫째자리
                // 그 다음 num은 1234에서 10을 나눈 몫= 123
                // num 123에서 10으로 나눈 나머지 =3 둘째자리 ...반복

              arr[i] = num.remainder(BigInteger.valueOf(10));
              num = num.divide(BigInteger.valueOf(10));


              // System.out.printf("arr[%d]:%d\n",i, arr[i]);// 여기넣으면 숫자는 출력되나 i값이 하나로 나옴
            }
            System.out.printf("arr[%d]:%d\n",i, arr[i]); //여기 넣으면 i는 제대로  출력되나 arr[i]이 null이 뜸.

            //실제로 몫이 0이 나올때까지 돌려봐야 전체길이를 판정할수가 있음
            //12345라면 10^1승 1234 // 10^2승 123 //10^5 1

       }

    }
}
