import java.math.BigInteger;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        /* 문제 3. 배열로 로또 문제를 만들어보기!
           실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
           실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
           배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.
         */

        /*
        1. for문으로 범위 변수지정(100개의 인덱스는 데이터양이 클거같으므로 BigInteger사용)
        2. 배열의 베이스가될 인덱스에 엘리먼트 지정(5개의 인덱스를 당첨으로 지정)
           0 24 49 74 99 를 당첨 인덱스로 지정
        3. 지정된 인덱스 제외하고 나머지 인덱스는 꽝으로 지정
        4. 1,2,3이 마친 값중 스캔가능하게 조정
        5. 스캔값 출력
         */

        final int START = 0;

        BigInteger[] sequence;

        Scanner scan = new Scanner(System.in);

        System.out.print("누가 당첨이 됬을까요? ");
        scan.nextInt();

        int end = 100;

        boolean isRandomAllocCheck = false;

        sequence = new BigInteger[end];

        sequence[0] = new BigInteger("당첨");
        sequence[24] = new BigInteger("당첨");
        sequence[49] = new BigInteger("당첨");
        sequence[74] = new BigInteger("당첨");
        sequence[99] = new BigInteger("당첨");

        for (int i = START; i < end; i++) {
           while(!isRandomAllocCheck){
/* 불린으로 지정된 인덱스가 나오면 당첨
   그외 인덱스들은 꽝으로 만들고싶은데 어떻게 코드를 짜야하지..
*/
           }
        }
    }
}
