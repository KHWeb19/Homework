import java.math.BigInteger;
import java.util.Scanner;
public class Q2 {



    public static void main(String[] args) {
        final int START = 1;
//Biginteger 선언
        BigInteger[] arr;
        //Scanner 선언
        Scanner sc = new Scanner(System.in);
        //Scanner 만들기
        System.out.println("몇번째 배수?");
        int end = sc.nextInt();

        arr = new BigInteger[end];
        //초항 집어넣기
        arr[0] = new BigInteger("1");
        arr[1] = new BigInteger("2");
        //for문 만들기.
        for (int i = START; i <end; i++){
            arr[i] = arr[(int)(Math.pow(2,i))];
            //결과 값이 Biginteger가 적용이 안되어 나온다..?

            System.out.println("arr[" +i+ "] = "+arr[i]);
        }
    }
}

