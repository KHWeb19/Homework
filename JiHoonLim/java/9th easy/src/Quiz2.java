public class Quiz2 {
    public static void main(String[] args) {
        final int START = 2;
        final int END = 2;


        int[][] arr = new int[START][END];

        arr[0][0] = 1;
        arr[0][1] = 10;
        arr[1][0] = 100;
        arr[1][1] = 1000;

        for (int i = 0 ; i < START; i++){
            for (int j = 0; j < END; j++){
                System.out.printf("arr[%d][%d] = %d\n", i, j ,arr[i][j]);
            }
        }
    }
}
