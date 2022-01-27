import java.math.BigInteger;
import java.util.Scanner;

public class Homework_02 {
    public static void main(String[] args) {
        // 배열을 사용하지않음.
        // 배열을 사용해서 시도.

        final int NUMBER =2; // N^2이 반복함.
        BigInteger base = new BigInteger("1");

        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 위치를 입력해주세요 : ");

        int num = scanner.nextInt(); // num에 입력받은 숫자를 저장됨.

        //num 까지 반복해야함.
        // 배열의 크기는 num 까지 해야함. 0부터 시작이니깐 가능.

        BigInteger[] seq = new BigInteger[num];

        for (int i = 0; i < num; i++){
            seq[i] = base;
            base = base.multiply(BigInteger.valueOf(NUMBER));

            System.out.printf("%d의 해당하는 수는 %d 입니다.\n",i+1,seq[i]);

        }
    }
}
