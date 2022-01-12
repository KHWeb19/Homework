public class reviewWork9 {
    public static void main(String[] args) {
        final int MAX = 25;
        final int START = 3;

        int[] sequence = new int [MAX]; // MAX만큼의 배열 길이 만들기

        // sequence[0~2]까지는 미리지정해놓기
        sequence[0] = 1;
        sequence[1] = 1;
        sequence[2] = 1;

        for (int i = START; i < MAX; i++) {
            sequence[i] = sequence[i - 3] + sequence[i - 1];
            // 규칙을 이용하여 덧셈 뺄셈 하기
            System.out.printf("sequence[%d] = %d\n", i, sequence[i]);
        }
    }
}

//  1. MAX를 25로 지정
//  2. START를 3으로 지정
//  3. MAX만큼의 배열 길이를 만들기