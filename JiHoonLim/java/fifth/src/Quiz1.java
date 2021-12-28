import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        /*
        1. 2씩 곱하는 등비수열이므로 앞 항에 2를 곱한 값이 다음 항
        2. for문앞에서 순차적으로 2씩 계속 곱한다.
         */
        final int START = 1;
        final int WANT = 2;

        int[] arr;

        Scanner scan = new Scanner(System.in);

        System.out.print("몇번째 항을 구할까요? ");
        int end = scan.nextInt();

        arr = new int[end];

        arr[0]= 1;
        System.out.println("arr[0] = " +arr[0]);

        for (int i = START; i < end; i++){
            arr[i] = arr[i-1] * WANT;
            System.out.printf("arr[%d] = %d\n", i , arr[i]);
        }
    }
}
