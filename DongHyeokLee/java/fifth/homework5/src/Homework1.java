import java.util.Scanner;// alt + enter

public class Homework1 {
    public static void main(String[] args) {
           //아래와 같은 등비 수열이 있다.
           //1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...  -> 규칙 2n승
           //사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자! -> Scanner 사용 , end값으로 받아냄(배열길이)
           //(1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임) -> int 값범위


        //final int START = 1;
        //final int TWO = 2; // 변수 이름을 뭐로 하는게 좋을지 모르겠음
        final int START = 0;

        //int[] sequence;
        int i;
        double[] sequence;
        Scanner scan = new Scanner(System.in);

        System.out.print("원하는 위치의 값을 입력 하시오 : ");
        int end = scan.nextInt();
        sequence = new double[end];
        //sequence[0] = 1; //START 값 변경

        for(i = START; i < end; i++){

            sequence[i] = Math.pow (2, i); // 더블 값이어야함 , Math.pow 구글링
            //arr[i]= 2 ^ i;// 2의 n승 어떻게 하는거지...
            //sequence[i] = sequence[i-1]*2;// arr[0]값 설정 , 2값을 final로 바꾸는게 좋을거 같음
           // sequence[i] = sequence[i-1]*TWO;
            //System.out.printf("%d항의 값은 %d 입니다.\n", i+1, arr[i]);//전체보기
        }

        System.out.printf("%d항의 값은 %.0f 입니다.\n", i, sequence[i-1]);
        //System.out.printf("%d항의 값은 %d 입니다.\n", i, sequence[i-1]); 타입변경
    }

}











