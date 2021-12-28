import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        /*
        9. 문제 은행 [2]의 3번을 배열화 하여 풀어보자!
           문제 은행 [2]-3
           1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129...
           이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!
         */
        /*
        int first = 1;
        int second = 1;
        int third = 1;
        int result = 0, i;

        final int Start = 3;
        final int End = 25;


        for (i = Start; i < End; i++) {
            result = first + third;
            first = second;
            second = third;
            third = result;
         */
        // 위에꺼 배열화시키기
        final int START = 2;

        int[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("수열의 몇 번째 항을 구할까요 ? ");
        int end = scan.nextInt();

        sequence = new int[end];

        sequence[0] = 1;
        sequence[1] = 1;
        sequence[2] = 1;
   //     sequence result = 0;
// result 값을 배열로 지정못하는건가요..?

        for (int i = START; i < end; i++) {
    //        sequence result = sequence[i] + sequence[i+2];
// result 값이 배정이안됬는지 정상작동이 안됨...

            System.out.printf("arr[%d] = %d\n", i, sequence[i]);
        }
    }
}
