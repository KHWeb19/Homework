import java.math.BigInteger;
import java.util.Scanner;

/* 문제은행 1-2번
 */
public class equalratioArr {

    final int START_NUM = 1;
    final int MAX = 31;
    final int BIGINTEGER_MAX = 50;
    final int MULTI = 2;

    int[] arr= new int[MAX];

    public void Arr() {
        arr[0] = START_NUM;
        for (int i=1; i<MAX; i++){
            arr[i] = arr[i-1]* MULTI;
            System.out.printf("[%d]항 : %d\n", i, arr[i]);
        }
    }

    public void Input (){
        System.out.println("원하는 항을 입력하세요");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(arr[num]);
    }

    public void Biginteger() {
        BigInteger[] arr2 = new BigInteger[50];
        arr2[0] = new BigInteger("1");

        for (int i=1; i <BIGINTEGER_MAX; i++){
            arr2[i] = arr2[i-1].multiply(BigInteger.valueOf(2));
            System.out.printf("BigInger [%d]항 : %d\n", i, arr[i]);
        }

        // 정수 선언
        BigInteger num1 = new BigInteger("500000000000000");
        BigInteger num2 = new BigInteger("33333333333333");

        BigInteger[] arr3 = new BigInteger[500];
        // 배열 선언



    }
}
