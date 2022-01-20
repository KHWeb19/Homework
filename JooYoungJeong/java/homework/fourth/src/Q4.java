public class Q4 {
    public static void main(String[] args) {

        //구구단 7단

        final int STAGE = 7;
        final int START = 1;
        final int END = 10;

        //시작 숫자 설정 ~ 같은 단위로 계속 증가
        // i = i + 7 ===> i += 7 ===> i += STAGE

        for (int i = START; i < END; i++) {
            System.out.printf("%d x %d = %d\n", STAGE, i, STAGE * i);
        }
    }
}
