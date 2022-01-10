public class Hw10 {
    public static void main(String[] args) {
        //2개의 배열을 만든다.
        //하나는 과일을 담는 장바구니 배열
        //하나는 해당 과일의 개수가 들어있는 배열이다.
        //사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
        //적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.

        //과일이 6종류이니 크기를 6으로 설정
        //과일의 이름과 수량을 각각 배열로 지정
        //과일의 가격을 임의로 지정하여 배열로 추가
        //과일의 합산 가격은 과일의 수량과 단가를 곱하여 표현

        final int SIZE = 6;

        String[]fruit_name = new String[SIZE];
        int[]fruit_quantity = new int[SIZE];

        fruit_name[0] = "사과";
        fruit_name[1] = "귤";
        fruit_name[2] = "오렌지";
        fruit_name[3] = "수박";
        fruit_name[4] = "메론";
        fruit_name[5] = "포도";

        fruit_quantity[0] = 5;
        fruit_quantity[1] = 3;
        fruit_quantity[2] = 5;
        fruit_quantity[3] = 2;
        fruit_quantity[4] = 3;
        fruit_quantity[5] = 4;

        int[] fruit_price = new int[SIZE];
        fruit_price[0] = 1000;
        fruit_price[1] = 500;
        fruit_price[2] = 1500;
        fruit_price[3] = 10000;
        fruit_price[4] = 5000;
        fruit_price[5] = 3000;

        for(int i = 0; i<SIZE; i++){
            System.out.printf("%s의 수량: %d개    단가: %d원    금액: %d원\n",fruit_name[i],fruit_quantity[i],fruit_price[i],fruit_quantity[i]*fruit_price[i]);
        }
    }
}
