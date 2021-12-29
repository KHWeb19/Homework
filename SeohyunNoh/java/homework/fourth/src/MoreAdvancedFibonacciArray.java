import java.math.BigInteger;
import java.util.Scanner;

public class MoreAdvancedFibonacciArray {
    public static void main(String[] args) {
        // int타입은 표현하는 숫자의 한계가 있기 때문에
        // 방대한 숫자를 표현할 땐
        // BigInteger타입의 변수로 작업하기

        /*
        <BigInteger 주의사항>
        1. 상수를 집어넣을 때
        int타입 >> sequence[0] = 1;
        BigInt타입 >> sequence[0] = new BigInteger("1");
        new BigInteger("집어넣을 숫자") 형식으로 표현해야함

        2. 더하는 식을 표현하고 싶을 때
        int타입 >> sequence[i] = sequence[i-1] + sequence[i-2];
        BigInt타입 >> sequence[i] = sequence[i-1].add(sequence[i-2]);
                    (참고로 출력할때도 printf는 못 씀)
         */

        final int START = 2;

        BigInteger[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.println("몇 번째 항을 구할까요?");
        int end = scan.nextInt();

        sequence = new BigInteger[end];

        sequence[0] = new BigInteger("1");
        sequence[1] = new BigInteger("1");

        for(int i = START; i < end; i++){
            sequence[i] = sequence[i - 1].add(sequence[i - 2]);
            System.out.println("arr[" + i + "] = " + sequence[i]);
        }
    }
}
