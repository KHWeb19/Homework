import java.util.Arrays;
import java.util.Scanner;

public class Homework_01 {
    public static void main(String[] args) {
        //1. 아래와 같은 등비 수열이 있다.
        //    1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        //    사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        //    (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

        // 2의 제곱을 나타내야한다.
        final int NUMBER = 2;
        // 2의 제곱을 나타낼 수 있도록 for문을 이용해 사용.
        // 사용자가 몇번째를 뽑을지 모르니... 끝을 정하지 않는다.

        Scanner scanner = new Scanner(System.in);

        System.out.print("원하는 위치의 값을 적어주세요 >>");
        // 2의 갯수가 몇개인지 받는것.
        int scanNum = scanner.nextInt();

        int num1 = 1; // 2의 0제곱 -> 1

        // 2의 갯수만큼 곱해야함.

        for(int i = 1; i < scanNum; i++){ // ex) 1 ~ scaNum -1
            num1 *= NUMBER;
        }

        System.out.printf("%d번째 수는 %d 입니다.",scanNum,num1);


    }
}
