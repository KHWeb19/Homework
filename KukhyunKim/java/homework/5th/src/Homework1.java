import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        /* 문제 1. 아래와 같은 등비수열이 있다.
            1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024,...
            사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
            (1~32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)
         */

        /*
        1. 수열만들기 for문(시작점. 끝점. 변수)
        2. for문에 배열로 인덱스값지정
        3. 인덱스값 32가 부터 데이터량이 많아진다 표시, 및 출력
        4. 1,2,3이 마친 값중 스캔가능하게 조정
        5. 스캔값 출력
         */

        final int MAX = 31;
        final int START_INX = 2;
        final int BASE = 2;

        System.out.print("수열의 몇 번째 항을 구할까요 ? ");

        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt();

        int[] Sequence = new int[idx];

        Sequence = new int[idx];

        if(idx>MAX){
            System.out.println("출력가능한 데이터양이 초과되었습니다.");
        } else{
            for(int i = START_INX; i < idx; i++){
                Sequence[i] = (int) Math.pow(BASE, i);
                System.out.printf("seq[%d] = %d\n", i, Sequence[i]);
            }
        }
    }
}

