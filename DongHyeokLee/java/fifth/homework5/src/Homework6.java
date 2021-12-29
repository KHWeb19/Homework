import java.math.BigInteger;

public class Homework6 {
    public static void main(String[] args) {
        //45678911234라는 숫자를 BigInteger에 배치한다.
        //각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        // ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
       // arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

       // 숫자를 어떻게 분해할까나아아아 그냥 노가다 문제인가... 아닌가 그것이 문제로다
        // 숫자 구조 분해를 코딩으로 할 수 있는가??
        // 4 x 10^0, 3 x 10^1 , 2 x 10^2 , 1x 10^3 , 1x 10^4, 9 x 10^5 , 8 x 10^6, 7 x 10^7 , 6 x 10^8 , 5 x 10^9 , 4 x 10^10

        final int START = 0;
        final int END = 11;

        //BigInteger num = new BigInteger("45678911234")
        BigInteger num = new BigInteger("0");
        BigInteger[] arr = new BigInteger[END];
        BigInteger sum;



        arr[0] = new BigInteger("4");
        arr[1] = new BigInteger("3");
        arr[2] = new BigInteger("2");
        arr[3] = new BigInteger("1");
        arr[4] = new BigInteger("1");
        arr[5] = new BigInteger("9");
        arr[6] = new BigInteger("8");
        arr[7] = new BigInteger("7");
        arr[8] = new BigInteger("6");
        arr[9] = new BigInteger("5");
        arr[10] = new BigInteger("4");


        /* arr[0]= 4;
        arr[1]= 3;
        arr[2]= 2;
        arr[3]= 1;
        arr[4]= 1;
        arr[5]= 9;
        arr[6]= 8;
        arr[7]= 7;
        arr[8]= 6;
        arr[9]= 5;
        arr[10]=4;*/
        //끝??

        for(int i = START; i < END ; i++){
            BigInteger ten = new BigInteger("Math.pow(10,i)");//오 이게되네?? 안 되네... doulbe 형에서 형변환이.. 실패!
            sum  = arr[i].multiply(ten);  // 근데 Math.pow 는 double 타입 멘붕 , arr 타입 변경
           //sum = arr[i].multiply(BigInteger.valueOf(Math.pow(10,i));

             num = num.add(sum);  // BigInteger 연산하는 값도 BigInteger 타입
        }

        System.out.println(num);



    }
}
