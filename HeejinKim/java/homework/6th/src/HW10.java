public class HW10 {//내 풀이

    public static void main(String[] args) {
        /* 2개의 배열을 만든다.
        하나는 과일을 담는 장바구니 배열
        하나는 해당 과일의 개수가 들어있는 배열이다.
        사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
        적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오. */

        //1.2개의 배열을 만든다
        //2.과일 담는 배열, 갯수 배열
        //3.랜덤으로 가격 생성
        final int TOTAL = 6;

        String[] fruit = new String[TOTAL]; //과일, 갯수, 가격 배열
        int[] num = new int[TOTAL];
        int[] price = new int[TOTAL];


        fruit[0] = "사과";
        fruit[1] = "귤";
        fruit[2] = "오렌지";
        fruit[3] = "수박";
        fruit[4] = "메론";
        fruit[5] = "포도";

        num[0] = 5;
        num[1] = 3;
        num[2] = 5;
        num[3] = 2;
        num[4] = 3;
        num[5] = 4;

        price[0] = 1000;
        price[1] = 2000;
        price[2] = 1000;
        price[3] = 5000;
        price[4] = 6000;
        price[5] = 5000;

         int sum = 0;

        for (int i = 0; i < TOTAL; i++) {

          sum+= num[i] * price[i];
            System.out.printf("%s합계=%d\n", fruit[i], sum);
        }

    }
}
