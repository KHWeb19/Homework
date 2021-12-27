public class Homework2 {
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 ... 일명
        // 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!

        /*
        1. 피보나치수열 베이스 상자 만들기
        2. 루프돌리기 end값 20
        3. 출력하기
         */

        int first = 1;
        int second = 1;
        int result=0, i;

        final int Start = 2;
        final int End = 20;

        for (i = Start; i < End; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        System.out.printf("%d번째 항 %d\n ", i, result);
    }
}
