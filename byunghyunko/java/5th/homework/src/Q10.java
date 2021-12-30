public class Q10 {
    public static void main(String[] args) {
        // 10. 2개의 배열을 만든다.
        //하나는 과일을 담는 장바구니 배열
        //하나는 해당 과일의 개수가 들어있는 배열이다.
        //사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
        //적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오


        // 해설강의 참고해서 이해하고 진행했습니다.

        final int APPLE_N = 5;
        final int TANGERINE_N = 3;
        final int ORANGE_N = 5;
        final int WATERMELON_N = 2;
        final int MELON_N = 3;
        final int GRAPE_N = 4;

        final int APPLE_I = 0;
        final int TANGERINE_I = 1;
        final int ORANGE_I = 2;
        final int WATERMELON_I = 3;
        final int MELON_I = 4;
        final int GRAPE_I = 5;


        final int SUM = 6; // 6종의 최대 범위 지정

        int []  A = new int[NUM]; // 과일의 종류
        int []  B = new int[NUM]; // 과일의 개수

        A[APPLE_I] = 6000;
        A[TANGERINE_I] = 5000;
        A[ORANGE_I] = 4000;
        A[WATERMELON_I] = 3000;
        A[MELON_I] = 2000;
        A[GRAPE_I] = 1000;

        B[APPLE_I] = APPLE_N;
        B[TANGERINE_I] = TANGERINE_N;
        B[ORANGE_I] = ORANGE_N;
        B[WATERMELON_I] = WATERMELON_N;
        B[MELON_I] = MELON_N;
        B[GRAPE_I] = GRAPE_N;

        int sum = 0;

        for(int i=0; i<SUM; i++){
            sum + = A[i] + B[i];
        }

        System.out.println("합산= " +sum);
    }
}