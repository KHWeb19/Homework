import java.math.BigInteger;
import java.util.Arrays;

public class GeometricSequence {

    // 1. 아래와 같은 등비 수열이 있다.
    // 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
    // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
    // (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

    int end , bias , i;
    BigInteger[] seqArr;

    public GeometricSequence(final int end , final int bias) {
        this.end = end;
        this.bias = bias;

        seqArr = new BigInteger[end];
    }

       public BigInteger seqGenerate(){
        for( i = 0; i < end; i++){
            seqArr[i] = BigInteger.valueOf(bias).pow(i);
        }
            return seqArr[i-1];


    }
}
