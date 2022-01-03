public class Hw4 {
    static final int START = 2;
    static final int END = 2;

    private int[][] arr;

    public void initArr() {
        arr = new int[START][END];

        setArr();
    }

    public void setArr() {
        arr[0][0] = 3;
        arr[0][1] = 15;
        arr[1][0] = 24;
        arr[1][1] = 31;

        getArr();
    }
    public void getArr() {
        for (int i = 0; i < START; i++) {
            for (int j = 0; j < END; j++) {
                System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
            }
        }

    }
}



