import java.util.Scanner;

//문제 은행 [ 2 ]의 3번을 배열화하여 풀어보자!
//1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
//   이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!
public class Home9 {
    public static void main(String[] args) {
        final int START = 3;

        int[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("등차수열의 몇 번째 항을 구할까요 ? ");
        final int END = scan.nextInt();

        sequence = new int[END];

        sequence[0] = 1;
        sequence[1] = 1;
        sequence[2] = 1;

        for (int i = START; i < END; i++) {
            sequence[i] = sequence[i-3] + sequence[i-1];
            sequence[i-3] = sequence[i-2];
            sequence[i-2] = sequence[i-1];
            sequence[i-1] = sequence[i];
            System.out.printf("sequence[%d] = %d\n", i, sequence[i]);
        }
    }
}
