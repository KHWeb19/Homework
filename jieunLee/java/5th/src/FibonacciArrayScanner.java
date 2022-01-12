import java.util.Scanner;

public class FibonacciArrayScanner {
    public static void main(String[] args) {
        System.out.println("피보나치 수열의 몇 번째 항을 출력할까요? ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        final int START = 3;
        int[] arr = new int[num+1];
        arr[1] = 1;
        arr[2] = 1;
        for (int i=START; i<=num; i++) {
            arr[i] = arr[i-2] + arr[i-1];
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
