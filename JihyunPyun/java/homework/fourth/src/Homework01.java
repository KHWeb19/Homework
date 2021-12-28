import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
//      아래와 같은 등비 수열이 있다.
//      1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
//      사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
//      (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

//      1. 배열에 값 입력
//      2. 입력값 출력하기

//      1. 배열에 값 입력
        int[] arr = new int[40];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] * 2;
        }

//      2. 입력값 출력하기
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 위치 : ");
        int selectNum = sc.nextInt() - 1;
        System.out.printf("%d항의 값 : %d", selectNum, arr[selectNum]);

    }
}
