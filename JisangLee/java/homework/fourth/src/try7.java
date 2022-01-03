import java.util.Scanner;

public class try7 {
    // 퀴즈8-2. 입력하는 키보드 값이 짝수인지 홀수인지
    //지속적으로 판별하도록 프로그래밍 해봅시다!(if + while + Scanner 문제)
    public static void main(String[] args) {
        int i;

        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            System.out.printf("숫자를 입력하세요: ");
            i = sc.nextInt();
            if (i % 2 == 0) {
                System.out.printf("%d은(는) 짝수입니다.\n", i);
            } else {
                System.out.printf("%d은(는) 홀수입니다.\n", i);
            }
        }
    }
}
