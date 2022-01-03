public class Quiz4 {
     final int START = 2;
     final int END = 2;
     final int range = 1000;


    static private int[][] arr;

    public void initArr() {
        arr = new int[START][END];

        putArr();
    }

    public void putArr() {
        for (int i = 0; i < START; i++){
            for (int j = 0; j < END; j++){
                arr[i][j] = (int)(Math.random() * range);
            }
        }

    }

    public void printArr() {
        for (int i =0; i < START; i++){
            for (int j =0; j < END; j++){
                System.out.printf("arr[%d][%d] = %d\n",i, j, arr[i][j]);
            }
        }
    }


}