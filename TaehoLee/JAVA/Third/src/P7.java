public class P7 {
    // 1 ~ 100까지 숫자중 4의 배수를 더한 결과를 출력

    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int MULTI = 4;
        final int REMAIN = 0;

        int res = 0;

        for (int i = START; i <= END; i++){
            if (i % MULTI == REMAIN) {
                res += i;
            }
        }
        System.out.println("4의 배수의 합 : " +res);
    }
}