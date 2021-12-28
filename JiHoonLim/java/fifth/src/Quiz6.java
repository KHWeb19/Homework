import java.math.BigInteger;

public class Quiz6 {
    public static void main(String[] args) {
        /*
        1. 45678911234 선언
        2. 배열에 1의 자리부터 삽입
        3. 뒤에는 10^i 로 처리 앞부분이 문제
        질문
        각 자릿수를 표현해야하는데 어떻게 해야할지 감이 안잡힙니다.
        밑에는 이것저것 써보다가 안풀려서 그냥 냅뒀습니다.
         */

        BigInteger VAL = new BigInteger("45678911234");
        int end = 11;

        BigInteger[] arr = new BigInteger[end];
        BigInteger res = VAL.divide(new BigInteger("10"));

        for (int i = 0; i < 11; i++){
            BigInteger TEN = new BigInteger("10^i");
            arr[i] = res.multiply(TEN);
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
