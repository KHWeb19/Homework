public class HW1_HW2 {
    //1. 2 by 2 이중 배열을 초기화해서 아무 값이나 넣어보세요.
    //2. 1번 문제에서 초기화한 배열을 출력해봅시다.
    public static void main(String[] args) {

        int[][] score = new int[][]{{1, 2, 3}, {4, 5, 6}};

        System.out.println(score[0][0]); //배열 score의 1행 1열
        System.out.println(score[0][1]);            //1행2열
        System.out.println(score[0][2]);            //1행3열
        System.out.println(score[1][0]);            //2행1열
        System.out.println(score[1][1]);            //2행2열
        System.out.println(score[1][2]);            //2행3열


        //배열안에 값 넣어보기

        int[][] scoreNew = new int[][]{{10, 20, 30},
                                       {40, 50, 60},
                                       {70, 80, 90} };

        final int RINE=3;
        final int ROW=3;
        System.out.println("행렬 출력");
        for (int i = 0; i < RINE ; i++) {
            for (int j = 0; j <ROW ; j++) {
                //System.out.printf("scoreNew[%d][%d]=%d\n", i, j, scoreNew[i][j]); //나의 출력


                System.out.printf("%3d",scoreNew[i][j]);//행렬식 출력

            }
            System.out.println();
        }
        System.out.println();



        //구구단을 만들어보려고 했으나 실패
        /*final int DAN = 3;
        final int NUM = 4;
        int i,j;

        int[][] total;
        total = new int[DAN][NUM];

        for ( i = 1; i < DAN; i++) {

            for ( j = 1; j < NUM; j++) {
                total[i][j]=i*j;
                System.out.printf("%d%d",i,j);
            }
        }
    }*/
        }
    }

