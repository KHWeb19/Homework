public class P02 {
    public static void main(String[] args) {
        final int END = 10;

        int[][] sequence;
        sequence = new int[END][END];
        int i,j ;

        for(i=0;i<END;i++){
            System.out.printf("%d번쩨 행\n",i+1);
            for(j = 0 ; j<END; j++){
                sequence[i][j] = j;
                System.out.println(sequence[i][j]);
            }
        }
    }

}