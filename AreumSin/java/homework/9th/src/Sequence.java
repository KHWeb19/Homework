import java.math.BigInteger;

public class Sequence {
    final BigInteger SEQ = new BigInteger("2");
    final int END = 50;
    final int START_INDEX = 0;

    BigInteger[] seq = new BigInteger[END];

    public void init_seq(){
        seq[START_INDEX] = new BigInteger("1");
    }

    public void seq1(){
        for(int i= START_INDEX+1; i < END; i++){
            seq[i] = seq[i-1].multiply(SEQ);
            System.out.printf("arr[%d] = %d\n", i, seq[i]);
        }
    }
}
