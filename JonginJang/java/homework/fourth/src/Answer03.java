public class Answer03 {
    public static void main(String[] args) {
        /*
        - 문제3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
          이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        - 구현 전략
        초황금 수열(supergolden sequence)
        : 처음 세 항은 1이고, 다음 항의 값은 바로 이전 항과 이전 항보다 2개 전 항을 더한 값이다.
        고정된 값은 3개, 고정된 3개의 값을 통해 다음 항의 값을 계산
        4개의 변수를 사용, 첫 번째 변수의 초기값 = 1, 두 번째 변수의 초기값 =1, 세 번째 변수 초기값 = 1, 네 번째 변수의 초기값 =0
        25번째 항까지 값을 구하기 위해 반복해서 더해주는 작업이 필요 -> for문 이용
        for문의 초기값은 3로 설정
        : 첫 번째 항, 두 번째 항, 세 번째 항의 값은 1로 고정되어 있기 때문에 네 번째 항부터 시작해야 함.
          하지만 컴퓨터에서 배열의 시작은 0, 반복 시작을 0을 기준으로 맞춰야 한다. -> 초기값 3이 의미하는 것은 결국 네 번째 항
        for문 내부에서 반복 수행할 동작은 초황금 수열의 규칙대로 작성

        네 번째 변수 = 세 번째 변수 + 첫 번째 변수
        ------------------------------------
        첫 번째 변수 = 두 번째 변수;
        두 번째 변수 = 세 번째 변수;
        세 번째 변수 = 네 번째 변수;
        ------------------------------------4항에 대한 계산이 완료되었기 때문에 다음 항에 대한 처리를 위해 변수값 재설정
        */
        int first = 1;
        int second = 1;
        int third = 1;
        int result = 0, i;

        final int START = 3;
        final int END = 25;

        for (i = START; i < END; i++) {
            result = first + third;
            first = second;
            second = third;
            third = result;

            // 전체 뿌리기
            //System.out.printf("%d번째 항 %d\n", i + 1, result);
        }

        System.out.printf("%d번째 항 %d\n", i, result);
    }
}
/*새로운 규칙
 int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 2;
        int result = 0, i;

        final int START = 4;
        final int END = 20;

        // 컴퓨터에서 배열의 시작이 0이기 때문에
        // 반복 시작을 0을 기준으로 맞춰주는 것이 좋습니다.
        // 그래서 START 2는 결국 3번째
        for (i = START; i < END; i++) {
            result = first + second + third;
            first = second;
            second = third;
            third = fourth;
            fourth = result;

            // 전체 뿌리기
            System.out.printf("%d번째 항 %d\n", i + 1, result);
        }

        System.out.printf("%d번째 항 %d\n", i, result);
 */