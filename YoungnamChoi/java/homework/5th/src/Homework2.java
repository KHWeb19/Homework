import java.math.BigInteger;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
        //   BigInteger를 통해서 50번째 항을 구해보자!


        /*
        1.등비 수열의 항을 구하기 위해서는 공비를 알아야 하고 공비는 2이다.
        2.등비 수열의 n번째 항을 구하는 공식은 An= An-1*r 이고 r은 공비이다.
        3. 시작값을 설정하고 빈 배열을 정의 한다.
        4.사용자의 입력을 받아야 하므로 Scanner를 구현한다.
        5. Scanner로 입력되는 값음 다음 값으로 받는다.
        6. int는 숫자를 표현하는데 한계가 있기 때문에 큰 수를 사용하는데는 BigInteger로 표현해야 한다.
         */

        final int START = 2; //시작은 3번째 항에서 시작을 한다.
        final int R = 2; // 공비는 일정 한 값이기 때문에 미리 선언함

        BigInteger[] arr; //

        Scanner sc = new Scanner(System.in);

        System.out.print("항을 입력하세요 : ");

        int end = sc.nextInt();

        arr= new BigInteger[end];


        arr[0]=  new BigInteger("1");
        arr[1] = new BigInteger("2");

        for(int i = START; i<end; i++){
            arr[i]=arr[i-1].multiply(BigInteger.valueOf(R)); // biginteger의 int 값이 들어가는 곳
            System.out.println("arr[" + i + "] = " + arr[i]);

        }



    }
}
