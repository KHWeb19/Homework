import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        //문제1. 아래와 같은 등비 수열이 있다.
        // 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        //(1~32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

        int[] arr;

        //1. import Scanner를 사용해 내가 구할 위치를 입력할 수 있는 문장이 출력되도록 한다.
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 번째 항의 결과를 찾고 싶나요? : ");
        int end = scan.nextInt(); // 정수를 입력할 수 있음.

        //2. 매 항마다 숫자가 x2씩 커지는 배열을 만들어준다.
          //2-1. 이 때, 1항의 숫자는 1이므로 arr[0] = 1;은 직접 입력해둔다.

        arr = new int[end];
                arr[0] = 1;

          //2-2. for문을 이용하여 반복문이 내가 입력하는 수 만큼만 arr를 배열하도록 만든다.

        int num = 1;

        for(int i = 1; i < end; i++){
            arr[i] = num * 2;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);

            num = arr[i]; //for 문 맨 위로 돌아가 반복하기 전, num의 값을 바꿔준다.
        }
 //딱 31번째 항(0포함 32번째)부터 -가 붙어서 나옵니다.
    }
}
