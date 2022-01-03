public class P09 {
    // 1, 1, 1, 2, 3, 4, .... 의 배열화 -- 25번째항
    public static void main(String[] args) {
        final int START = 3;
        final int END = 25;

        int[] seq = new int[END];

        seq[0] = 1;
        seq[1] = 1;
        seq[2] = 1;

        for (int i = START; i < END; i++) {
            seq[i] = seq[i - 1] + seq[i - 3];
        }
        System.out.printf("%d번째 항 = %d\n", END, seq[END - 1]);
    }
}
