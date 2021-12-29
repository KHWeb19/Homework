import java.math.BigInteger;

public class P06 {
    //45678911234라는 숫자를 BigInteger에 배치
    // 각 자리에 맞는 숫자를 배열에 배치
    public static void main(String[] args) {

        BigInteger num = new BigInteger("45678911234");

        // BigInteger를 int값으로 처리하는 방법을 모르겠습니다. --- BigInteger의 연산방법

        // 1. arr[] = new int[11]
        // 2. 45678911234를 10^(i+1)로 나눈 나머지값으로 arr[i]에 입력 ----- int remain = num % 10^i, arr[i] = remain
        // 3. i값은 10부터 0으로 작아지게함 for(int i = 10; i >= 0 , int--)
        // 4. 최초값에서 10^i * 나머지값을 빼고 다시계산(for) ---- num2 = num, num2 -= remain * 10^i
        // 5. System.out.println(arr[i])로 숫자 뿌려줌;

        // ---------- 몫을 취하는 방식이 훨씬 편함!!

    }
}
