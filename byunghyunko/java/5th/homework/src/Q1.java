import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        //문제1. 아래와 같은 등비 수열이 있다.
        // 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        // (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)


        //Q. 스캐너를 표현하고 등비수열의 항을 구하도록 코드를 구현했으나
        // for문을 통해 등비수열을 표현하는 코드를 작성하지 못했습니다.

        // 이후 해설 강의 듣고 지수를 표현하는 식으로 if문과 for문을 사용해 코드작성해서 문제해결했습니다.



        final int MAX = 31; // 2^30승을 표현하기 위해서
        final int START = 0;
        final int BASE = 2; // Math.pow를 통해 지수를 표현하기 위해서 작성

        Scanner sc = new Scanner(System.in); // 원하는 값을 뽑아내도록 스캐너작성

        System.out.print("등비 수열의 원하는 값을 뽑아내보자 ");

        int end = sc.nextInt();

        int sequence = new int[end];

        if(end > MAX){
            System.out.println("표현이 되지 않는다");
        } else{
            for(int i = START; i<end; i++) {
            sequence[i] = (int) Math.pow(BASE,i); // 지수를 표현하는 방법을 몰라서 못풀었습니다ㅠ
            System.out.printf("sequence[%d] = %d\n", i, sequence[i]);
            }
        }
    }
}
