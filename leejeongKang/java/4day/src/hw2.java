import java.util.Scanner;
import java.math.BigInteger;

public class hw2 {
    public static void main(String[] args) {

        final int START = 1;
        final int END = 50;
        int i;
        BigInteger[] arr;
        arr = new BigInteger[50];
        arr[0] = new BigInteger("1");

        for (i=START; i <END; i++){
            arr[i] = arr[i-1].multiply(BigInteger.valueOf(2));
            arr[i-1] = arr[i];
            System.out.printf("%d항 = %d\n", i+1, arr[i]);
        }




    }
}
