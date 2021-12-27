public class As2 {
    //1,1,2,3,5,8,13,21,34,55,89,..피보나치 수열의 20번 째 항을 출력
    public static void main(String[] args) {
        int fibo1 = 1;
        int fibo2 = 1;
        int sum = 0;

        final int START = 3;  //final 데이터형의 안에 변수는 무조건 대문자로 적어줘야 한다.
        final int END = 20;

        for (int i = START; i <= END; i++) {
            sum = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 =  sum;


            //3번째 항부터 전체 출력
            //System.out.printf("%d번째의 항: %d\n",i,sum);

            //20번째의 항만 따로 구하기 위해서
            if (i == 20){
                System.out.println("20번째의 항: " + sum);
            }
        }
    }
}


//  1     1     2     3     5     8
//fibo1 fibo2  sum
//      fibo1 fibo2  sum
//            fibo1 fibo2  sum
