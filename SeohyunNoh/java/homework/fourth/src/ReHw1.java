import java.util.Scanner;

public class ReHw1 {
    public static void main(String[] args) {
        // n승을 계산하고자 할 때
        // Math.pow(x,y)를 사용하면 된다 --> x의 y승

        final int MAX = 31;
        final int START = 0;

        final int BASE = 2;

        System.out.print("수열 몇 항을 찾을까요?");

        Scanner scan = new Scanner(System.in);
        int enter = scan.nextInt();

        //사용자가 입력한 항의 갯수만큼 배열할당 -> 그 배열이름이 sequence
        int[] sequence = new int[enter];

        //MAX값보다 큰 수를 입력했을 때의 경우도 설정해주기
        if (enter > MAX) {
            System.out.println("값이 초과되어 구할 수 없습니다.");
        } else {
            for (int i = START; i < enter; i++) {
                sequence[i] = (int) Math.pow(BASE, i);

                System.out.printf("%d항의 값 : %d\n", i + 1 , sequence[i]);
            }
        }

    }
}

