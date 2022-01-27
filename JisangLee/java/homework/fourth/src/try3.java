public class try3 {
    // 퀴즈5. 1 ~ 20까지의 숫자중 2의 배수만 출력(while 문제)
    public static void main(String[] args) {
        final int START = 1;
        final int END = 20;
        final int MULTIPLE = 2;
        final int REMAIN = 0;
        int cnt = START - 1 ; //와일 구문안에 cnt++이므로 START보다 1감소한 상태에서 카운트 되어야 한다.


        System.out.printf("%d ~ %d까지의 숫자 중 %d의 배수\n", START, END, MULTIPLE);

        while (cnt++ < END) {
            //cnt 확인...
            //System.out.printf("---%d---\n",cnt);
            if(cnt % MULTIPLE == REMAIN){
                System.out.println(cnt);
                if (cnt >= END) {
                    break;
                }
            }
        }
    }
}

