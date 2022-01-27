import java.util.Scanner;

public class reviewWork1 {
    public static void main(String[] args) {

        final int MAX = 31;
        final int START_IDX = 0;
        final int BASE = 2; // 2에 n승 이기때문에 BASE를 2로 설정

        System.out.println("수열의 항 입력");

        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt(); // idx에 들어가는 값을 스캔

        int[] squence = new int[idx]; // idx만큼의 배열의 길이 설정

        if (idx > MAX) {
            System.out.println("프로그램 종료");
        } else {
            for (int i = START_IDX; i < idx; i++) {
                squence[i] = (int) Math.pow(BASE, i);
                // Math.pow를 이용하여 BASE에 i승을 해준다는 뜻
                System.out.printf("squence[%d] = %d\n", i, squence[i]);
            }
        }
    }
}
/* 1. 2의 n승 이기때문에 for문을 활용하여 반복적으로 2의 n승을 실행.
   2. Scanner를 활용하여 찾고자하는 항을 입력할 수 있게 하기.
   3. Math.pow(x, y)로 x에 2를 대입하고 y에는 for문에서 반복해서 올라가는 i값을
      대입하여 식 성립하기.
 */