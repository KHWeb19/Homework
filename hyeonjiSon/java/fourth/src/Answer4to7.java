public class Answer4to7 {
    public static void main(String[] args) {
        //문제4~8. 배수만들기 문제 + 7, 8번. 배수들을 더한 결과 출력시키기
        // 복습 포인트: fianl int를 사용해보기! ---------------------------------

        int div = (int) (Math.random() * 10 + 1); // 구할 배수 값을 랜덤으로
        final int start = 1;
        final int end = 100;
        final int remain = 0;

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % div == remain) {
                System.out.printf("%d의 배수 = %d\n", div, i);

                sum += i;
            }
        }

        System.out.printf("%d의 배수를 모두 구한 값 = %d", div, sum);

    }
}
