public class ArrayTest {
    final int ARR = 2;
    final int MIN = 1;
    final int MAX = 6;

    //2.ArrayTest내에 배열을 만들어준다.
    private int[][] arr; //선언

    public void initArr() { //배열 생성
        arr = new int[ARR][ARR]; //Data 타입의 배열을 2개 생성?
        //new String[2][2]는
        //  0  1
        //0 [] []
        //1 [] [] < 이런 모양으로 나타나게 된다.

        //2_2. 배열 출력 메서드를 인용한다.

        printArr();

    }

    //2_1. 배열을 출력할 수 있는 메서드를 만든다.
    public void printArr() {
        for (int i = 0; i < ARR; i++) {
            for (int j = 0; j < ARR; j++) {
                //반복문 내에 반복문을 만들어 총 네번 결과가 출력되도록한다.
                //i+j를 배열의 값으로 넣어 배열 내의 값들을 더한 결과가 나오도록 한다.
                System.out.printf("arr[%d][%d] = [%d]\n", i, j, i + j);
            }
        }

    }
}
