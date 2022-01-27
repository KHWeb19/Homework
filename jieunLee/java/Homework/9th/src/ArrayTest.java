public class ArrayTest {
    static final int ROW = 2;
    static final int COL = 2;

    public void initArr() {
        int[][] arr = new int[COL][ROW];
        int init = 0;
        for (int i=0; i<ROW; i++) {
            for (int j=0; j<COL; j++) {
                arr[i][j] = init++;
                System.out.printf("arr[%d][%d]: %d\n", i, j, arr[i][j]);
            }
        }
    }
}
