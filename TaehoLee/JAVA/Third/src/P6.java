public class P6 {
    // 1~100까지의 숫자중 3의 배수만 출력

    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int MULTI = 3;
        final int REMAIN = 0;

        for (int i = START; i <= END; i++){
            if (i % MULTI == REMAIN) {
                System.out.printf("%d의 배수 : %d\n", MULTI, i);
            }
        }
    }
}