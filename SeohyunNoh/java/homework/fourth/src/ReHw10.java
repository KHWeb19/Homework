import java.security.spec.RSAOtherPrimeInfo;

public class ReHw10 {
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

        int[] kinsOfFruit = new int[TOTAL];
        int[] numOfFruit = new int[TOTAL];


        kinsOfFruit[APPLE_IDX] = 1000;
        kinsOfFruit[MANDARIN_IDX] = 2000;
        kinsOfFruit[ORANGE_IDX] = 3000;
        kinsOfFruit[WATERMELON_IDX] = 4500;
        kinsOfFruit[MELON_IDX] = 5500;
        kinsOfFruit[GRAPE_IDX] = 3500;

        numOfFruit[APPLE_IDX] = APPLE_NUM;
        numOfFruit[MANDARIN_IDX] = MANDARIN_NUM;
        numOfFruit[ORANGE_IDX] = ORANGE_NUM;
        numOfFruit[WATERMELON_IDX] = WATERMELON_NUM;
        numOfFruit[MELON_IDX] = MELON_NUM;
        numOfFruit[GRAPE_IDX] = GRAPE_NUM;

        int sum = 0;

        //루프를 돌릴 때
        //저 _IDX 자리에 i=0(apple)부터 i=5(grape)까지
        //순차적으로 돌아갈거임
        for(int i = 0 ; i < TOTAL; i++){
            System.out.println(kinsOfFruit[i]);
            System.out.println(numOfFruit[i]);
            sum += kinsOfFruit[i] * numOfFruit[i];
        }

        System.out.println("전체 합산:" + sum);


    }
}
