public class DoubleArray {


    //2 by 2 이중 배열을 초기화해서 아무 값이나 넣어보세요.
    // 1.2 by 2 이중배열 생성
    // 2.초기화 해서 아무 값 넣기


    final int NUM = 100;

    int arr[][] = new int[2][2];

    public void initRandomValue() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * NUM);

                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);


            }
        }
    }
}






