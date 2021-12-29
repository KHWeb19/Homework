public class Homework7 {
    public static void main(String[] args) {
        // 7.  1~100까지 숫자중 4의 배수를 더한 결과를 출력해보자!

        /*
        1. 상자만들기 (시작점, 끝점, 변수, 변수통제, 사칙연산 )
        2. 루프 - 4의  배수값
        3. 나온 결과값들 합 - sum
        3. 출력
         */

        final int Start = 0;
        final int End = 100;
        final int Decision = 4;
        final int Remain = 0;

        int sum = 0;

        for (int i = Start; i <= End; i++) {
            if (i % Decision == Remain) {
                System.out.printf("%d의 배수 i = %d\n ", Decision, i);
                sum += i;
            }
        }
        System.out.printf("%d ~ %d 까지 %d의 배수들의 합은 %d\n", Start, End, Decision, sum);
    }
}
