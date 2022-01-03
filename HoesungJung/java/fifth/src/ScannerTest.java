import java.util.Scanner;
public class ScannerTest {
    //Scanner 는 class 타입
    //new Scanner(System.in)은 시스템으로 입력 들어가는 정보를 해석한다 정도로 해석.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력");
        int num = sc.nextInt();
        //sc.nextInt(); 를 통해 정수 입력 가능
        System.out.println("정수"+num);
    }
}
