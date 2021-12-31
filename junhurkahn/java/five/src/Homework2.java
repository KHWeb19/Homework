import java.util.Scanner;
import java.math.BigInteger;


public class Homework2 {
    public static void main(String[] args) {
    /*  1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
            BigInteger를 통해서 50번째 항을 구해보자! */

        // 1 일단 MAX = 31 MIN = 2을 지워주자
        // 2 BigInteger를 만들자
        // 3 for조건문을 바꾸자

        //int 정수 for문 증가 지정
        //  BigInteger 정수지정
        final int START = 0;
        final BigInteger BASE = new BigInteger("2");

        System.out.print("찾고자하는 수열의 항을 입력해주세요: ");

        Scanner scan = new Scanner(System.in);
        //scanner 쓴 데이터값 idx에 집어넣기
        int idx = scan.nextInt();

        // idx 배열에 집어넣기
        BigInteger[] seq = new BigInteger[idx];
        seq[START] = new BigInteger("1");

        //for 반목문 생성
        for (int i = START + 1; i < idx; i++) {
            // 배열에다 BASE = 2 ^ i 집어넣기
            seq[i] = seq[i - 1].multiply(BASE);
            // i증감하고 2 ^ i 출력
            System.out.println("seq[" + i + "] = " + seq[i]);
        }
    }
}

