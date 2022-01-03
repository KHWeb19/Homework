public class hw01 {
    public static void main(String[] args) {

        final int ARR_NUM1 = 2;
        final int ARR_NUM2 = 2;
        final int MAX = 10;
        final int MIN = 1;


        int range = MAX - MIN + 1;


        int[][] arr = new int[ARR_NUM1][ARR_NUM2];

        for (int i = 0; i< ARR_NUM1; i++){
            for (int j = 0; j<ARR_NUM1 ; j++){
                int rand = (int)(Math.random()*range+MIN);
                arr [i][j] = rand;
                System.out.printf("arr[%d][%d] = %d\n",i,j, arr[i][j]);

            }

        }


    }
}
