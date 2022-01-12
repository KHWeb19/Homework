public class P10 {
    //10. 2개의 배열을 만든다.
    //하나는 과일을 담는 장바구니 배열
    //하나는 해당 과일의 개수가 들어있는 배열이다.
    //사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
    //적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.
    public static void main(String[] args) {

        final int TOTAL = 6; // 장바구니 수

        int[] kindOffruits = new int[TOTAL]; // 장바구니 배열
        int[] numOffruits = new int[TOTAL]; // 과일 개수 배열

        // 숫자 입력
        final int APPLE_NUM = 5;
        final int TANGERINE_NUM = 3;
        final int ORANGE_NUM = 5;
        final int WATERMELON_NUM = 2;
        final int MELON_NUM = 3;
        final int GRAPE_NUM = 6;

        // 인덱스명 만들기
        final int APPLE_IDX = 0;
        final int TANGERINE_IDX = 1;
        final int ORANGE_IDX = 2;
        final int WATERMELON_IDX = 3;
        final int MELON_IDX = 4;
        final int GRAPE_IDX = 5;

        // 과일가격 계산
        final int MAX = 100;
        final int MIN = 10;
        int range = MAX - MIN + 1;

        // 과일가격 입력
        kindOffruits[APPLE_IDX] = ((int)(Math.random() * range) + MIN) * 100;
        kindOffruits[TANGERINE_IDX] = ((int)(Math.random() * range) + MIN) * 100;
        kindOffruits[ORANGE_IDX] = ((int)(Math.random() * range) + MIN) * 100;
        kindOffruits[WATERMELON_IDX] = ((int)(Math.random() * range) + MIN) * 100;
        kindOffruits[MELON_IDX] = ((int)(Math.random() * range) + MIN) * 100;
        kindOffruits[GRAPE_IDX] = ((int)(Math.random() * range) + MIN) * 100;

        // 과일 갯수 입력
        numOffruits[APPLE_IDX] = APPLE_NUM;
        numOffruits[TANGERINE_IDX] = TANGERINE_NUM;
        numOffruits[ORANGE_IDX] = ORANGE_NUM;
        numOffruits[WATERMELON_IDX] = WATERMELON_NUM;
        numOffruits[MELON_IDX] = MELON_NUM;
        numOffruits[GRAPE_IDX] = GRAPE_NUM;

        int sum = 0;

        for(int i = 0; i < TOTAL; i++){
            sum += kindOffruits[i] * numOffruits[i];
        }

        System.out.println("과일의 합산 가격 = " + sum);

    }
}
