public class ArrayTest {
    final int ARR = 2;

    private int[][] arr; //배열 선언

    public void initArr(){ //초기화
        arr = new int[ARR][ARR]; // 배열 생성

        System.out.println("행렬 생성");

        for(int i = 0; i < ARR; i++){ //4개의 배열 생성
            for(int j = 0; j < ARR; j++){
                arr[i][j] = i+j;
            }
        }
    }

    public void printArr(){
        for(int i = 0; i < ARR; i++){ //4개의 배열 생성
            for(int j = 0; j < ARR; j++){
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
