import java.util.Scanner;
public class HW1 {
    public static void main(String[] args) {
        //등비수열
        //1.등비수열의 식을 알아내자 ...
           //1-1. 내가 생각한 식
        //  1    2      4     8      16
        //  a1  a1x2   a2x2   a3x2
        //        a2    a3    a4
        //n항에  x2를 한다

           //1-2 다른 식
        //2의 제곱으로 구함 .. Math.pow사용

        //2. 사용자 입력을 하기 위해서 scanner를 사용

        //1-2식 사용해서 하기

        final int START_IDX =0; //시작점
        final int BASE=2;       //제곱되는 수

        System.out.print("찾고자 하는 수열의 항을 입력해주세요:");

        Scanner scan = new Scanner(System.in);
        int put = scan.nextInt();              //입력을 위해서 넣어주는 scanner

        int [] seq = new int [put];            //put까지의 배열을 seq라는 변수의 배열에 넣어준다

        for (int i=START_IDX; i < put; i++ ){
            //2^0=1(1항) 2^1=2(2항) 2^2=4(3항)

            seq[i]= (int)(Math.pow(BASE,i));   // 제곱의 값을 seq의 배열에 넣는다

            System.out.printf("seq[%d]=%d\n",i,seq[i]);
                                              //seq[i]는 0부터 시작이라 n항을 구하면 seq[n-1]이 출력된다

        }










    }
}
