public class P09 {
    public static void main(String[] args) {
/* 9. 문제 은행 [ 2 ]의 3번을 배열화하여 풀어보자!

 */
        final int MAX = 100;
        final int START = 3;
        final int END = 25;

        int[] arr = new int[MAX];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;


        for (int i = START; i < END; i++) {
            arr[i] = arr[i - 1] + arr[i - 3];
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

    }
}
