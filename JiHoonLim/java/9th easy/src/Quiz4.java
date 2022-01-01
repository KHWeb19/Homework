public class Quiz4 {
    static final int START = 2;
    static final int END = 2;

    static private int[][] arr;

    public void initArr() {
        arr = new int[START][END];


        putArr();
    }

    public void putArr() {
        arr[0][0] = 1;
        arr[0][1] = 10;
        arr[1][0] = 100;
        arr[1][1] = 1000;

        printArr();
    }

    public void printArr() {
        for (int i =0; i <START; i++){
            for (int j =0; j < END; j++){
                System.out.printf("arr[%d][%d] = %d\n",i, j, arr[i][j]);
            }
        }
    }


}