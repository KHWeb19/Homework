import java.util.Arrays;

public class BeginnerQ4 {

    // Q4. 1번 문제를 클래스화 해봅시다.

    static final int START = 1;
    static final int END = 8;

    static private int[][] arr;

    public void Array() {
        int[][] array = new int[START][END];

        for (int i = 0; i<END; i++) {
            System.out.print(Arrays.toString(array[i]));
        }
    }
}
