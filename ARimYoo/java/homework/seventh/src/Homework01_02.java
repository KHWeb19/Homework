public class Homework01_02 {
    public static void main(String[] args) {

        // 2 by 2 이중 배열을 초기화해서 아무 값이나 넣어보세요.
        // 그 뒤 출력

        final int arr1 = 2;
        final int arr2 = 2;

        // 이중 배열 선언
        int [][] arr3;
        // 배열의 초기화
        arr3 = new int[arr1][arr2];

        // 값 할당
        arr3[0][0] = 0;
        arr3[0][1] = 1;
        arr3[1][0] = 2;
        arr3[1][1] = 3;

        // 출력
        for(int i = 0; i < arr1; i++){
            for(int j = 0; j < arr2; j++){
                System.out.printf("배열 arr3[%d][%d] : %d\n", i, j, arr3[i][j]);
            }
        }






    }
}
