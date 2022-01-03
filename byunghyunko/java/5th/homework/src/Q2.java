import java.math.BigInteger;
public class Q2 {
    public static void main(String[] args) {
        //문제2. 1번 문제에서 32번째 항이 21억 정도가 나올 것이다.
         //BigInteger를 통해서 50번째 항을 구해보자!

        //Q. 앞선 코드작성을 완성하지 못해 32번쨰 항을 구하지 못했으나
        // 작성했던 것을 토대로 BigInteger 변환해봤습니다.

        final int MAX = 31; //
        final int START = 0;
        final  BigInteger BASE = new BigInteger("2"); // 1번문제 int를 BigInteger로 표현

        Scanner sc = new Scanner(System.in); // 원하는 값을 뽑아내도록 스캐너작성

        System.out.print("등비 수열의 원하는 값을 뽑아내보자 ");

        int end = sc.nextInt();

        BigInteger[] sequence = new BigInteger[end];

        if(end > MAX){
            System.out.println("표현이 되지 않는다");
        } else{
            for(int i = START; i<end; i++) {
                sequence[i] = (int) Math.pow(BASE,i); // 지수를 표현하는 방법을 몰라서 못풀었습니다ㅠ
                System.out.printf("sequence[%d] = %d\n", i, sequence[i]);
            }
        }
    }
}

