import java.math.BigInteger;

public class Homework02 {
    public static void main(String[] args) {
//       1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
//       BigInteger를 통해서 50번째 항을 구해보자!

        BigInteger[] sequence = new BigInteger[50];
        sequence[0] = new BigInteger("1");
        BigInteger num = new BigInteger("2");

        for (int i = 1; i < 50; i++){
            sequence[i] = sequence[i-1].multiply(num);
        }

        System.out.printf("50번째 항의 값 : %d", sequence[49]);

    }
}
