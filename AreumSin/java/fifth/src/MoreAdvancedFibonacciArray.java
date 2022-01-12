import java.math.BigInteger;
import java.util.Scanner;

public class MoreAdvancedFibonacciArray {
    public static void main(String[] args) {

        final int START = 2;

        BigInteger[] sequence;
        //BigInteger은 정수형 숫자를 데이터 크기에 상관없이 나타내고 싶을때 사용한다? --> 이게 맞을까..?

        Scanner scanner = new Scanner(System.in);
        System.out.printf("파보나치 수열의 몇 번째 항을 구할까요? ");
        int end = scanner.nextInt();

        sequence = new BigInteger[end];

        sequence[0] = new BigInteger("1");
        sequence[1] =new BigInteger("1");

        for(int i = START; i < end; i++){
            sequence[i] = sequence[i - 1].add(sequence[i - 2]);
            //System.out.printf("arr[%d] = %d\n", i, sequence[i]);
            System.out.println("arr["+i+"] = "+sequence[i]);
        }
    }
}

// Q. 배열을 사용하는 이유?
// A. 동일한 데이터 타입이 너무 많아서 편하게 관리하기 위해
