public class Challenge {
    public static void main(String[] args) {
        // 1. 1~100 을 순회한다.(순차 순회할 필요는 없다) - 방어 루틴 안쓸거라
        // 2. 루프 내에서 난수 값을 할당 받는다.
        // 3. 현재 i값이 난수의 배수인지 판정한다.
        // 4. 배수라면 출력하고 sum에 합산
        //    아니라면 i에 가장 가까운 i보다 큰 난수(랜덤) 배수값을 찾아서 출력하고 합산한다.
        //    또한 현재 i 값은 랜덤값의 배수가 아니므로 출력한 값으로 i값을 갱신한다.
        // 5. 다시 루프를 돌면서 위의 작업들을 반복한다면
        //    방어루틴이 없어도 안정된 동작을 보일 것이다.
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
