import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //아래와 같은 등비 수열이 있다.
        //1,2,4,8,16,32,64,128,256,512,1024...
        //사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        //(1~32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)
        final int NUM1 = 1;
        final int NUM3 = 2;
        final int START = 1;


        Scanner scan = new Scanner(System.in);
        System.out.println("몇 항?");
        int num2 = scan.nextInt();

        int arr[] = new int[num2];
        arr[0] = 1;

        for(int i = START; i < num2; i++){
             arr[i]=arr[i-NUM1]*NUM3;
        }
        System.out.printf("arr[%d] = %d\n", num2, arr[num2-1]);
    }
    //등비 수열의 방식이 어떤식으로 흘러가는지 알아낸다.
    //등비 수열은 첫번째 수*2이다.
    //처음 사용자가 원하는 위치의 값을 입력해야 함으로 Scanner를 적용시킨다.
    //그리고 원하는 항을 뽑기위해 배열도 적용시킨다.
    //for문을 사용해 반복적으로 첫번째 수*2를 하도록 적용.
    //for문을 나와 출력
}
