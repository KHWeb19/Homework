import java.math.BigInteger;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        // 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
        // BigInteger를 통해서 50번째 항을 구해보자!

        final int START = 0;

        BigInteger[] arr;
        Scanner scan = new Scanner(System.in);
        //arr = new BigInteger[end];
        System.out.print("등비 수열 몇 번째 배수를 구할까요? ? ");

        int end = scan.nextInt();
        arr = new BigInteger[end];

        arr[0] = new BigInteger("1");
        arr[1] = new BigInteger("2");

        for (int i = START; i < end; i++){

            //arr[i] = (int)(Math.pow(2,i));
            arr[i] = (arr[i].add(arr [i])); //Q1과 비슷한 맥락으로 하였는데 여기서 오류가 난 이유를 모르겠습니다
            //arr[i] = (int) (Math.pow(2,i));

            System.out.printf("[%d] 번째 등비수열의 값 = %d\n", i, arr[i]);
        }
    }
}
