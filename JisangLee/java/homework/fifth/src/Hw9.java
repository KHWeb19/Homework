public class Hw9 {
    public static void main(String[] args) {
        // 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        //  1,       1,       1,      2,        3,
        //arr[0]   arr[1]   arr[2]  arr[3]    arr[4]
        //arr[3] = arr[0] + arr[2]
        //arr[4] = arr[1] + arr[3]
        final int START = 3; //sequence[3]부터 시작이므로
        final int END = 25;  //25번 째 항을 구하므로
        //배열 함수를 선언하고
        int[] sequence;

        sequence = new int[END];

        sequence[0] = 1;
        sequence[1] = 1;
        sequence[2] = 1;

        for (int i = START; i < END; i++) {
            sequence[i] = sequence[i-3] + sequence[i-1];  //4번째의 항은 1번째의 항과 3번째 항의 합이므로
            if(i == END-1){   //배열은 0부터 시작하므로 -1을 해준다.
            System.out.printf("arr[%d] = %d\n", i, sequence[i]);

        }

    }
    }
}
