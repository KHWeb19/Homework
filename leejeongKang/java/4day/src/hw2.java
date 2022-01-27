import java.util.Scanner;
import java.math.BigInteger;

public class hw2 {
    public static void main(String[] args) {

        final int START = 1;
        final int END = 50;
        int i;
        BigInteger[] arr;
        arr = new BigInteger[50];
        arr[0] = new BigInteger("1");

        for (i=START; i <END; i++){
            arr[i] = arr[i-1].multiply(BigInteger.valueOf(2));
            System.out.printf("%d항 = %d\n", i+1, arr[i]);
        }

        // 정수 선언
        BigInteger num1 = new BigInteger("500000000000000");
        BigInteger num2 = new BigInteger("33333333333333");

        //사칙 연산
        System.out.println("합 "+ num1.add(num2));
        System.out.println("차 "+ num1.subtract(num2));
        System.out.println("곱"+ num1.multiply(num2));
        System.out.println("나누기 "+ num1.divide(num2));


        // 배열 선언
        BigInteger[] arr2 = new BigInteger[500];





    }
}

