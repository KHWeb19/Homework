import java.util.Scanner;

public class try2 {
    // 퀴즈4. 아무 숫자 3개 입력받아 숫자의 합을 출력하는 코드
    public static void main(String[] args) {
        //숫자 3개를 입력? 아직 안배웠는데..scanf 쓰면 되나...
        int i;
        int j;
        int k;

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.printf("1번째 값을 입력하세요: ");
        i = sc.nextInt();
        System.out.printf("2번째 값을 입력하세요: ");
        j = sc.nextInt();
        System.out.printf("3번째 값을 입력하세요: ");
        k = sc.nextInt();

        sum = i + j + k;

        System.out.println("숫자의 합은? "+ sum);

    }
}
