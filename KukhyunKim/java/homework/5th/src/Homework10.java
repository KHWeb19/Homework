public class Homework10 {
    public static void main(String[] args) {
        /*
        10. 2개의 배열을 만든다.
            하나는 과일을 담는 장바구니 배열
            하나는 해당 과일의 개수가 들어있는 배열이다.
            사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
            적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.
         */
        /*
        1. 배열 1번
           과일들의 갯수
        2. 배열 2번
           과일의 가격
        3. 과일들의 가격과 갯수 곱해서 출력
         */

        final int APPLE_IDX = 0;
        final int MANDARIN_IDX = 1;
        final int ORANGE_IDX = 2;
        final int WATERMELON_IDX = 3;
        final int MELON_IDX = 4;
        final int GRAPE_IDX = 5;
        // 과일을 넣을 인덱스 번호 설정

        final int APPLE_NUM = 5;
        final int MANDARIN_NUM = 3;
        final int ORANGE_NUM = 5;
        final int WATERMELON_NUM = 2;
        final int MELON_NUM = 3;
        final int GRAPE_NUM = 4;
        // 과일들 몇개를 살지 설정 (문제 - 5 3 5 2 3 4)

        final int TOTAL = 100;
        // 토탈값을 상관없이하려면 BigInteger 사용해서 해도 괜찮을것같음
        // 재고가 무한히 있는 과일가게?

        int[] kindsOfFruit = new int[TOTAL];
        int[] numOfFruit = new int[TOTAL];
        // 과일사는양 인덱스 마다 수치 설정

        kindsOfFruit[APPLE_IDX] = 100;
        kindsOfFruit[MANDARIN_IDX] = 200;
        kindsOfFruit[ORANGE_IDX] = 300;
        kindsOfFruit[WATERMELON_IDX] = 400;
        kindsOfFruit[MELON_IDX] = 500;
        kindsOfFruit[GRAPE_IDX] = 600;
        // 과일개별 인덱스에 엘리먼트(과일가격)지정
        // * 매일매일 시장가격이 바뀌므로 판매가는 이부분을 조정

        numOfFruit[APPLE_IDX] = APPLE_NUM;
        numOfFruit[MANDARIN_IDX] = MANDARIN_NUM;
        numOfFruit[ORANGE_IDX] = ORANGE_NUM;
        numOfFruit[WATERMELON_IDX] = WATERMELON_NUM;
        numOfFruit[MELON_IDX] = MELON_NUM;
        numOfFruit[GRAPE_IDX] = GRAPE_NUM;
        // 몇개를 샀는지 인덱스마다 엘리멘트지정

        int sum = 0;

        for (int i = 0; i < TOTAL; i++) {
            sum += kindsOfFruit[i] * numOfFruit[i];
        }
        // 인덱스 0~TOTAL 사이값을 모두 대입하고(kindsOfFruit[i] * numOfFruit[i]) 더해라

        System.out.println("전체 합산가: " + sum);
        // 출력 전체값
    }

}
