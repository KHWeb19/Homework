public class P8 {
    // 1. 1 ~ 100 순회(루프가 이 안에서 돔!!),
    // 즉, START = 1, END = 100
    // 2. 2 ~ 10 랜덤 숫자 선택
    // 3. 이 숫자의 배수 출력

    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;
        int rand = (int)(Math.random() * range) + MIN;

        for(int i = START; i <= END; i++){
            if(i % rand == REMAIN)
            System.out.printf("%d의 배수 : %d\n", rand, i);
        }
    }
}
