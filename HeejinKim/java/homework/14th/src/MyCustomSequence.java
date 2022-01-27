import java.math.BigInteger;

public class MyCustomSequence {

    InitialSet is;
    NonInitialSet nis;

    public MyCustomSequence(final int[]arr,int bias){
        is= new InitialSet(arr,bias);
    }

    public MyCustomSequence (final int[] arr, int bias, int jumping) {
        is = new InitialSet(arr, bias, jumping);
    }

    public MyCustomSequence(final int equalRatio){
        nis = new NonInitialSet(equalRatio);
    }

    /*등비수열 31항까지 구하는 부분
    public int getNthOrderData(int count){      // NonInitialSet 클래스에서 값을 가져오는 역할
        return nis.getNthOrderData(count);
    }*/

    public BigInteger getGeoSeqNthOrderData(int count){      // NonInitialSet 클래스에서 값을 가져오는 역할
        return nis.getGeoSeqNthOrderData(count);
    }







}
