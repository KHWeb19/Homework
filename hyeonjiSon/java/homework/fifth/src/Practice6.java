import java.math.BigInteger;

public class Practice6 {
    public static void main(String[] args) {
        // 문제6.45678911234라는 숫자를 BigInteger에 배치한다.
        //   각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
        //   ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
        //        arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

        //1. BigInteger에 45678911234 라는 숫자를 배치한다.

        BigInteger bigNum = new BigInteger("45678911234");

        int sum = 0;
        boolean defense = false;

        //2. 0~10번까지 존재하는 배열을 만들고, 각각의 배열에 각 자리수의 숫자를 배치하도록 한다.
          //Q. 그냥 배열을 만들면 되는데 굳이 BigInteger를 사용해야하는 이유를 모르겠습니다. 문제 의도가 잘 파악이 되지 않아요.
          //   이미 존재하는 정수 45678911234의 한 자리씩을 자동으로 배치하는 방법이 있나??
                 // → BigInteger까지 쓰면서 동시에 고민하려니 복잡한데 6_1에서 이 방법을 좀 고민해보자...
          //   string으로 형변환을 해야하나?
          //   근데 int > string으로 변환이 안되는 거 아닌가?


    }
}
