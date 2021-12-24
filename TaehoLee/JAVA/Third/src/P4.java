public class P4 {
    // 구구단 7단 출력

    public static void main(String[] args) {
        final int NUM = 7;
        final int START = 1;
        final int END = 9;

        for(int i = START; i <= END; i++){
            System.out.printf("%d * %d = %d\n",NUM, i, NUM * i);
        }

    }
}
