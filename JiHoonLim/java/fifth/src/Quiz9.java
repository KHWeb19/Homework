import java.util.Scanner;

public class Quiz9 {
    public static void main(String[] args) {
        /*
        1. 피보나치와 비슷원리
         */
        final int START = 3;

        int [] arr;

        Scanner scan = new Scanner(System.in);
        System.out.print(" 몇 번째 항이 궁금하신가요?");
        int end = scan.nextInt();

        arr = new int[end];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        System.out.println(1+ "항은 " +1);
        System.out.println(2+ "항은 " +1);
        System.out.println(3+ "항은 " +1);

        for (int i = START; i < end; i++){
            arr[i] = arr[i-3] + arr[i-1];
            System.out.println(i+1 + "항은 " +arr[i]);
        }
    }
}
