import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        //float type => scan.nextFloat()
        //double type => scan.nextDouble()

        System.out.println("당신이 입력한 정수는 " + num);

    }

}
