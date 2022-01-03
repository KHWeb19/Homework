import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        /*아래와 같은 등비 수열이 있다.
        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!*/
        // 1 일단 원하는 위치의 값을 뽑아 내야하니 Scanner를 쓰자
        // 2 그리고 숫자의 2를 곱해서 계속이어가는 거니 느낌상 배열을 사용해야 할것같다.

        //스캐너를 만든다
        //파포나치 항수열 구하기에서 공식만 바꾸면 될것같아서 가져와봄
        final int START = 2;

        int[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("등수의 수열의 몇 번째 항을 구할까요 ? ");
        int end = scan.nextInt();

        sequence = new int[end];

        sequence[0] = 1;
        sequence[1] = 2;
        //일단 for문으로 arr[1~end] 까지 올리는데 까지썼는데 끝까지 안가고 끊긴다.
        //sequence[i] = sequence[i * 2]; 로 해주는것이 아닌가? sequence[i] i에내가 쓴 숫자가
        //출력되고 거기서 * 2를 해주면 되지 않는가? 하지만 안나온다
        for (int i = START; i < end; i++) {
            sequence[i] = sequence[i * 2];
            System.out.printf("arr[%d] = %d\n", i, sequence[i]);
        }
    }
}