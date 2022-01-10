public class M10 {
    public static void main(String[] args) {

        //과일들의 종류와 갯수
        final int APPLE_NUM = 5;
        final int MANDARIN_NUM = 3;
        final int ORANGE_NUM = 5;
        final int WATERMELON_NUM = 2;
        final int MELON_NUM = 3;
        final int GRAPE_NUM = 4;

        //과일종류들을 번호화

        final int APPLE_IDX = 0;
        final int MANDARIN_IDX = 1;
        final int ORANGE_IDX = 2;
        final int WATERMELON_IDX = 3;
        final int MELON_IDX = 4;
        final int GRAPE_IDX = 5;

        final int TOTAL = 6;
        
        //ARRAY kindsOfFruit[]={0(사과),1(귤),2(오렌지),3(수박),4(멜론),5(포도)}
        //ARRAY numOfFruit[]={0(사과),1(귤),2(오렌지),3(수박),4(멜론),5(포도)}
        int[] kindsOfFruit = new int[TOTAL];
        int[] numOfFruit = new int[TOTAL];

        //가격을 대입
        ////ARRAY kindsOffruit[]={1000,500,2000,10000,5000,3000}
        kindsOfFruit[APPLE_IDX] = 1000;
        kindsOfFruit[MANDARIN_IDX] = 500;
        kindsOfFruit[ORANGE_IDX] = 2000;
        kindsOfFruit[WATERMELON_IDX] = 10000;
        kindsOfFruit[MELON_IDX] = 5000;
        kindsOfFruit[GRAPE_IDX] = 3000;

        //갯수를 대입
        //ARRAY numOfruit[]={5,3,5,2,3,4}
        numOfFruit[APPLE_IDX] = APPLE_NUM;
        numOfFruit[MANDARIN_IDX] = MANDARIN_NUM;
        numOfFruit[ORANGE_IDX] = ORANGE_NUM;
        numOfFruit[WATERMELON_IDX] = WATERMELON_NUM;
        numOfFruit[MELON_IDX] = MELON_NUM;
        numOfFruit[GRAPE_IDX] = GRAPE_NUM;

        int sum = 0;

        for (int i = 0; i < TOTAL; i++) {
            sum += kindsOfFruit[i] * numOfFruit[i];
            //kindsOfFruit의 i번 값과 numOfFruit의 i번값 곱하기
            //갯수*가격을 6번 더함
        }
        System.out.println("전체 합산가: " + sum);
    }
}
