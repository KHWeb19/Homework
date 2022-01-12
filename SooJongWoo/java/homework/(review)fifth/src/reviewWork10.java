public class reviewWork10 {
    public static void main(String[] args) {
        // 과일 별 개수 설정
        final int APPLE_NUM = 5;
        final int MANDARIN_NUM = 3;
        final int ORANGE_NUM = 5;
        final int WATERMELON_NUM = 2;
        final int MELON_NUM = 3;
        final int GRAPE_NUM = 4;

        // 과일 별 index위치 지정
        final int APPLE_IDX = 0;
        final int MANDARIN_IDX  = 1;
        final int ORANGE_IDX  = 2;
        final int WATERMELON_IDX  = 3;
        final int MELON_IDX  = 4;
        final int GRAPE_IDX  = 5;

        // 총 배열 길이 지정
        final int TOTAL = 6;

        // 과일의 가지수에 대한 배열생성
        int [] kindsOfFruit = new int[TOTAL];
        // 과일의 각 금액에 대한 배열생성
        int [] numOfFruit = new int[TOTAL];

        // 과일 별 금액 설정하기
        kindsOfFruit[APPLE_IDX] = 1000;
        kindsOfFruit[MANDARIN_IDX] = 500;
        kindsOfFruit[ORANGE_IDX] = 2000;
        kindsOfFruit[WATERMELON_IDX] = 10000;
        kindsOfFruit[MELON_IDX] = 5000;
        kindsOfFruit[GRAPE_IDX] = 3000;

        // 과일 별 개수 대입
        numOfFruit[APPLE_IDX] = APPLE_NUM;
        numOfFruit[MANDARIN_IDX] = MANDARIN_NUM;
        numOfFruit[ORANGE_IDX] = ORANGE_NUM;
        numOfFruit[WATERMELON_IDX] = WATERMELON_NUM;
        numOfFruit[MELON_IDX] = MELON_NUM;
        numOfFruit[GRAPE_IDX] = GRAPE_NUM;

        int sum = 0; // sum은 0으로 지정해놓기

        for (int i = 0; i < TOTAL; i++) {
            sum += kindsOfFruit[i] * numOfFruit[i];
            // sum = 과일 금액 * 과일 개수 를 반복하여 다 더하기
        }

        System.out.println("전체 합산가: " + sum);
    }
}

//  1. 각 과일에 개수 및 index위치 값을 지정 해주기
//  2. for문을 활용하여 각 과일의 개수에 각 과일별 금액을 더해서 그 금액을 모두 합하기


/* 추후 수업을 진행 다음에는 말씀하셨던거 처럼 어떤사람이 랜덤하게 어떤 과일을 살 것인지,
   그 과일을 몇개나 살 것인지도 코드로 만들 수 있겠죠..?
   머리 속으로는 그려지는데 그 코드들을 지금 상상만으로 만드려고하니 머리가 아프네요...

   나머지 6,7,8번에 대한 문제는 아직 이해하고 있는 단계여서 코드를 따라서 작성해서 숙제로
   내는것보다는 혼자 스스로 더 보고 해석하는게 나을꺼 같아 빼놓았습니다!
 */