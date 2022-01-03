import java.util.Scanner;

public class try6 {
    // 퀴즈8-1. 키보드 입력이 0이 들어오기 전까지는
    //계속 무한 반복하도록 프로그램을 작성  (if + while + Scanner 문제)
    public static void main(String[] args) {
        int i;

        Scanner sc = new Scanner(System.in);
        Boolean condition = true;
        while (condition) {
            //계속 무한 반복하는 중에는 숫자를 어떻게 입력하지?
            //숫자 입력 질문 나오면 0이 아닐 때만 반복하고 0이 들어오면 빠져나오면 되는건가...
            System.out.printf("숫자를 입력하세요: ");
            i = sc.nextInt();
            if (i == 0) {
                condition = false;
                break;
            }
                else {
                    System.out.println("~~~~무한 반복 중~~~~");
                }
            }


        }
    }



