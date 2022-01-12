public class Q8 {
    public static void main(String[] args) {


        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        int decision = (int) (Math.random() * range + MIN);

        for (int i = START; i <= END; i++) {
            if (i % decision == REMAIN) {
                System.out.printf("%d의 배수 i = %d\n", decision, i);
            }
        }

        //1 ~ 100 숫자 순회 시키고 랜덤 값으로 2~10 사이 숫자 생성
        // 생성 시킨후 랜덤 배수 출력 시키기
    }
}
