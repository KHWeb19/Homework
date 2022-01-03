import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //정수형 변수를(pick) 하나 선언한다
        //Scanner를 이용하여 사용자가 원하는 위치를 알아낸다
        //Scanner로 받은수를 배열 MAX개수로 지정한다
        //정수형 배열을 선언한다
        //for문을 이용하여 1, 2, 4, 8, 16, 32, 64 ---수열을 만들어준다
        //2씩 곱하기 때문에 final int를 사용하여 2를 넣어준다
        //for문 반복회수를 pick에 입력받은 수만큼 반복한다

        final int num = 2;
        int pick;

        Scanner sc= new Scanner(System.in);

        System.out.print("수열의 위치를 선택하세요:");
        pick = sc.nextInt();

        int ARR[] = new int[pick] ;
        ARR[0] = 1;
        //ARR[0] = 1인 이유는 배열안에 들어있는수가 없기때문에 첫번째 배열에는 1을주고 for문을 작성해야한다.

        //i<pick인 이유는 실제 배열 번호보다 -1을 해주어야한다
        //i<=pick-1 로 작성하여도 된다
        for(int i=1; i<pick; i++){
            ARR[i]=ARR[i-1]*num;
        }

        System.out.printf("선택한 수열의 위치 %d의 숫자는:%d", pick, ARR[pick-1]);
        //pick한 위치가 5일때 실제 배열의 번호는 4이기 때문에 -1을 해주어야한다

    }
}
