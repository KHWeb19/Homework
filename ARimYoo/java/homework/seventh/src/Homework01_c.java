public class Homework01_c {

    static final int arr1 = 2;
    static final int arr2 = 2;

    // 이중 배열 선언
    private int[][] arr3;
    // 배열의 초기화

    public void allocarr() {

        arr3 = new int[arr1][arr2];

        // 값 할당
        arr3[0][0] = 0;
        arr3[0][1] = 1;
        arr3[1][0] = 2;
        arr3[1][1] = 3;

    }

    // 값 출력
    public void printarr () {
        allocarr();

        for (int i = 0; i < arr1; i++) {
            for (int j = 0; j < arr2; j++) {
                System.out.printf("배열 arr3[%d][%d] : %d\n", i, j, arr3[i][j]);

            }
        }
    }
}

