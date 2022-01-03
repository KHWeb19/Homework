public class Homework10 {
    public static void main(String[] args) {

        // 2개의 배열을 만든다.
        // 하나는 과일을 담는 장바구니 배열
        // 하나는 해당 과일의 개수가 들어있는 배열이다.
        // 사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
        // 적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.

        // 과일의 이름 (문자)를 표현할 수 있는 배열은 String[] = new String[]    -->구글링,,

        String [] basket = {"사과", "귤", "오렌지", "수박", "메론", "포도"};
        int [] fruit = {5, 3, 5, 2, 3, 4};

        final int MAX = 5000;
        final int MIN = 500;
        int range = MAX - MIN + 1;


        for (int i = 0; i < 6; i++){

            // 값이 매겨져 있지 않으므로 과일의 가격을 적당한 범위내 랜덤으로 구한다.
            int rand = (int)(Math.random() * range + MIN);
            
            System.out.printf("%s는 1개당 %d원, 총 구입 갯수 : %d개 (%d원)\n", basket[i], rand, fruit[i], rand*fruit[i]);

        }


    }
}
