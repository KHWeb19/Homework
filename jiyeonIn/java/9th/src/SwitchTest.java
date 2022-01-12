import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        final int EQUIPMENT = 1;
        final int STATUS = 2;
        final int EXIT = 3;

        Scanner scan = new Scanner(System.in);

        boolean isNotFinish = true;

        while (isNotFinish) {
            System.out.println("1. 장비, 2. 특성, 3. 종료");
            System.out.print("원하는 기능을 입력하세요: ");

            int num = scan.nextInt();

            switch (num) {
                // if (num == EQUIPMENT)
                case EQUIPMENT:
                    System.out.println("장비를 눌럿습니다!");
                    break;
                // else if (num == STATUS)
                case STATUS:
                    System.out.println("캐릭터 특성창입니다!");
                    break;
                // else if (num == EXIT)
                case EXIT:
                    System.out.println("종료합니다!");
                    isNotFinish = false;
                    break;
            }
        }
    }
}