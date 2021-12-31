import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        /*아래와 같은 등비 수열이 있다.
        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
                (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임) */
        // 1 일단 정수를 3개 만들어야 겠다.
        // 2 그리고 스캐너를 만들어야 겠다
        // 3 스캐너를 []안에 집어 넣어야 겠다
        // 4 if 문을 이용하여 31가 넘으면 종료 하도록 해야 겠다
        // 5 31이 안넘으면 Math.pow 2^승이 나오도록 출력해야 겠다
        // 6 [%d]여기서는 i++ 출력을 = = %d 에는 스캐너로 정했던 정수를 집어 넣어야 겠다.

        //int 정수 3개를
        // 최대구할수 있는 항
        // 증감 처음 시작할떄 숫자
        // Math.pow 2^ 지정해주는 숫자
        final int MAX = 31;
        final int START = 0;
        final int MIN = 2;

        System.out.print("수열을 입력하세요 : ");

        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt();
        // 스캐너 쓴 데이터 값을 배열로 집어넣기
        int[] seque = new int[idx];

        //for 증감식 30까지 증감
        for (int i = START; i < MAX; i++) {
            // seque[i] 배열에다 MIN = 2 ^ i 데이터 넣음
            seque[i] =(int)Math.pow(MIN, i);

            // 출력 1~31 i 증가 , 2 ^ i 출력
            System.out.printf("seq[%d] = %d\n ", i, seque[i]);

        }
    }
}


