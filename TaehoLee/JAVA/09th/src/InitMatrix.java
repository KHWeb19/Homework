public class InitMatrix {

    public int[][] mat;

    public void createMatrix(int row,int column){
        mat = new int[row][column];

        for(int i = 0; i < row; i++){
            for(int j = 0; j <column; j++){
                int rand = (int)(Math.random() * 10);
                mat[i][j] = rand;
            }
        }
    }
    public void printMatrix(int row, int column){
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++){
                System.out.printf("%3d", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
