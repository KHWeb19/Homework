import java.math.BigInteger;
import java.util.Scanner;

public class AdvancedFiboArray {
    public static void main(String[] args) {
        final int START = 2;
        final int END = 20;

        int [] sequence;

        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번째 항?");

        int end=sc.nextInt();
        sequence = new int [end];

        sequence[0] = 1;
        sequence[1] = 1;

        for(int i =START;i<END;i++){
            sequence[i]=sequence[i-1]+sequence[i-2];
            System.out.printf("arr[%d] = %d\n",i,sequence[i]);
        }


    }
}
