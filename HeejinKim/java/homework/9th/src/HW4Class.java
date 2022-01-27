public class HW4Class {

    static final int LINE = 3;
    static final int ROW = 3;
    private int[][] scoreNew;
    static int i, j;
    private int printScore;
    /* HW4Class(int[][] array){
       scoreNew = array;}  */

    public void initScore() {
        scoreNew = new int[][]{{10, 20, 30},
                               {40, 50, 60},
                               {70, 80, 90}};

    }
    public void printScore() {
        initScore();
        for ( i = 0; i < LINE; i++) {
            for ( j = 0; j < ROW; j++) {
                printScore = scoreNew[i][j];
                System.out.printf("scoreNew[%d][%d]=%d\n", i, j, scoreNew[i][j]);
            }
        }
    }
    public int getScore() {
             printScore();
            return printScore;
        }
    }










