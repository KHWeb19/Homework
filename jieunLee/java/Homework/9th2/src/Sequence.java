public class Sequence {
    final int MAX = 100;
    int[] arr = new int[MAX];

    public void initFibonacci(int idx) {
        arr[0] = 1;
        arr[1] = 1;
        for (int i=2; i<idx; i++) {
            arr[i] = arr[i-2]+arr[i-1];
        }
        System.out.printf("%d번째 항: %d\n", idx, arr[idx-1]);
    }
    public void initFibonacciTwo(int idx) {
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        for (int i=3; i<idx; i++) {
            arr[i] = arr[i-3]+arr[i-1];
        }
        System.out.printf("%d번째 항: %d\n", idx, arr[idx-1]);
    }
}
