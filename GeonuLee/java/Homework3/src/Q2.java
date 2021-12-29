import java.math.BigInteger;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //BigInteger는 문자열 형태로 이루어져있어 무한한 숫자를 다룰수있다
        //1번 문제와 형식은 같지만 BigInteger는 선언하고 이용하는것이 까다롭다
        //Biginteger  + == .add() , - == subtact() , * == mutiply() , / == divide() , % == mod()

        int pick;
        BigInteger[] ARR;
        BigInteger num = new BigInteger("2");

        Scanner sc= new Scanner(System.in);

        System.out.print("수열의 위치를 선택하세요:");
        pick = sc.nextInt();

        ARR = new BigInteger[pick] ;
        ARR[0] = new BigInteger("1");

        for(int i=1; i<pick; i++){
            ARR[i]=ARR[i-1].multiply(num);
        }

        System.out.printf("선택한 수열의 위치 %d의 숫자는:%d", pick, ARR[pick-1]);
    }
}
