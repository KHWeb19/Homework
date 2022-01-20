import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
/*1. 아래와 같은 등비 수열이 있다.
    1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
    사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
    (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

    수열의 규칙 : n항의 값 = 2^n-1
*/
        final int START = 0;
        final int END = 100;

        int[] arr = new int[END];
        Scanner scan = new Scanner(System.in);

        for (int i = START; i < END; i++) {
            arr[i] = (int)Math.pow(2,i);
        }

        while(true){
            System.out.print("수열의 몇 번째 항을 출력할까요? : ");
            int num = scan.nextInt();
            System.out.printf("수열의 %d번째 항 = %d\n",num,arr[num-1]);

        }

    }
}
