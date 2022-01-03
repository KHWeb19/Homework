import java.math.BigInteger;

public class Hw6 {
    public static void main(String[] args) {
        //45678911234라는 숫자를 BigInteger 에 배치한다.
        //각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        //ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
        //arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

        //   4            5           6        7           8          9        1          1          2            3         4
        // arr[10]     arr[9]     arr[8]   arr[7]      arr[6]     arr[5]      arr[4]    arr[3]     arr[2]      arr[1]     arr[0]
        //4 x 10^10   5 x 10^9   6 x 10^8   7 x 10^7   8 x 10^6   9 x 10^5   1 x 10^4  1 x 10^3   2 x 10^2    3 x 10^1   4 x 10^0
        //이런 식으로 배치하면 되는 거군..
        //배열이 총 11개가 필요하고
        //for 문을 이용하여 10 ~ 0 까지 i-- 하면 되는건가?

        final int START = 10;//배열 10번지부터 숫자가 시작하므로 START 값을 10으로 설정...
        final int END = 0;// 배열 0번지 값이 마지막이니 END 값을 0으로 설정

        BigInteger sequence ;

        sequence = new BigInteger("45678911234"); //BigInteger 에 45678911234 배치..

        for(int i = START; i  >= END; i--){
            //숫자에 규칙이 없는데 어떻게 정의해야하나...
            sequence[i] = 4*(int)Math.pow(10,i);   //arr[i] = 4 x 10^i승
            sequence[i-1] = 5*(int)Math.pow(10,i-1); //arr[i-1] = 5 x 10^(i-1)승

        }





    }


}
