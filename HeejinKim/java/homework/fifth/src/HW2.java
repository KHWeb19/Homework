import java.math.BigInteger;//자동적으로 import를 해줌
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {


        final int START = 2;
        BigInteger MUL= BigInteger.valueOf(2);
        //프로그램이 알아서 변환시켜줌.

        Scanner scan = new Scanner(System.in);

        System.out.print("등비수열 몇번째항 구할까요 ? ");

        int put = scan.nextInt();

        BigInteger[] sequence = new BigInteger[put];


      sequence[0] = new  BigInteger("1");
      sequence[1] = new  BigInteger("2");

        for (int i = START; i < put; i++) {

            sequence[i] = (sequence[i - 1]).multiply(MUL);//수식

            System.out.println("arr[" + i + "] = "+sequence[i]);


        }
    }
}

