import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        /* 문제 1. 아래와 같은 등비수열이 있다.
            1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024,...
            사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
            (1~32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)
         */

        /*
        1. for문으로 범위 변수지정
        2. 배열의 베이스가될 인덱스에 엘리먼트 지정
        3. 베이스를 사용하여 나머지 인덱스에 엘리먼트 자동조정
        4. 1,2,3이 마친 값중 스캔가능하게 조정
        5. 스캔값 출력
         */

        final int START = 2;

        int[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("수열의 몇 번째 항을 구할까요 ? ");
        int end = scan.nextInt();

        sequence = new int[end];

        sequence[0] = 1;
        sequence[1] = 2;

        for (int i = START; i < end; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
            System.out.printf("arr[%d] = %d\n", i, sequence[i]);
        }
        // Q1. START 를 0으로 설정후 for문을 시도하니
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 10 out of bounds for length 10 	at Homework1.main(Homework1.java:27)
        // 라고 나오며 정상작동이 안되는데 이유가 뭘까요?
        // Q2. START를 2로 설정하고 시작하는이유 0이나 1로 시작하면 안되는이유.
        // Q3. for문 내부에 sequence[i] = sequence[i - 1] + sequence[i - 2]; 부분을
        //     간단하게 sequence[i] = sequence[i] * 2; 라는 형식으로는 어떻게 표현해야하는지
    }
}

