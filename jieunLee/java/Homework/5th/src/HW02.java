import java.util.Scanner;
import java.math.BigInteger;

public class HW02 {
    public static void main(String[] args) {
        //2. 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
        //   BigInteger를 통해서 50번째 항을 구해보자!

        //1) 입력받기
        //2) 입력받은 항까지의 갯수를 가진 등비수열 만들기
        //   배열의 메모리데이터타입을 BigInteger로 설정
        //   관련된 모든 대상에 BigInteger
        //   덧셈.add()
        //   곱셈.multiply()

        System.out.println("등비 수열의 원하는 항을 입력하시오.");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        final BigInteger MUL = new BigInteger("2");

        BigInteger[] arr = new BigInteger[num];
        arr[0] = new BigInteger("1");
        System.out.printf("arr[0]: %d\n", arr[0]);
        for(int i=1; i<num; i++) {
            arr[i] = arr[i - 1].multiply(MUL);
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
    }
}
