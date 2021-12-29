import java.util.Scanner;

public class try5 {
    // 퀴즈7. 1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력(while + Scanner 문제)
    //키보드로 21을 입력 받으면 1 ~ 21까지의 수 중 3의 배수를 출력한단 말이겠지??
    public static void main(String[] args) {
        int i; //입력값으로 넣어줄 변수
        final int START = 1;
        final int MULTIPLE = 3;
        final int REMAIN = 0;
        int cnt = START - 1;

        Scanner sc = new Scanner(System.in);
        System.out.printf("아무 숫자나 입력하세요:");
        i = sc.nextInt();
        System.out.printf("%d에서 %d 사이의 %d의 배수\n",START,i,MULTIPLE);
        while(cnt++ < i ){

            if(cnt % MULTIPLE == REMAIN) {
                System.out.println(cnt);
                if(cnt>=i) {
                    break;
                }
            }
        }

    }
}
