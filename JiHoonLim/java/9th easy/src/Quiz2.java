public class Quiz2 {
    public static void main(String[] args) {
        final int START = 2;
        final int END = 2;
        final int range =1000;

        int[][] arr = new int[START][END];

        for (int i = 0; i < START; i++){
            for (int j = 0; j < END; j++){
                arr[i][j] = (int)(Math.random() * range);
            }
        }

        for (int i = 0 ; i < START; i++){
            for (int j = 0; j < END; j++){
                System.out.printf("arr[%d][%d] = %d\n", i, j ,arr[i][j]);
            }
        }
    }
}
