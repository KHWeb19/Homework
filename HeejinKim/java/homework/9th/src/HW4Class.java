public class HW4Class {

    static final int LINE = 3;
    static final int ROW = 3;
    private int[][] scoreNew;
    int i, j;

   /* HW4Class(int[][] array){
       scoreNew = array;
    }*/

    public void initScore() {
        scoreNew = new int[][]{{10, 20, 30},
                              {40, 50, 60},
                              {70, 80, 90}};
    }

    public void printScore() {
        initScore();
        for (int i = 0; i < LINE; i++) {
            for (int j = 0; j < ROW; j++) {
                System.out.printf("scoreNew[%d][%d]=%d\n", i, j, scoreNew[i][j]);
            }
        }
    }
   public void setScore(int[][] scoreNew){
        printScore();
        this.scoreNew= scoreNew;
    }

    public int [][]getScore() {
        return scoreNew;
    }
}








