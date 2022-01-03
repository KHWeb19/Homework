import java.util.Scanner;
//2개의 배열을 만든다.
//하나는 과일을 담는 장바구니 배열
//하나는 해당 과일의 개수가 들어있는 배열이다.
//사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
//적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.
public class Home10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int SIZE = 6;
        String[] fruit = new String[SIZE];
        int[] price = new int[SIZE];
        int[] num = new int[SIZE];
        int sum = 0;
        fruit[0]= "사과";
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

        for(int i = 0; i < SIZE; i++){
            System.out.printf("%s의 개당 가격\n", fruit[i]);
            price[i] = scan.nextInt();
            System.out.printf("%s %d개 개당 %d원\n합산가격: %d원\n", fruit[i],num[i], price[i], num[i]*price[i]);
            sum += price[i] * num[i];
        }
        System.out.printf("총가격 : %d", sum);
    }
}
