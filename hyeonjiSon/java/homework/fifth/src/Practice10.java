public class Practice10 {
    public static void main(String[] args) {
        //문제10. 2개의 배열을 만든다.
        //     하나는 과일을 담는 장바구니 배열
        //     하나는 해당 과일의 개수가 들어있는 배열이다.
        //     사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
        //     적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.

        //1. 장바구니(과일 이름)배열과 과일 개수 배열을 각각 만든다.
        //   1_1. 규칙적인 순서는 없으므로 배열내용은 각각 지정한다.

        final int END = 6;
        String[] basket = new String[END];
        int[] fruitNum = new int[END];

        basket[0] = "사과";
        basket[1] = "귤";
        basket[2] = "오렌지";
        basket[3] = "수박";
        basket[4] = "메론";
        basket[5] = "포도"; //총 여섯개의 배열

        fruitNum[0] = 5;
        fruitNum[1] = 3;
        fruitNum[2] = 5;
        fruitNum[3] = 2;
        fruitNum[4] = 3;
        fruitNum[5] = 4; //총 여섯개의 배열

        //2. 과일 1개의 값을 랜덤으로 매길 수 있도록 하고 *과일 개수를 해줄 수 있도록 한다.

        final int PMIN = 1000;
        final int PMAX = 4000; // 과일은 개당 1000 ~ 4000 사이의 가격이다.
        int range = PMAX - PMIN + 1;

        for (int i = 0; i < END; i++) {
            int price = (int) (Math.random() * range + PMIN );
            System.out.printf("%s 은/는 1개에 %d 이므로, %d개 구매하면 %d 입니다.\n", basket[i], price, fruitNum[i], price * fruitNum[i]);

            //3. 최종적으로 "(과일이름)은 1개에 (가격) 이므로 (갯수)를 구매하면 (가격*갯수) 입니다."라고 출력.

        }
    }
}
