import java.math.BigInteger;
import java.util.Scanner;

public class Date6thAns2 {
    static int START_IDX = 0;
    private BigInteger BASE = new BigInteger("2");
    private int idx;
    static BigInteger[] seq;

    public void initSequence(){
        Scanner scan = new Scanner(System.in);
        idx = scan.nextInt();
        seq = new BigInteger[idx];
    }

    public void process(){
        for (int i = START_IDX + 1; i < idx; i++) {
            seq[i] = seq[i - 1].multiply(BASE);
            System.out.println("seq[" + i + "] = " + seq[i]);
        }
    }


}
