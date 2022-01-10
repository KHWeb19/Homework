import java.util.Scanner;

public class SwitchRangData {
    public static void main(String[] args) {
        final int EXIT = -1;
        final int SCALE_FACTOR = 10;

        boolean checkNotFinish = true;

        Scanner scan = new Scanner(System.in);
        int num, scale;

        //혼선을 최소화 하고자 한다면 가장 협소한 범주를 가장 위에 배치한다.
        //가장 넓은 범주는 최하위에 배치한다.
        while (checkNotFinish) {
            System.out.printf("성적 입력 : ");
            num = scan.nextInt(); //입력란이 while 반복문 안에 만들어져 있으니까 계속해서 다음 수를 입력하라는 Scanner가 뜨는구나
            scale = num / SCALE_FACTOR;

            if (num == EXIT) {
                System.out.println("성적 입력 종료!");
                break; // 혹은 boolean = false을 넣어줘야 while문을 나갈 수 있다.
            } else if (num > 100) {
                System.out.println("잘못된 숫자를 입력하였으니 다시 입력하세요!");
                continue;
            }

            switch (num) {
                case EXIT:
                    System.out.println("성적 입력을 종료합니다!");
                    break;
                    /*
                case 100:
                case 99:
                case 98:
                case 97:
                case 96:
                case 95:
                    //...
                case 90:
                    System.out.println("A등급");
                    break;
                    */
            }


        }
    }
}
