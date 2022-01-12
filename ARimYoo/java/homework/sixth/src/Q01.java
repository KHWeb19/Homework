import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        // 내가 한 풀이와 다르게 Math.pow 이용해보기

        final int MAX = 31;  // 31항 이후로는 그냥 int값으로는 올바르게 출력되지 않으므로..
        final int START = 0;
        final int BASE = 2;

        Scanner scan = new Scanner(System.in);
        System.out.println("구하고자 하는 등비수열의 항을 입력하시오 : ");
        int end = scan.nextInt();

        int [] arr = new int[end];

        for (int i = START; i < end; i++){

            if(i > MAX){
                System.out.println("값이 올바르게 출력되지 않습니다.");
            } else {
                arr[i]=(int)Math.pow(BASE,i);
                //Math.pow(x,y)의 의미 : x의 y승을 구하는 식   2^0 = 1
                System.out.println(arr[i]);
            }

        }

    }
}
