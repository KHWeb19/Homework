public class Q9 {
    public static void main(String[] args) {
        // 9 . 3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129....
        //이와 같은 숫자의 규칙을 찾아 25번쨰 항을 구하도록 프로그램 해보자 (배열을 통해서)

        // 문제은행[2]의 3번을 배열화하여 해결하는 문제
        final int MAX = 25; // 범위 25번 까지
        final int START = 3;

        int[] sequence = new int[MAX]; // 수열을 정의

       sequence[0] = 1;
       sequence[1] = 1;
       sequence[2] = 1;


       // for문을 통해서 규칙을 넣어보기
        for (int i=START; i<MAX; i++){
           sequence[i] = sequence[i-3] + sequence[i-1]

            System.out.printf("sequence[%d]= %d\n", i ,sequence[i]);
        }

    }
}


