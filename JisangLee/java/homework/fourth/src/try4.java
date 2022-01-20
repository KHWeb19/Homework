import java.util.Scanner;

public class try4 {
    // 퀴즈6. 아무런 숫자나 입력 받아 3의 배수인지 판별(if + Scanner 문제)
    public static void main(String[] args) {
        int i;
        final int MULTIPLE = 3;
        final int REMAIN = 0;

        Scanner sc = new Scanner(System.in);
        System.out.printf("아무 숫자나 입력하세요: ");
        i = sc.nextInt();

        if(i % MULTIPLE ==REMAIN){
            System.out.printf("%d은(는) %d의 배수입니다.",i,MULTIPLE);
        }
        else{
            System.out.printf("%d은(는) %d의 배수가 아닙니다.",i,MULTIPLE);
        }

    }
}

