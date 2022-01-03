import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        // 아래와 같은 등비 수열이 있다.
        // 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        // (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

        final int START = 0;
        // 0으로 설정 하여 1 ~ 시작하게 하는게 맞는가?

        int[] arr;
        Scanner scan = new Scanner(System.in);
        System.out.print("등비 수열 몇 번째 배수를 구할까요? ? ");
        int end = scan.nextInt();
        //Scanner를 만들고 System.out.print 사용 하여 질문 우측에 값 입력

        arr = new int[end];

        arr[0] = 1;
        arr[1] = 2;

        for (int i = START; i < end; i++){
            arr[i] = (int)(Math.pow(2,i));
            System.out.printf("[%d] 번째 등비수열의 값 = %d\n", i, arr[i]);
        }
    }
}
