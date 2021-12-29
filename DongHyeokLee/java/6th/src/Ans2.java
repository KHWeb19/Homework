import java.math.BigInteger;
import java.util.Scanner;

public class Ans2 {
    public static void main(String[] args) {
        //아래와 같은 등비 수열이 있다.
        //1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...  -> 규칙 2n승
        //사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자! -> Scanner 사용 , end값으로 받아냄(배열길이)
        //(1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임) -> int 값범위
        //BigInteger 사용
        //배열의 타입 int ->BigInteger 변경


        final int START = 1;
        final BigInteger BASE = new BigInteger("2");// 진수 final 지정


        BigInteger[] sequence;
        Scanner scan = new Scanner(System.in);

        System.out.print("원하는 위치의 값을 입력 하시오 : ");
        int end = scan.nextInt();
        sequence = new BigInteger[end];

        sequence[0] = new BigInteger("1");



        for(int i = START; i < end; i++){
            sequence[i] = sequence[i-1].multiply(BASE);
            System.out.println(i+1 +"항의 값은" + sequence[i] + "입니다");

        }

    }
}




