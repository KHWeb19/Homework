import java.math.BigDecimal;
import java.math.BigInteger;

public class Q02 {
    public static void main(String[] args) {

        // Q2. 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
        //     BigInteger를 통해서 50번째 항을 구해보자!

        // 데이터, 배열 생성
        // for문 작성. 조건문은 START에서 MAX까지
        // 결과식 세우기
        // 출력


        // START값과 MAX값을 지정해주었습니다.
        final int START = 1;
        final int MAX = 51;

        // 배열을 생성했습니다.
        BigInteger[] BigNum = new BigInteger[MAX];


        // 참고
        // [1] [2] [4] [8] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] arr
        //  0   1   2   3   4   5   6   7   8   9  10  11  12

        BigNum[0] = new BigInteger("1");
        BigNum[1] = new BigInteger("2");
        BigNum[2] = new BigInteger("4");
        BigNum[3] = new BigInteger("8");

        for (int i = START; i < MAX; i++) {

            // 여기 식 세우는 방법을 잘 모르겠습니다.
            // 잘하시는 다른분들이 한걸 참고해도 이해가 어렵네요..
            BigInteger result = BigDecimal.valueOf(Math.pow(2,i)).toBigInteger();
            BigNum[i] = result;
            System.out.println("["+i+"]번째 항" + BigNum[i]);

        }
    }
}