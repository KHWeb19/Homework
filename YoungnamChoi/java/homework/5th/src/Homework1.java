import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //아래와 같은 등비 수열이 있다.
        //    1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        //    사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        //    (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

        // 등비 수열 :이웃하는 두 항 사이의 비가 일정한 수열

        /*
        1.등비 수열의 항을 구하기 위해서는 공비를 알아야 하고 공비는 2이다.
        2.등비 수열의 n번째 항을 구하는 공식은 An= An-1*r 이고 r은 공비이다.
        3. 시작값을 설정하고 빈 배열을 정의 한다.
        4.사용자의 입력을 받아야 하므로 Scanner를 구현한다.
        5. Scanner로 입력되는 값음 다음 값으로 받는다.
         */

        final int START = 2; //시작은 3번째 항에서 시작을 한다.
        final int R = 2; // 공비는 일정 한 값이기 때문에 미리 선언함

        int [] arr; //빈 배열을 선언한다.

        Scanner sc = new Scanner(System.in);

        System.out.print("항을 입력하세요 : ");

        int end = sc.nextInt();

        arr=new int[end];
        arr[0]= 1;
        arr[1] = 2;

        for(int i = START; i<end; i++){
            arr[i]=arr[i-1]*R;
            System.out.printf("arr[%d] = %d\n," ,i, arr[i]);
        }



    }
}
