import java.math.BigInteger;

public class BigIntegerNum {
    BigInteger number = new BigInteger("45678911234");
    BigInteger numTen = new BigInteger("10");

    BigInteger mantissa = new BigInteger("0");
    int count = 0;
    int length;

    BigInteger copyNumber = number;

    public void compare(){
        while (copyNumber.compareTo(new BigInteger("0")) == 1){

            copyNumber = copyNumber.divide(new BigInteger("10"));

            mantissa = mantissa.add(new BigInteger("1"));
            //count++;
        }

        System.out.println(mantissa);
        //System.out.println(count);

        length = mantissa.intValue();

        inputNum();

    }

    public void inputNum(){
        BigInteger[] arr = new BigInteger[length];

        for(int i = length-1 ; i >= 0; i--){
            arr[i] = number.remainder(numTen);
            number = number.divide(numTen);
        }

        for(int i = 0; i < length; i++){
            System.out.printf("arr[%d]에 들어있는 값은 %d\n",i,arr[i]);
        }
    }

}
