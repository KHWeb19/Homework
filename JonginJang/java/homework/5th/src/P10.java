import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
 /*10. 2개의 배열을 만든다.
       하나는 과일을 담는 장바구니 배열
       하나는 해당 과일의 개수가 들어있는 배열이다.
       사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
       적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.
*/
        final int MAX = 6;
        final int START = 0;
        final int END = 6;


        String[] fruit = new String[MAX];
        int[] cntfruit = new int[MAX];
        int[] price = new int[MAX];
        price[0] = 1000;
        price[1] = 2000;
        price[2] = 3000;
        price[3] = 4000;
        price[4] = 5000;
        price[5] = 6000;
        int totalPrice = 0;

        Scanner scan = new Scanner(System.in);
        for(int i = START; i<END ; i++){
            System.out.print("과일의 이름을 입력하세요: ");
            String inputFruit = scan.next();
            fruit[i] = inputFruit;
            System.out.print("몇 개를 구매하시나요? : ");
            int inputcnt = scan.nextInt();
            cntfruit[i] = inputcnt;
        }
        for(int i = START; i<END ; i++){
            System.out.printf("구매하신 %s 품목의 총 가격은 %d원입니다. (구매 수량:%d, 개당 가격: %d원).\n",fruit[i],price[i]*cntfruit[i],cntfruit[i],price[i]);
            totalPrice += (price[i]*cntfruit[i]);
        }
        System.out.println("합산 가격 = "+totalPrice);
    }

}
