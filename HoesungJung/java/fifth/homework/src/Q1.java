import java.util.Scanner;
public class Q1 {



    public static void main(String[] args) {
        final int START = 1;

        int [] arr;

        Scanner sc = new Scanner(System.in);

        System.out.println("몇번째 배수?");
        int end = sc.nextInt();

        arr = new int[end];

        arr[0] = 1;
        arr[1] = 2;

        for (int i = START; i <end; i++){
            arr[i] = (int)(Math.pow(2,i));



            System.out.printf("arr[%d] = %d\n",i,arr[i]);
        }


    }
}
