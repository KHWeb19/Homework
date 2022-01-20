import java.math.BigInteger;

public class Homework06 {
    public static void main(String[] args) {

        // 45678911234라는 숫자를 BigInteger에 배치한다.
        // 각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        // ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
        //     arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1


        // 규칙을 이용해서 풀었다..

        int end = 11;
        BigInteger[] num = new BigInteger[end];

        num[0] = new BigInteger("4");
        num[5] = new BigInteger("9");
        num[4] = new BigInteger("1");

        // 5부터 11까지는 4부터 1씩 증가
        // 3부터 0까지는 9부터 1씩 감소


        for (int i = 0; i < end; i++) {

            if (i >= 1 && i <= 3) {

                num[i] = num[i-1].subtract(num[4]);

            } else if (i >= 6) {

                num[i] = num[i-1].subtract(num[4]);
            }

            System.out.printf("num[%d] 자리에 들어갈 수 : %d\n", i, num[i]);


            // 왜 int end의 값을 10으로 설정하고  증감에 i <= end를 하면 오류가 뜰까?
        }
    }
}
