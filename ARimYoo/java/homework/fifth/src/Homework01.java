import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {

        // 아래와 같은 등비 수열이 있다.
        // 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        // (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

        // 등비수열 규칙 = 현재항 * 2
        // 사용자 입력 함수 = scanner
        // 규칙의 원하는 값 구할 때 : 배열과 for문을 사용한다

        Scanner scan = new Scanner(System.in);
        System.out.print("등비수열 몇번째 항을 구할까요? : ");
        int end = scan.nextInt();

        final int START = 1;

        int [] arr = new int [end];

        arr[0] = 1;

        for (int i = START; i < end; i++){

            arr[i] = arr [i-1] * 2;

            System.out.println(arr[i]);

        }
    }
}
