public class problem9 {
    public static void main(String[] args) {
        final int MAX = 25;
        final int START = 3;

        int[] arr = new int[MAX];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = START; i < 25; i++) {
            arr[i] = arr[i - 3] + arr[i - 1];
            System.out.printf("seq[%d] = %d\n", i + 1, arr[i]);
        }
    }
}

