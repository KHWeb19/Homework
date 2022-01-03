public class P09 {
    // 1, 1, 1, 2, 3, 4, .... 의 배열화 -- 25번째항
    public static void main(String[] args) {
        final int MAX = 100;
        final int START = 3;
        final int END = 25;

        int[] arr = new int[MAX];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = START; i < END; i++) {
            arr[i] = arr[i - 1] + arr[i - 3];
        }
        System.out.printf("%d번째 항 = %d\n", END, arr[END - 1]);
    }
}
