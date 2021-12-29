public class ArrayTest {
    public static void main(String[] args) {
        final int START = 0;
        final int LENGTH = 100;
        int[] arr = new int[LENGTH];
        for (int i=START; i<LENGTH; i++) {
            arr[i] = i+1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
