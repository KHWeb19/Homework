import java.math.BigInteger;

import static java.math.BigInteger.ONE;

public class Homework_06 {
    public static void main(String[] args) {
        // 자리수를 직접 값으로 지정해줌.
        // 자리수를 셀 수 값을 정해주지 않고 할 수 있도록 해보자.

        BigInteger number = new BigInteger("45678911234");
        BigInteger numTen = new BigInteger("10");

        BigInteger mantissa = new BigInteger("0");

        // 초기 testNum을 10으로 나눠서 몫이 있는지 검사함
        //BigInteger n = number.divide(new BigInteger("10")); // 45678/10 -> 4567

        BigInteger copyNumber = number;

        // n이 더 크면 결과가 1이 나오고 같으면 0이 나옴
        while (copyNumber.compareTo(new BigInteger("0")) == 1) { // 4567 > 0 참(1) 거짓(0) //-> 근데 10보다 큰거 확인해야하는거 아닐까요..?
                                                                 // 10보다 작은걸 확인하면 마지막 하나를 나누지 않아서.
                                                                 // 일의자리를 10으로 나누면 무조건 0보다작 작을수밖에 없어서.
            copyNumber = copyNumber.divide(new BigInteger("10"));          // 0보다 작아질때까지 10으로 계속 나눔.

            //mantissa = mantissa.add(new BigInteger("0")); // 왜 0이어야할까..? 나눈 숫자를 계속 더하면 안될까..?
            mantissa = mantissa.add(new BigInteger("1")); // mentssa++;으로 바꿔봄.
        }

        //int length = mantissa.intValue();   // 최종 결과에 + 1을 해야함 (초기 10 나눈건 계산 안함)
        System.out.println(mantissa);
        int length = mantissa.intValue();

        BigInteger[] arr = new BigInteger[length];

        //BigInteger result = new BigInteger("0");
        for (int i =0; i < length; i++){
            arr[i] = number.remainder(numTen);
            number = number.divide(numTen);
            System.out.printf("arr[%d]에 들어있는 값은 %d\n",i,arr[i]);
        }


    }
}
