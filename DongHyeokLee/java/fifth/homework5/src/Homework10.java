public class Homework10 {
    public static void main(String[] args) {
        //2개의 배열을 만든다.
        //     하나는 과일을 담는 장바구니 배열
        //     하나는 해당 과일의 개수가 들어있는 배열이다.
        //     사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
        //     적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.

        // 과일 바구니 배열
        // 과일 개수 배열
        //값도 배열?!
        // 시간이 부족해서 못풀었습니다
        //근데 시간이 있어도 못풀거 같습니다

        String[] fruit = new String[6];

        fruit[0] = "사과";
        fruit[1] = "귤";
        fruit[2] = "오렌지";
        fruit[3] = "수박";
        fruit[4] = "메론";
        fruit[5] = "포도";

        int[] number = new int[6];

        number[0] = 5;
        number[1] = 3;
        number[2] = 5;
        number[3] = 2;
        number[4] = 3;
        number[5] = 4;

        int[] price = new int[6];
        price[0] = 1300;
        price[1] = 600;
        price[2] = 1800;
        price[3] = 8000;
        price[4] = 15000;
        price[5] = 7000;

        for(int i = 0 ; i<6; i++){
            System.out.println(fruit[i] + number[i] + "개의 가격은" + number[i]*price[i] + "원 입니다." );

        }


    }
}
