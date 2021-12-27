public class Homework9 {
    public static void main(String[] args) {
        /* 일단 1 부터 100까지 숫자 순환해야 하니 for문을 사용 그리고 거기서 배수의 수를 다르게 해야하니 Math.random 이용
        그리고 그결과값을 for문안에 있는 if문에 대입 결과갑 i % decision ==  decision = Math.random 결과 값 대입
        하지만 난수 한번정해지고 계속 나오는 게아니라 바뀌어서 나와야 하는것이기 떄문에 while 문을 사용? 한다
        그리고 if문에 sum을 써주고 for문을 빠져나와 나타난 숫자들의 합을 출력
         */
        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        boolean isRandomAllocCheck = false;
        int decision = 0;
        int sum = 0;

        for (int i = START; i <= END; i++) {
            while (!isRandomAllocCheck) {
                decision = (int) (Math.random() * range + MIN);
                isRandomAllocCheck = true;
            }

            if (i % decision == REMAIN) {
                System.out.printf("%d의 배수 i = %d\n", decision, i);
                isRandomAllocCheck = false;

                sum += i;
            }
        }

        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}
