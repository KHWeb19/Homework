import java.util.Scanner;

public class RePractice1 {
    public static void main(String[] args) {
        //문제1. 아래와 같은 등비 수열이 있다.
        // 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        //(1~32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

        //복습 포인트: 1. final int 사용해보기!
        //           2. 1항도 검색하면 나올 수 있도록 해보기!

        //31번째 항 부터는 숫자가 제대로 나오지 않으므로
        final int MAX = 31;
        final int START = 0;

        int[] arr;

        //1. import Scanner를 사용해 내가 구할 위치를 입력할 수 있는 문장이 출력되도록 한다.
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 번째 항의 결과를 찾고 싶나요? : ");
        int end = scan.nextInt(); // 정수를 입력할 수 있음.

        //2. 매 항마다 숫자가 x2씩 커지는 배열을 만들어준다.

        arr = new int[end];

        //2-2. for문을 이용하여 반복문이 내가 입력하는 수 만큼만 arr를 배열하도록 만든다.

        if(end > MAX){ //찾고자 하는 항이 MAX보다 큰 경우
            System.out.println("출력값이 너무 커 계산할 수 없습니다!");
        } else{
            for(int i = 0; i < end; i++){
                arr[i] = (int) Math.pow(2, i); //i에 2를 제곱해준다.
                System.out.printf("arr[%d] = %d\n", i, arr[i]);

                //배열이니까 따로 값을 백업해줄 변수가 없어도 arr[i] 의 값이 알아서 백업이 되는거구나?
            }
        }
        //딱 31번째 항(0포함 32번째)부터 -가 붙어서 나옵니다.
    }

}