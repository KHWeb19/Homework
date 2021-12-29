public class Homework9 {
    public static void main(String[] args) {
        /* 9. 문제 은행 [2]의 3번을 배열화 하여 풀어보자!
           문제 은행 [2]-3
           1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129...
           이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자! */

        /*
        1. 수열만들기 for문(시작점. 끝점. 변수)
        2. for문에 배열로 인덱스로 초기값지정
        3. 초기값 이후값부터 수식화하여 모든값 표현하여 인덱스마다 엘리멘트 설정
        3. 출력
         */
        final int MAX = 25;
        final int START = 3;

        int[] seq = new int[MAX];

        seq[0] = 1;
        seq[1] = 1;
        seq[2] = 1;

        for (int i = START; i < MAX; i++) {
            seq[i] = seq[i - 3] + seq[i - 1];
            System.out.printf("seq[%d] = %d\n", i + 1, seq[i]);
        }
        // [x] = [x-3] + [x-1] x=3~25 수식화
        // 출력
    }
}