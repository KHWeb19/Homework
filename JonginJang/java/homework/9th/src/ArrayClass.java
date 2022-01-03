public class ArrayClass {//문제4

    static final int END = 10;

    private int arr;
    private int[][]sequence = new int[END][END];
    private int i,j ;

    public void setArray(){
        for(i=0;i<END;i++){
            for(j = 0 ; j<END; j++){
                sequence[i][j] = j;
            }
        }
    }
    public void showArray(){
        for(i=0;i<END;i++){
            System.out.printf("%d번쩨 행\n",i+1);
            for(j = 0 ; j<END; j++){
                System.out.println(sequence[i][j]);
            }
        }
    }
}
