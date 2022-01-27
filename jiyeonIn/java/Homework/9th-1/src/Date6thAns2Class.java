import java.math.BigInteger;

public class Date6thAns2Class {
    public static void main(String[] args) {
        Date6thAns2 d6 = new Date6thAns2();

        System.out.print("찾고자하는 수열의 항을 입력해주세요: ");
        d6.initSequence();

        Date6thAns2.seq[Date6thAns2.START_IDX] = new BigInteger("1");
        System.out.println("seq[ 0 ] = " +1);
        d6.process();


    }
}
