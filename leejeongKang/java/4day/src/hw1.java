import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {

        final int START = 1;
        final int END = 32;
        final int MAX = 32;

        int [] arr = new int[MAX];
        arr[0]=START;
        for (int i=START; i <END; i++){
            arr[i] = arr[i-1]*2;
            System.out.printf("%d항 = %d\n", i, arr[i]);
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 항 값을 입력하시오 : ");
        int num = scan.nextInt();
        System.out.printf("값 : %d", arr[num]);



    }
}
