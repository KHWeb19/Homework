import java.util.Scanner;

public class SwithTest {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        boolean isNotFinish = true;
        while (isNotFinish) {
            System.out.println("1. 장비, 2. 특성, 3. 종료");
            System.out.print("원하는 기능을 입력해주세요 >> ");

            int num = scaner.nextInt();

            switch (num){
                case 1:
                    System.out.println("장비를 선택했습니다.");
                    break;
                case 2:
                    System.out.println("특성을 선택했습니다.");
                    break;
                case 3:
                    System.out.println("종료하겠습니다.");
                    isNotFinish = false;
                    break; // 반복문을 빠져나간다.
            }
        }
    }
}
