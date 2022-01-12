import java.math.BigInteger;

public class NonInitialSet {

    int equalRatio;

    public NonInitialSet(final int equalRatio) {
        this.equalRatio = equalRatio;

    }


     /* 등비수열 31항까지 구하는 부분
     public int getNthOrderData(final int count) { //값을 내는 역할
         return (int) (Math.pow(equalRatio, count - 1));
     }*/

    public BigInteger getGeoSeqNthOrderData(final int count) { //값을 내는 역할
        return BigInteger.valueOf(equalRatio).pow(count-1);//equalRatio을 BigInteger로 만든다음 제곱을 해줌
    }
}
