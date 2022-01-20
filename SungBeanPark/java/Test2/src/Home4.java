public class Home4 {
    public static void main(String[] args) {
        //4. 구구단 7단을 출력해보자!
        final int STAGE = 7;
        final int START = 1;
        final int END = 10;

        for (int i = START; i < END; i++){
            System.out.printf("%d x %d = %d\n", STAGE, i, STAGE * i);
        }
    }
}
