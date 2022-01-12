public class HW10_1 {// 과일_IDX를 지정해줌

    public static void main(String[] args) {
        final int APPLE_NUM       = 5;
        final int MANDARIN_NUM    = 3;
        final int ORANGE_NUM      = 5;
        final int WATERMELON_NUM  = 2;
        final int MELON_NUM       = 3;
        final int GRAPE_NUM       = 4;

        //인덱스를 지정해줌(ex 영수증에서 사용하는 방법)
        final int APPLE_IDX      = 0;
        final int MANDARIN_IDX   = 1;
        final int ORANGE_IDX     = 2;
        final int WATERMELON_IDX = 3;
        final int MELON_IDX      = 4;
        final int GRAPE_IDX      = 5;

        final int TOTAL = 6;

        int [] kindsOfFruit = new int [TOTAL];
        int []  numOfFruit = new int [TOTAL];



        kindsOfFruit[APPLE_IDX]       = 1000;   //과일 종류의 배열에 과일에 숫자를 부여한 것을 넣어줌
        kindsOfFruit[MANDARIN_IDX]    = 1000;
        kindsOfFruit[ORANGE_IDX]      = 2000;
        kindsOfFruit[WATERMELON_IDX]  = 1000;
        kindsOfFruit[MELON_IDX]       = 1000;
        kindsOfFruit[GRAPE_IDX]       = 2000;

        numOfFruit[APPLE_IDX]       = APPLE_NUM;
        numOfFruit[MANDARIN_IDX]    = MANDARIN_NUM;
        numOfFruit[ORANGE_IDX]      = ORANGE_NUM;
        numOfFruit[WATERMELON_IDX]  = WATERMELON_NUM;
        numOfFruit[MELON_IDX]       = MELON_NUM;
        numOfFruit[GRAPE_IDX]       = GRAPE_NUM;

        int sum = 0;

        for (int i = 0; i < TOTAL; i++) {
            sum += kindsOfFruit[i] * numOfFruit[i];
        }
        System.out.printf("전체 합계:%d" , sum);
    }
}
