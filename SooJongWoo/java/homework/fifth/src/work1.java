import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        final int MAX = 100;
        final int START = 2;

        Scanner scan = new Scanner(System.in);

        System.out.print("몇번째 항을 구할까요?");
        int[] arr = new int[MAX];
        int END = scan.nextInt();


        arr[0] = 1;
        arr[1] = 1;

        for (int i = START; i < END; i++) {
            arr[i] = arr[i - 1] + arr[i - 1];
            System.out.println("arr[" + i + "] =" + arr[i]);

        }
    }
}
