public class Homework2 {
    public static void main(String[] args) {
        /*  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!*/
        /* 정수 세개를 만들자

//   1      1      2      3    5  8  13  21  34  55  89
// first second                                   첫 번째 루프
//        first second                            두 번째 루프
//               first second                     세 번째 루프

         그리고 이렇게 옮겨야 하니. result first second 세게의 정수를 바꿔주어야 한다
         그리고 for문을 써서 반복해 주어야 하니 i=2를 START 정수로 END20 변수를 만들어 주도록 한다
         */

        int first = 1;
        int second = 1;
        int result = 0, i;

        final int START = 2;
        final int END = 20;

        for (i = START; i < END; i++) {
            result = first + second;
            first = second;
            second = result;

        }

        System.out.printf("%d번째 항 %d\n", i, result);
    }
}