import java.util.Scanner;
import java.math.BigInteger;
public class problem2 {
    public static void main(String[] args) {
        final int START = 1;

        BigInteger[] seq;

        Scanner scan = new Scanner(System.in);

        System.out.println("등비수열의 몇번째 항을 구할까요?");
        int end = scan.nextInt();

        seq = new BigInteger[end];

        seq[0] = new BigInteger("1") ;

        for(int i = START; i<end; i++){
            seq[i] = seq[i-1].add(seq[i-1]) ;
            //BigInteger 타입의 곱셈은 어떻게 해야되는지 몰라서 덧셈으로 진행했습니다.
            //혹시 곱셈은 어떤식으로 표현을 해야되는지 궁금해요
            System.out.printf("seq[%d]= %d\n",i,seq[i]);
        }
    }
}

