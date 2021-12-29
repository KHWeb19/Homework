import java.math.BigInteger;
import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
/*2. 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
     BigInteger를 통해서 50번째 항을 구해보자!
*/
        final int START = 0;
        final int END = 100;

        BigInteger[] sequence;
        sequence = new BigInteger[END];
        BigInteger sqNum = new BigInteger("2");

        Scanner scan = new Scanner(System.in);

        for (int i = START; i < END; i++) {
            sequence[i] = sqNum.pow(i);
        }

        while(true){
            System.out.print("수열의 몇 번째 항을 출력할까요? : ");
            int inputNum = scan.nextInt();
            System.out.printf("수열의 %d번째 항 = %d\n",inputNum,sequence[inputNum-1]);

        }

    }
}
