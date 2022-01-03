import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        /*
        1. 첫 번째 항은 1로 지정해주고
        2. current항은  *= 2 의 규칙을 넣어주면 되나
         */

        final int START = 1;

        int[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 항을 구할까요?");
        int enter = scan.nextInt();

        sequence = new int[enter];

        // i*=2를 한 건 맞는 거 같은데
        // 원하는대로 출력이 안된다
        for(int i = START; i < enter ; i *= 2){
            System.out.println(sequence[i]);
        }







    }
}
