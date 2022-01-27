import java.util.Scanner;
//루프 내에서 출력문 사용할 때 주의
public class QnA09 {
    public static void main(String[] args) {
        final int START = 3;

        int[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 항을 구할까요?");
        int end = scan.nextInt();

        sequence = new int[end];

        sequence[0] = 1;
        sequence[1] = 1;
        sequence[2] = 1;

        for(int i = START ; i < end; i++){
            sequence[i] = sequence[i - 1] + sequence[i - 3];
            //System.out.println(sequence[i]);
        }

        System.out.println(sequence[end - 1]);
    }
}