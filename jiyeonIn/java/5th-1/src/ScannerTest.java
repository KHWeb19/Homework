import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력해보세요: ");
        // scan.nextInt()를 통해서 정수를 입력 받을 수 있게 도와준다.
        int num = scan.nextInt();

        System.out.println("당신이 입력한 정수는 " + num);
    }
}