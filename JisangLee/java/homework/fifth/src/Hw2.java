import java.math.BigInteger;

public class Hw2 {
    public static void main(String[] args) {
        //1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...와 같은 등비 수열이 있다.
        //BigInteger 를 통해서 50번째 항을 구해보자!

        //  1        2       4       8       16 ....바로 전 항의 2배씩 증가한다...2의 i승 으로도 가능하다...
        //arr[0]   arr[1]  arr[2]  arr[3]  arr[4]
        //50번째의 항을 구해야 하니 32번째 항부터 범위를 벗어나므로 int 대신에 BigInteger 를 이용하자.

        final int START = 1;//1부터 시작하므로 START 값을 1로 설정...
        final int END = 50;//50번째의 항을 구하니 END 값을 50으로 설정..

        BigInteger[] sequence;


        sequence = new BigInteger[END];  //  BigInteger 를 선언...

        sequence[0] = new BigInteger("1");
        //sequence[1] = new BigInteger("2");


        for (int i = START; i < END; i++) {
            // BigInteger 는 곱셈을 * 대신에 .multiply 로 해줘야 하고
            // 안에도 BigInteger 정의한 배열값이 들어가야 한다.
            // sequence[1] = BigInteger 값 2 이므로 숫자 2대신에 sequence[1]를 사용
            //sequence[i] = sequence[i - 1].multiply(sequence[1]);
            sequence[i] = sequence[i - 1].multiply(BigInteger.valueOf(2));//숫자 2를 BigInteger 값으로 변환

            if (i == END - 1) {  //배열은 0부터 시작하므로 END 값에 -1을 해준다.
                System.out.printf("arr[%d] = %d\n", i, sequence[i]);
            }
        }
    }
}

