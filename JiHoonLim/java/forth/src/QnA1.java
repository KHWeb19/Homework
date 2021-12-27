public class QnA1 {
    public static void main(String[] args) {

        /*
        1. 앞 항은 1부터 차례로 증가, 뒷항은 4의배수
        2. 4의 배수를 if문으로 걸러서 출력
        3. 앞 항은 4의 배수가 나올때마다 1씩증가
         */

        final int START = 1;
        final int END = 100;
        final int WANT = 4;
        final int REMAIN = 0;

        int cnt = START, sum ;

        for (int i = START; i <= END; i++) {
            if (i % WANT == REMAIN) {
                System.out.printf("sum = %d + %d\n", cnt, i);

                sum = cnt++ + i;

                System.out.printf("sum = %d\n", sum);
            }
        }
    }
}
