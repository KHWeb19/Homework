public class Ans10 {
    public static void main(String[] args) {
        final int APPLE_NUM = 5;
        final int MANDARIN_NUM = 3;
        final int ORANGE_NUM = 5;
        final int WATERMELON_NUM = 2;
        final int MELON_NUM = 3;
        final int GRAPE_NUM = 4;

        final int APPLE_IDX = 0;
        final int MANDARIN_IDX = 1;
        final int ORANGE_IDX = 2;
        final int WATERMELON_IDX = 3;
        final int MELON_IDX = 4;
        final int GRAPE_IDX = 5;

        final int TOTAL = 6;

        int[] kindsOfFruit = new int[TOTAL];
        int[] numOfFruit = new int[TOTAL];

        kindsOfFruit[APPLE_IDX] = 1000;
        kindsOfFruit[MANDARIN_IDX] = 500;
        kindsOfFruit[ORANGE_IDX] = 2000;
        kindsOfFruit[WATERMELON_IDX] = 10000;
        kindsOfFruit[MELON_IDX] = 5000;
        kindsOfFruit[GRAPE_IDX] = 3000;

        numOfFruit[APPLE_IDX] = APPLE_NUM;
        numOfFruit[MANDARIN_IDX] = MANDARIN_NUM;
        numOfFruit[ORANGE_IDX] = ORANGE_NUM;
        numOfFruit[WATERMELON_IDX] = WATERMELON_NUM;
        numOfFruit[MELON_IDX] = MELON_NUM;
        numOfFruit[GRAPE_IDX] = GRAPE_NUM;

        int sum = 0;

        for (int i = 0; i < TOTAL; i++) {
            sum += kindsOfFruit[i] * numOfFruit[i];
        }

        System.out.println("전체 합산가: " + sum);
    }
}