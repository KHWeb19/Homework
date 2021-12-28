import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        //1. 아래와 같은 등비 수열이 있다.
        //    1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        //    사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        //    (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

        //1) 입력받기
        //2) 입력받은 항까지의 갯수를 가진 등비수열 만들기
        //   다음 항은 앞 항의 두배
        //   입력받은 항까지 출력

        //1)
        System.out.println("등비 수열의 원하는 항을 입력하시오.");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        //2)
        int[] arr = new int[num];
        arr[0] = 1;
        System.out.printf("arr[0]: %d\n", arr[0]);
        for(int i=1; i<num; i++) {
            arr[i] = arr[i-1] * 2;
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
    }
}
