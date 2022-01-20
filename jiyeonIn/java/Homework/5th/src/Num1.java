import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
//        아래와 같은 등비 수열이 있다.
//        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
//        사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
//                (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

        /*
        1. 스캐너 인스턴스 만들기
        2. 값입력할 수 있게 nextint 작성
        3. 배열 입력
        4. for문으로 각 배열에 값 넣기
        5. 값을 구하기 (2의 n차수 math 매소드로 구했다)


         */
        Scanner scan = new Scanner(System.in);
        System.out.print("값을 입력하시오(1~31사이)");
        int num = scan.nextInt();
        int [] arr = new int [num];
        final int START = 1;

        arr[0]=1;
        System.out.printf("arr[%d] 값은 %d\n",0,arr[0]);

        for(int i = START ; i<num;i++){
            arr[i] = (int)(Math.pow(2,i));
            System.out.printf("arr[%d] 값은 %d\n",i,arr[i]);
        }


    }
}
