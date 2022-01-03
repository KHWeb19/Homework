public class Answer2 {
    public static void main(String[] args) {
        //문제2. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!
        //피보나치 수열이란?
        // 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열이다.

        // 복습 포인트: fianl int를 사용해보기! ---------------------------------

        int num1 = 1;
        int num2 = 1;
        int sum = 0, i;

        final int start = 2;
        final int end = 20;

        System.out.printf("%d, %d, ", num1, num2);

        for (i = start; i < end; i++) {
            // i값을 2로 바꿔줌; i의 값이 20이 될 때 까지; 매 회 +1씩 숫자가 커지며 반복한다는 조건을 만족하는 경우

            sum = num1 + num2;

            System.out.printf("%d, ", sum);

            num1 = num2;
            num2 = sum;

        }

        System.out.printf("\n피보나치 수열 %d번째 항의 값은 = %d", i, sum);
    }
}
