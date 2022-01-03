import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {
        //2개의 배열을 만든다.
        //     하나는 과일을 담는 장바구니 배열
        //     하나는 해당 과일의 개수가 들어있는 배열이다.
        //     사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
        //     적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.

        /*
        1.과일을 담고 있는 배열을 선언한다.
        2.과일의 개수를 담고 있는 배열을 선언한다.
        3.적당한 가격을 담고 있는 배열을 선언한다.
        4.전체 합산 가격을 출력한다.
         */

        String[] fruit = new String[6];
        int[] count = new int[6];

        fruit[0] = "사과";
        fruit[1] = "귤";
        fruit[2] = "오렌지";
        fruit[3] = "수박";
        fruit[4] = "메론";
        fruit[5] = "포도";

        count[0]=5;
        count[1]=3;
        count[2]=5;
        count[3]=2;
        count[4]=3;
        count[5]=4;

        int price[] =new int[6];
        price[0]=1000;
        price[1]=500;
        price[2]=2000;
        price[3]=8000;
        price[4]=4000;
        price[5]=3500;

        for(int i=0; i<6; i++){
            System.out.printf("%s %d개 개당 %d원 총합 %d원\n", fruit[i], count[i], price[i], count[i]*price[i]);
        }




    }
}