import java.util.Scanner; //Scanner 클래스를 사용하기 위해서는 호출해주어야 한다

public class Q01 {
    public static void main(String[] args) {

        /* Q1.
        아래와 같은 등비 수열이 있다.
        1,2,4,8,16,32,64,128,256,512,1024...
        사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자 */

        // 2씩 곱해진다.

        final int START = 1; // 데이터 타입을 만든다.

        int[] sequence; // 배열을 선언한다.
        Scanner scan = new Scanner(System.in); // 배열을 생성한다. (실제 저장공간을 생성)

        System.out.print("원하는 위치의 값을 뽑아보세요 -> ");
        //System.in 은 사용자로부터 입력을 받기 위한 입력 스트림이다.
        //ln을 쓰면 입력하는 줄이 아래로 이동하게 되니 뺐다.

        int END = scan.nextInt();
        // 정수를 입력받고자 하니 nextInt를 썼다.

        sequence = new int[END]; // end 데이터를 선언

        // 참고
        // [1] [2] [4] [8] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] arr
        //  0   1   2   3   4   5   6   7   8   9  10  11  12

        sequence[0] = 1;
        sequence[1] = 2;
        sequence[2] = 4;
        sequence[3] = 8;

        // i가 START에서 END까지 2씩 곱해진다는 조건문을 작성한다.
        for (int i = START; i <END; i++) {


            sequence[i] = sequence[i-1]*2;

            System.out.printf("%d번째 위치 : %d\n",i,sequence[i]); // 값을 출력한다.

        }
    }
}


