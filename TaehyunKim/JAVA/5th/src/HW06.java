import java.math.BigInteger;
import java.util.Arrays;

public class HW06 {
    //45678911234라는 숫자를 BigInteger에 배치한다.
    //각 자리수에 맞는 숫자를 배열에 배치하도록 한다.

    public static void main(String[] args) {
        BigInteger someBigInteger = new BigInteger("45678911234");

        String stringConverted = someBigInteger.toString();

        String[] stringArray = stringConverted.split("");

        for (int i =0; i< stringArray.length/2; i++){
            String tmp = stringArray[i];
            int position = stringArray.length -i - 1;
            stringArray[i] = stringArray[position];
            stringArray[position] = tmp;
        }

        System.out.println("배열: " + Arrays.toString(stringArray));

    }
}


