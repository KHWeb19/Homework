public class P01 {
    public static void main(String[] args) {
        final int END = 10;

        int[][] sequence;
        sequence = new int[END][END];
        int i,j ;

        for(i=0;i<END;i++){
            for(j = 0 ; j<END; j++){
                sequence[i][j] = j;
            }
        }
    }

}
