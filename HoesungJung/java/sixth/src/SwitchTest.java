import java.util.Scanner;
public class SwitchTest {
    public static void main(String[] args) {
        final int EQUIPMENT = 1;
        final int STATUS = 2;
        final int EXIT = 3;


        Scanner sc = new Scanner(System.in);
        boolean isNotFinish = true;

        while (true) {
            System.out.println("1. 장비, 2 특성, 3. 종료");
            System.out.print("원하는 기능을 입력하세요: ");

            int num = sc.nextInt();

            // if: 범주형 데이터 다루기에 유리
            // switch: 세부 옵션을 다루기에 유리
            // 둘 다 어느걸 해도 다 가능하게 만들 수 있음

            // switch 작성법
            // 1.switch(){} 작성
            // 2.소괄호에는 여러 케이스가 나타날 변수 작성
            // 3.중괄호 내부에는 case 현상: 을 적고 코드 작성
            // 4.반드시 마무리시에는 break;
            switch(num){
               case EQUIPMENT:
                    System.out.println("장비 선택");
                    break;
                case STATUS:
                    System.out.println("특성 선택");
                    break;
                case EXIT:
                    System.out.println("종료");
                    isNotFinish = false;
                    break;


            }

        }
    }
}