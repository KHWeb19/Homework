import java.util.Scanner;

public class P01 {
    // 1, 2, 4, 8 ... 의 등비수열
    // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍
    // int를 사용

    public static void main(String[] args) {

        final int START = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("등비수열의 항은 ? : ");
        int end = scan.nextInt();
        int[] arr = new int[end];

        int i;
        arr[0] = 1;

        for(i = START; i < end; i++) {
            arr[i] = arr[i - 1] * 2;
        }
        if(end > 31){
            System.out.println("값이 너무 큽니다.");
        }
        else{
        System.out.printf("등비수열의 %d 번째 항 : %d\n", i, arr[i - 1]);
        }

    }
}
