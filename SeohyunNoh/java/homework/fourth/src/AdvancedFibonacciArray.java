import java.util.Scanner;

public class AdvancedFibonacciArray {
    public static void main(String[] args) {
        // Scanner로 사용자에게 입력받기

        final int START = 2;

        //정수타입의 sequence라는 배열을 초기화해주는건가?
        int[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 항을 구할까요?");
        // nextInt 외에도 데이터타입에 따라
        // nextFloat, nextDouble 등도 가능
        // 사용자가 입력한 정수를 받는 것?
        int end = scan.nextInt();

        sequence = new int[end];

        sequence[0] = 1;
        sequence[1] = 1;

        for(int i = START ; i < end ; i++){
            sequence[i] = sequence[i - 1] + sequence[i - 2];
            System.out.printf("arr[%d] = %d\n", i, sequence[i]);
        }



    }
}
