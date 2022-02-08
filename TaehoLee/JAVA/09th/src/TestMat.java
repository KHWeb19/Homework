public class TestMat {
    public static void main(String[] args) {

        final int ROW = 3;
        final int COLUMN = 3;

        InitMatrix initmatrix = new InitMatrix();
        initmatrix.createMatrix(ROW,COLUMN);
        initmatrix.printMatrix(ROW,COLUMN);
    }
}
