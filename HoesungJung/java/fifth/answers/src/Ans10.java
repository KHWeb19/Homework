public class Ans10 {
    public static void main(String[] args) {
        ////불변의 과일별 개수.
        final int APPLE_NUM = 5;
        final int MANDARIN_NUM = 3;
        final int ORANGE_NUM = 5;
        final int WATERMELON_NUM = 2;
        final int MELON_NUM = 3;
        final int GRAPE_NUM = 4;

        ////과일에 변하지 않을 번호를 매김.
        final int APPLE_IDX = 0;
        final int MANDARIN_IDX = 1;
        final int ORANGE_IDX = 2;
        final int WATERMELON_IDX = 3;
        final int MELON_IDX = 4;
        final int GRAPE_IDX = 5;

        ////과일의 종류는 총 6가지
        final int TOTAL = 6;

        ////과일의 종류와 고유번호를 배열화 시킴.
        int[] kindsOfFruit = new int[TOTAL];
        int[] numOfFruit = new int[TOTAL];

        ////과일별로 값을 매김.
        kindsOfFruit[APPLE_IDX] = 1000;
        kindsOfFruit[MANDARIN_IDX] = 500;
        kindsOfFruit[ORANGE_IDX] = 2000;
        kindsOfFruit[WATERMELON_IDX] = 10000;
        kindsOfFruit[MELON_IDX] = 5000;
        kindsOfFruit[GRAPE_IDX] = 3000;

        ////과일별 개수를 설정
        numOfFruit[APPLE_IDX] = APPLE_NUM;
        numOfFruit[MANDARIN_IDX] = MANDARIN_NUM;
        numOfFruit[ORANGE_IDX] = ORANGE_NUM;
        numOfFruit[WATERMELON_IDX] = WATERMELON_NUM;
        numOfFruit[MELON_IDX] = MELON_NUM;
        numOfFruit[GRAPE_IDX] = GRAPE_NUM;

        ////정수의 합을 초기화
        int sum = 0;

        ////임의의 정수의 변수 i를 0으로 초기화
        ////i는 과일 종류의 개수보다 작아야하고,
        ////한번 출력 후 1씩 증가함.
        for (int i = 0; i < TOTAL; i++) {
            ////과일별 값과, 과일별 개수를 곱하고 이를 모두 더함.
            sum += kindsOfFruit[i] * numOfFruit[i];
        }
        ////전체 과일의 합산가가 나옴.
        System.out.println("전체 합산가: " + sum);
    }
}
