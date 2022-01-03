public class Array {
    public static void main(String[] args) {
        final int FIRST = 2;
        final int SECOND = 2;

        int[][] arr = new int[FIRST][SECOND];

        arr[0][0] = 8;
        arr[1][0] = 20;
        arr[1][1] = 16;

        for(int i = 0; i < FIRST; i++)
            for(int j = 0; j < SECOND; j++)
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
    }
}
