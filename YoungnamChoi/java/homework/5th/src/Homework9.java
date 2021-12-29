import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        //문제 은행 [ 2 ]의 3번을 배열화하여 풀어보자!
        final int SRATR = 3;

        int[] arr;

        Scanner sc = new Scanner(System.in);
        System.out.print("항을 입력하세요 :");
        int end = sc.nextInt();

        arr = new int[end];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = SRATR; i < end; i++) {
                arr[i]=arr[i-3]+arr[i-1];
            System.out.printf("arr[%d] = %d\n" ,i , arr[i]);

        }

    }
}
