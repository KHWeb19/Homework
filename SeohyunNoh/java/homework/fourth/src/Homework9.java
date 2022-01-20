import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        //1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        //출력이 잘 되지않는다
        //변수설정도 수열 규칙도 맞게 세운거 같은데 왜 결과가 안나오지


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
            System.out.println(sequence[i]);
        }
    }
}
