import java.math.BigInteger;
import java.util.Scanner;

public class ReHw2 {
    public static void main(String[] args) {
        final int START = 0;
        // 처음에 final int BASE = 2; 로 했더니
        // 밑에 for내부의 .multiply()에 넣으니 오류가 떴다
        // .multiply()에 BigInteger타입을 넣어야하기때문에 다시 수정함
        final BigInteger BASE = new BigInteger("2");

        System.out.print("수열 몇 항을 찾을까요?");

        Scanner scan = new Scanner(System.in);
        int enter = scan.nextInt();

        BigInteger[] sequence = new BigInteger[enter];
        sequence[START] = new BigInteger("1");

        //1항은 출력이 안되길래 1항도 출력할 수 있도록 했음
        System.out.println("1항의 값 : " + sequence[0]);

        for(int i = START + 1 ; i < enter ; i++){
            sequence[i] = sequence[i - 1].multiply(BASE);
            System.out.println(i + 1 + "항의 값 : " + sequence[i]);
        }
    }
}
