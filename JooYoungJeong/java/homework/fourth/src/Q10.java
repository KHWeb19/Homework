public class Q10 {

    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;


        int decision = 0;
        int sum = 0;


        for (int i = START; i <= END; i += decision) {
            // 내부에 배치되면 매 반복마다 더하는 값이 바뀜
            decision = (int) (Math.random() * range + MIN);

            System.out.printf("뽑은 난수 = %d, 현재 이동한 위치 = %d\n", decision, i);


            sum += i;
        }

        //1 ~ 100 사이 숫자 순회 시키기
        //2 ~ 10 범위 설정 후 곱이 아닌 합을 계산 시키기
        // decision = (int) (Math.random() * range + MIN);
        // 이 코드가 for 밖으로 나오면
        // 한 번 할당된 난수를 기반으로 코드가 동작함


        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}
