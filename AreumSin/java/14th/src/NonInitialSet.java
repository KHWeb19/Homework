import java.math.BigInteger;

public class NonInitialSet {
    int equalRatio;
    BigInteger bigEqRatio;

    public NonInitialSet(final int equalRatio){
        this.equalRatio = equalRatio;
    }


    public BigInteger getGeoSeqNthOrderData(final int count){

        for(int i = 0; i < count; i++){
            System.out.printf("%d ^ %d = %d\n", equalRatio, i, BigInteger.valueOf(equalRatio).pow(i));
        }
        return BigInteger.valueOf(equalRatio).pow(count -1);

    }
}
