// 문제은행[4] - 4. 1번 문제를 클래스화 해봅시다.

public class HW4 {
    static final int NUM = 2;
    static final int START = 0;
    static final int RANGE = 10;

    static private int[][] arr;

    public void initArr() {
        arr = new int[NUM][NUM];

        putArr();
    }
    public void putArr() {
        printArr();
    }
    public void printArr() {
        for (int i = START; i <NUM; i++){
            for (int j = START; j < NUM; j++){
                arr[i][j] = (int) (Math.random() * RANGE);
                System.out.printf("[%d][%d] = %d\n",i, j, arr[i][j]);
            }
        }
    }
}