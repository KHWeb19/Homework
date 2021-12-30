public class HW09_Challenge {
    public static void main(String[] args) {
        // 1. 1 ~ 100 을 순회한다. (순차 순회할 필요는 없다) - 방어 루틴 안쓸거라
        // 2. 루프 내에서 난수 값을 할당 받는다.
        // 3. 현재 i값이 난수의 배수인지 판정한다.
        // 4. 배수라면 출력하고 sum에 합산
        //    아니라면 i에 가장 가까운 i 보다 큰 난수(랜덤) 배수값을 찾아서 출력하고 합산한다.
        //    또한 현재 i 값은 랜덤값의 배수가 아니므로 출력한 값으로 i값을 갱신한다.
        // 5. 다시 루프를 돌면서 위의 작업들을 반복한다면
        //    방어루틴이 없어도 안정된 동작을 보일 것이다.

        // rand가 i의 배수가 아니면
        // i보다 크고 i에 가장 가까운 rand의 배수값을 i에 넣고 출력
        // 그외 (rand가 i의 배수면)
        // 바로 i출력

        final int MIN = 2;
        final int MAX = 10;
        int rand, sum = 0;
        for (int i=1; i<100; i++) {
            rand = (int)(Math.random()*(MAX-MIN+1)+MIN);
            if (i%rand!=0) {
                i = rand * (i / rand + 1);
            }
            System.out.println(rand + "의 배수: " + i);
            sum += i;
        }
        System.out.println("총합: "+sum);
    }
}
