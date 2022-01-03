public class ArrayTest {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] arr = new int[MAX];

        for (int i = 0; i < MAX; i++){
            arr[i] = i +1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
