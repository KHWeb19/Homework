public class Q10 {
    public static void main(String[] args) {

        // 10. 2개의 배열을 만든다.
        //     하나는 과일을 담는 장바구니 배열
        //     하나는 해당 과일의 개수가 들어있는 배열이다.
        //     사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
        //     적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.


        //  ★★★ 질문 ★★★
        //  코드를 작성하고서 돌려보니까 맨 밑에 이런 빨간색 줄이 뜨는데 이건 무슨 의미인가요?
        //  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
        //	at Q10.main(Q10.java:42)

        // 2개 배열 작성
        // 자료형[] 변수이름;
        // 변수이름 = new 자료형[] { 값, 값, 값, ...}
        // 과일의 이름은 문자니까 String 사용

        String[] Fruit;
        Fruit = new String[6]; // 과일을 담는 바구니 배열

        int[] FruitNum;
        FruitNum = new int[6]; // 과일 개수가 들어있는 바구니 배열

        // 사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현

        // 사과 귤 오렌지 수박 메론 포도
        // [5] [3] [5] [2] [3] [4]
        //  0   1   2   3   4   5

        Fruit[0] = "사과"; Fruit[1] = "귤"; Fruit[2] = "오렌지";
        Fruit[3] = "수박"; Fruit[4] = "메론"; Fruit[5] = "포도";

        FruitNum[0] = 5; FruitNum[1] = 3; FruitNum[2] = 5;
        FruitNum[3] = 2; FruitNum[4] = 3; FruitNum[5] = 4;

        // 적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.

        int[] Price;
        Price = new int[6]; // 과일 값을 지정한 배열

        Price[0] = 1000; Price[1] = 100; Price[2] = 200;
        Price[3] = 300; Price[4] = 400; Price[5] = 500;

        for (int i=0; i<7; i++){
            System.out.println(Fruit[i]+"의 가격 합 = "+ FruitNum[i]*Price[i]);
        }

    }
}
