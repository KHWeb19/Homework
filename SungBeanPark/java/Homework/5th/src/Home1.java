import java.util.Scanner;
// 아래와 같은 등비 수열이 있다.
// 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
// 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
// (1~32번째 혹은 31번째 항까지만 올바른 결과가 나올 것이다)

// 사용자 입력은 import jave.util.Scanner
// Scanner scan = new Scanner(system.in);으로 설정해준다
// int END = scan.nextInt(); 입력값은 for문의 조건값으므로 int END 로 정해준다.
// int[] sequence로 배열문을 만들어준다.

// 1, 2, 4, 8, 16.....은 for문을 사용하고 규칙은 s[i] = s[i-1]*2이다.
public class Home1 {
    public static void main(String[] args) {
        final int START = 1;

        int[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("등차수열의 몇 번째 항을 구할까요 ? ");
        final int END = scan.nextInt();

        sequence = new int[END];

        sequence[0] = 1;
        sequence[1] = 2;

        for (int i = START; i < END; i++) {
            sequence[i] = 2 * sequence[i - 1];
            System.out.printf("arr[%d] = %d\n", i, sequence[i]);
        }
    }
}
