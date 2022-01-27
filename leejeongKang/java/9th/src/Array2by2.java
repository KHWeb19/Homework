public class Array2by2 {

    final int ARR_NUM1 = 2;
    final int ARR_NUM2 = 2;
    final int MAX = 10;
    final int MIN = 1;

    int[][] arr = new int[ARR_NUM1][ARR_NUM2];


    public void initArr() {
        for (int i = 0; i < ARR_NUM1; i++) {
            for (int j = 0; j < ARR_NUM1; j++) {
                int range = MAX - MIN + 1;
                int rand = (int) (Math.random() * range + MIN);
                arr[i][j] = rand;
                System.out.println(rand);
            }
        }
    }
}