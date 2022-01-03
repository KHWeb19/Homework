public class Practice1and2 {
    public static void main(String[] args) {
        //문제1. 2 by 2 이중 배열을 초기화해서 아무 값이나 넣어보세요.
        //→ 2행, 2열 배열을 만들라는 말씀이겠지?

        final int ARR = 2;

        int[][] arr; //선언
        arr = new int[ARR][ARR]; //생성
        //new String[2][2]는
        //  0  1
        //0 [] []
        //1 [] [] < 이런 모양으로 나타나게 된다.

        //반복문을 돌면서 배열이 출력되도록 한다.
        for(int i = 0; i < ARR; i++){
            for(int j = 0; j < ARR; j++){
                //반복문 내에 반복문을 만들어 총 네번 결과가 출력되도록한다.
                //i+j를 배열의 값으로 넣어 배열 내의 값들을 더한 결과가 나오도록 한다.
            System.out.printf("arr[%d][%d] = [%d]\n", i, j, i+j);
        }

    }
}
}

