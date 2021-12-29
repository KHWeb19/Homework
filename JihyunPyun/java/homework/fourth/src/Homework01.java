import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
//      아래와 같은 등비 수열이 있다.
//      1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
//      사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
//      (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

        final int MAX = 31; // 2^30이 표현할 수 있는 최대 범위임..!
        final int START = 0;
        final int BASE = 2;

        Scanner sc = new Scanner(System.in);

        System.out.print("찾고싶은 수열 위치 : ");
        int select = sc.nextInt();
        int[] arr = new int[select]; // 입력값만큼 배열 생성


        if (select > MAX) {
            System.out.println("프로그램을 종료합니다.");
        }
        else {
            for (int i = START; i < select; i++) {
                arr[i] = (int) Math.pow(BASE, i);  //n승 계산해주는 Math.pow()!!
            }
        }
        System.out.printf("%d항의 값은 %d입니다.", select, arr[select-1]);
    }
}
