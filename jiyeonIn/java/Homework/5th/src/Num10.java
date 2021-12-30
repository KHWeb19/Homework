public class Num10 {
    public static void main(String[] args) {
        //2개의 배열을 만든다.
        //하나는 과일을 담는 장바구니 배열
        //하나는 해당 과일의 개수가 들어있는 배열이다.
        //사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
        //적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오

        /*
        1. 배열 각각 두개 만들기
        2. 각각의 값 넣어서 합산 만들기
         */

        String [] fruit = new String[] {"사과","귤","오렌지","수박","메론","포도"};
        int [] basket = new int [] {5,3,5,2,3,4};

        final int START = 0;
        final int END = 6;
        final int MAX = 3000;
        final int MIN = 500;
        int range = MAX -MIN +1;
        int rand = 0;
        int sum = 0;
        int total = 0;


        for (int i=START;i<END;i++){
            rand = (int)(Math.random()*range+MIN);
            total = rand * basket[i];
            sum += total;

            System.out.printf("%s의 개수:%d,1개의 가격:%d, 총 가격 %d\n",fruit[i],basket[i],rand,total);
        } // 질문 : 랜덤으로 가격 받으니 1의 자리도 나오는데, 혹시 랜덤으로 100원 단위로 출력은 어렵겠죠?
        System.out.println("총 가격 : "+sum);

    }
}
