public class Question4 {
    public static void main(String[] args) {
        final int STAGE = 7;
        final int START = 1;
        final int END = 10;

        for(int i = START;i <= END; i ++){
            System.out.printf("%d * %d = %d\n", STAGE, i, STAGE * i);
        }
    }
}
