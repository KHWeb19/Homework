public class Homework10 {
    public static void main(String[] args) {
        // 10. 1~100까지의 숫자를 순회한다.
        // 9번과 유사하게 2~10을 가지고 작업을 진행한다.
        // 다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
        // 이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!

        /*
        1. 1~100까지 숫자를 순회 - 루프
        * 필요상자 시작점, 끝점, 변수, 변수통제
        2. 루프안에서 2~10 사이의 랜덤한 숫자 생성
        3. 결과값 만큼 이동
        4. 루프로 돌아가서 다시 루프
        5. 이전결과값과 현제결과값 합산
        *decision이 계속 더해져야하므로 for문 내부에 있어야함
        6. 100까지진행하여 나온 이동값 만큼 합산
        7. 출력
         */

        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;

        int decision = 0;
        int sum = 0;

        for (int i = START; i <= END; i += decision) {
            decision = (int) (Math.random() * range + MIN);
            System.out.printf("뽑은 수 = %d, 현재 위치 = %d, 이동할 위치 = %d\n", decision, i, i+decision);

            sum += i;
        }

        System.out.println("현재 위치들의 총합 = " + sum);
    }
}