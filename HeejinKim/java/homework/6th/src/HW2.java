
import java.math.BigInteger;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        //BigInteger 사용
        //1.BigInteger로 int 변수들 바꿔주고
        //2.식 계산법 알아보기

        final int START_IDX = 0;
        final BigInteger BASE = new BigInteger("2");    //BigInteger로 변환해줌(val)


        System.out.print("찾고자 하는 수열의 항을 입력해주세요:");

        Scanner scan = new Scanner(System.in);
        int put = scan.nextInt();

        BigInteger[] seq = new BigInteger[put];
        seq[START_IDX] = new BigInteger("1");

        for (int i = START_IDX +1 ; i <put ; i++) {


            //seq[i] = (int) (Math.pow(BASE, i));   BigInteger에서는 이 식을 쓰기 어려우므로 원래 내가 썼던 식으로 대체
            seq[i]=seq[i - 1].multiply(BigInteger.valueOf(2)); //이렇게 2를 직접적으로 넣어주면 BigInteger.valueOf(2)을 써야함.
                                                             //만약 BASE를 사용한다면 BASE를 BigInteger로 변환 시켜줌

            System.out.println("seq["+ i +"]="+ seq[i] );

        }
    }
}
