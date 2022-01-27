import java.math.BigInteger;
import java.util.Scanner;

public class M2 {
    //1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
    //   BigInteger를 통해서 50번째 항을 구해보자!
    // M1와 동일 Biginteger 인용
    public static void main(String[] args) {
        final int START=0;
        Scanner Scan= new Scanner(System.in);
        BigInteger[] array;

        System.out.println("2의 몇 승의 값을 구하고 싶은가?");
        int end= Scan.nextInt();
       array=new BigInteger[end];


        for (int i=START;i< end;i++){
            array[i]= BigInteger.valueOf((int)Math.pow(2,i));
            //제곱 구하는식 Math.pow(밑항,제곱근)
            System.out.print("2의"+i+"의 값은"+array[i]+"이다\n");
        }

    }
}
