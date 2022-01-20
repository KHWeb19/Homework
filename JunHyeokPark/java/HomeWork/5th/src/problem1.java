import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        final int START = 1;

        int[] seq;

        Scanner scan = new Scanner(System.in);

        System.out.println("등비수열의 몇번째 항을 구할까요?");
        int end = scan.nextInt();

        seq = new int[end];

        seq[0] = 1 ;

        for(int i = START; i<end; i++){
            seq[i] = seq[i-1] *2;
            System.out.printf("seq[%d]= %d\n",i,seq[i]);
        }
    }
}
