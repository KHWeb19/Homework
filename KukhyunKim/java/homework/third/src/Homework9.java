public class Homework9 {
    public static void main(String[] args) {
        // 9. 1~100까지의 숫자를 순회한다.
        // 2~10사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        // 다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        // 그 다음 루프에서 다시 작업을 반복한다.
        // 끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가?

        /*
        1. 1~100까지 숫자를 순회 - 루프
        * 필요상자 시작점, 끝점, 변수, 변수통제, 사칙연산
        2. 루프안에서 2~10 사이의 랜덤한 숫자 생성
        3. 생성값 의배수 생성
        4. 결과값과 끝점사의의 변수 사이의 랜덤한 숫자 생성 2로 돌아가서 다시루프 while
        *bloolean 의 참거짓 판별로
        5. 출력
        6. 출력 값들의 합산 출력
         */

        final int Start = 1;
        final int End = 100;
        final int Remain = 0;

        final int Max = 10;
        final int Min = 2;

        int range = Max - Min + 1;

        boolean isRandomAllocCheck = false;

        int decision = 0;
        int sum = 0;

        for (int i = Start; i <= End; i++) {
            while (!isRandomAllocCheck) {
                decision = (int) (Math.random() * range + Min);
                isRandomAllocCheck = true;
            }
            if (i % decision == Remain) {
                System.out.printf("%d의 배수 i = %d\n", decision, i);
                isRandomAllocCheck = false;

                sum += i;
            }
        }

        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}