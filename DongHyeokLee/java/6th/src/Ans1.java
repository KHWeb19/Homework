import java.util.Scanner;

public class Ans1 {
    public static void main(String[] args) {

        final int MAX = 31;
        final int BASE = 2;// 변수 이름명 해결
        final int START = 0;

        int[] sequence;
        Scanner scan = new Scanner(System.in);

        System.out.print("원하는 위치의 값을 입력 하시오 : ");
        int end = scan.nextInt();
        sequence = new int[end];

        if(end > MAX) {
            System.out.println("값을 출력 할 수 없습니다."); // 출력이 안되는 경우 조건식

        }else{
            for(int i = START; i < end; i++){

                sequence[i] = (int) Math.pow (BASE, i);
                System.out.printf("%d항의 값은 %d 입니다.\n", i+1, sequence[i]);

            }
        }

    }
}
