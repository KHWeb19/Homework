public class M1 {
        static final int START = 3;
        static final int END = 4;


    public void initarray () {
            int[][] array = {    // 세로 크기 3, 가로 크기 4인 int형 2차원 배열 선언
                    {11, 22, 33, 44},
                    {55, 66, 77, 88},
                    {99, 110, 121, 132}
            };

            for (int i = 0; i < START; i++) {
                for (int j = 0; j < END; j++) {
                    System.out.printf("array[%d][%d]=%d\n", i, j, array[i][j]);
                }
            }

        }
    }


