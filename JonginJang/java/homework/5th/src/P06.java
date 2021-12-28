import java.math.BigInteger;

public class P06 {
    public static void main(String[] args) {
 /*6. 45678911234라는 숫자를 BigInteger에 배치한다.
      각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
      ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
      arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1
 */
        //BigInteger 참고 주소 : https://howbeautifulworld.tistory.com/33
        //400억 가량 , 10^0부터 10^10까지 -> 배열의 크기는 10
        //456 7891 1234 -> 4321 1987 654 순으로 배열에 들어감
        //인덱스에 원하는 값을 넣기 위한 계산 예시
        // 456... 중 5를 구하고자 할때 전체 수를 10^9로 나누고 나온 결과 값-> 10^1나머지연산자 -> 5
        BigInteger originNum = new BigInteger("45678911234");

        BigInteger ten1 = new BigInteger("10");
        //계산 방법
        // BigInteger fsqten = ten1.pow(10); //10^10 -> 10^1
        //System.out.println(originNum + " / " + fsqten + " = " + (originNum.divide(fsqten)));
        //System.out.println((originNum.divide(fsqten)+" % 10 = " + (originNum.divide(fsqten)).remainder(ten1)));
        BigInteger result1 = new BigInteger("1");
        BigInteger result2 = new BigInteger("1");
        final int START = 0;
        final int END = 11;
        BigInteger[] sequence = new BigInteger[END];

        System.out.println("계산 과정 출력");
        for(int i=END;i>START;i--){
            System.out.println("------------------------------------------------------------");
            BigInteger sqten = ten1.pow(i-1); //10^10 -> 10^1
            result1 = originNum.divide(sqten);
            System.out.println(result1);
            result2 = result1.remainder(ten1);
            System.out.println(result2);
            sequence[i-1] = result2;
            System.out.println("------------------------------------------------------------");

        }
        System.out.println("originNum = " + originNum);
        for(int i = START ; i<END;i++){
            System.out.print("sequence["+i+"]의 값은 " + sequence[i]+" \n ");
        }

    }
}
