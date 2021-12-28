import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        //1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...와 같은 등비 수열이 있다.
        //사용자 입력을 통해 원하는 위치의 값을 출력

        //  1        2       4       8       16 ....바로 전 항의 2배씩 증가한다...2의 i승 으로도 가능하다...
        //arr[0]   arr[1]  arr[2]  arr[3]  arr[4]
        // 2^0      2^1     2^2     2^3     2^4   자바에서는 ^이 제곱의 표시가 아니더라ㅠ
        //이게 (int)Math.pow(2,i) = 2의 i승 이었다니...
        //만약 5번째를 선택하면 arr[4]가 될 것이다. 컴퓨터는 0부터 시작하므로...

        final int START = 1; //start 값을 2로 하면 2를 입력했을 때 아무 것도 나오지 않는다.
        //규칙을 보면 sequence[i] = sequence[i - 1] * 2;이므로 i = start 값을 1로 넣으면 된다.
        //배열 함수를 선언하고
        int[] sequence;
        //입력 함수를 만들어 보자..
        Scanner scan = new Scanner(System.in);

        System.out.print("31이하의 숫자를 입력하세요: "); //int 형이라 32부터는 범위를 벗어나므로
        //32를 누르면 범위를 벗어나 -2147483648 이렇게 나온다...
        int end = scan.nextInt();

        sequence = new int[end];  //입력 받은 end 값을 선언하고

        sequence[0] = 1;
        //sequence[1] = 2;  안넣어줘도 되는구나..START 값을 1로 해서 그런듯...

        for (int i = START ; i < end; i++) {
            //sequence[i] = 2 ^ i; 제곱이 ^인 줄 알고 왜 안되지...한 참 헤멨다...Math.pow 라고 따로 함수가 있을 줄이야...
            //sequence[i] = (int)Math.pow(2,i); 이 함수 식이 2의 i승 이다...이렇게 하니 되더라...
            sequence[i] = sequence[i - 1] * 2;  //바로 전 항의 2배씩 증가하므로...
            if (i == end - 1) {  //배열은 0부터 시작하므로 END 값에 -1을 해준다.
                System.out.printf("arr[%d] = %d\n", i, sequence[i]);

            }
        }
    }
}
