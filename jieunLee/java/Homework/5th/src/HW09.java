public class HW09 {
    public static void main(String[] args) {
        //9. 문제 은행 [ 2 ]의 3번을 배열화하여 풀어보자!
        //   3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //      이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        final int NUM = 25;
        int[] arr = new int[NUM];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        for (int i=3; i<NUM; i++) {
            arr[i] = arr[i-3] + arr[i-1];
            System.out.printf("%d항: %d\n", i+1, arr[i]);
        }
    }
}
