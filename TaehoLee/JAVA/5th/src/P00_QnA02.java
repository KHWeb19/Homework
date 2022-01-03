public class P00_QnA02 {
    public static void main(String[] args) {
        // 1. 1 ~ 100 을 순회한다. (순차 순회할 필요는 없다) - 방어 루틴 안쓸거라
        // 2. 루프 내에서 난수 값을 할당 받는다.
        // 3. 현재 i값이 난수의 배수인지 판정한다.
        // 4. 배수라면 출력하고 sum에 합산
        //    아니라면 i에 가장 가까운 i 보다 큰 난수(랜덤) 배수값을 찾아서 출력하고 합산한다.
        //    또한 현재 i 값은 랜덤값의 배수가 아니므로 출력한 값으로 i값을 갱신한다.
        // 5. 다시 루프를 돌면서 위의 작업들을 반복한다면
        //    방어루틴이 없어도 안정된 동작을 보일 것이다.

        final int START = 1; // 순회 시작값
        final int END = 100; // 순회 종료값
        final int MAX = 10; // 랜덤 최대값
        final int MIN =2; // 랜덤 최소값

        int range = MAX - MIN + 1; // 랜덤 범위
        int i = START; // i 시작값
        int sum = 0; // 합산 변수

        while(i <= END){
            int rand = (int)(Math.random() * range) + MIN; // 랜덤값 생성
            int remain = i % rand; // 나머지 변수

            if(remain == 0){ // 배수일 때
                System.out.printf("%d의 배수 : %d\n" , rand, i); // 출력
                sum += i + rand;
                i += 1;
            }
            else{
                i += rand - remain; // i값을 배수로 이동
                System.out.printf("%d의 배수 : %d\n" , rand, i); // i 값 출력
                sum += i + rand;
                i += 1;
            }
        }
        System.out.printf("\n출력된 숫자들의 합 : %d", sum);
    }
}
