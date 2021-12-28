import java.math.BigInteger;
import java.util.Scanner;


public class Homework2 {
    public static void main(String[] args) {
        //아래와 같은 등비 수열이 있다.
        //1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...  -> 규칙 2n승
        //사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자! -> Scanner 사용 , end값으로 받아냄(배열길이)
        //(1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임) -> int 값범위
        //BigInteger 사용
        //배열의 타입 int ->BigInteger 변경

        //final int START = 0;
        final int START = 2;

        int i;
        BigInteger[] sequence;
        Scanner scan = new Scanner(System.in);

        System.out.print("원하는 위치의 값을 입력 하시오 : ");
        int end = scan.nextInt();
        sequence = new BigInteger[end];

        sequence[0] = new BigInteger("1");// BigInteger 초항 집어넣는 법 sq[0] = new BigInteger("집어넣을 숫자")
        sequence[1] = new BigInteger("2");//START 변경?


        for(i = START; i < end; i++){

            //sequence[i] = sequence[i-1].multiply(2);//  +는 add였는디... - subtract() / divide() 2를 넣으니 작동을안함
            //sequence[i] = sequence[i-1].multiply(BigInteger.valueOf(2));// 2도 타입 BigInteger로 변경해야하나 봄

            // multiply 와 BigInteger.valueOf는 배우지 않은것 배운걸로만 못하려나
            sequence[i] = sequence[i-1].multiply(sequence[1]);


        }

        System.out.printf("%d항의 값은 %d 입니다.\n", i, sequence[i-1]);
    }
}
