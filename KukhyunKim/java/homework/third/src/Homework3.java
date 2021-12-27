import javax.swing.text.html.parser.Entity;

public class Homework3 {
    public static void main(String[] args) {
        // 3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 88, 129 ,,,
        // 이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        /*
        1. 수열의 패턴 파악후 상자만들기 (상자 4개)
        2. 루프돌리기 end값 25
        3. 값출력하기
         */

        int first = 1;
        int second = 1;
        int third = 1;
        int result = 0, i;

        final int Start = 3;
        final int End = 25;


        for (i = Start; i < End; i++) {
            result = first + third;
            first = second;
            second = third;
            third = result;
        }
        System.out.printf("%d번째 항 %d\n", i , result);
    }
}
