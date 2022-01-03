import java.util.Scanner;// alt + enter

public class Homework1 {
    public static void main(String[] args) {
           //아래와 같은 등비 수열이 있다.
           //1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...  -> 규칙 2n승
           //사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자! -> Scanner 사용 , end값으로 받아냄(배열길이)
           //(1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임) -> int 값범위


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











