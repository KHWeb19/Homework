public class Quiz10 {
    public static void main(String[] args) {
        /*
        1. 과일 배열 , 과일 개수 배열
        2. 문제 이해 후 풀이
         */

        final int APPLE = 5 ;
        final int MANDARIN = 5 ;
        final int ORANGE = 5 ;
        final int WATERMELON = 5 ;
        final int MELON = 5 ;
        final int GRAPE = 5 ;

        final int APPLEBOX = 0;
        final int MANDARINBOX = 1;
        final int ORANGEBOX = 2;
        final int WATERMELONBOX = 3;
        final int MELONBOX = 4;
        final int GRAPEBOX = 5;

        final int TOTAL = 6;

        int[] FruitPrice = new int[TOTAL];
        int[] NumofFruit = new int[TOTAL];

        FruitPrice[APPLEBOX] = 1500;
        FruitPrice[MANDARINBOX] = 700;
        FruitPrice[ORANGEBOX] = 2000;
        FruitPrice[WATERMELONBOX] = 10000;
        FruitPrice[MELONBOX] = 20000;
        FruitPrice[GRAPEBOX] = 5000;

        NumofFruit[APPLEBOX] = APPLE;
        NumofFruit[MANDARINBOX] = MANDARIN;
        NumofFruit[ORANGEBOX] = ORANGE;
        NumofFruit[WATERMELONBOX] = WATERMELON;
        NumofFruit[MELONBOX] = MELON;
        NumofFruit[GRAPEBOX] = GRAPE;

        int sum = 0;

        for (int i = 0; i < TOTAL; i++){
            sum += FruitPrice[i] * NumofFruit[i];
        }
        System.out.println("총 가격은 " +sum);
    }
}
