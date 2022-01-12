import java.math.BigInteger;

public class Homework06 {
    public static void main(String[] args) {
//        45678911234라는 숫자를 BigInteger에 배치한다.
//        각 자리수에 맞는 숫자를 배열에 배치하도록 한다.
//        ex) 1234 = 1 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
//        arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1

//        1. 이 숫자가 몇자리인지 알아내자
//        2. 1에서 알아낸 길이만큼 배열을 만들자
//        3. 각 자리에 숫자가 뭐가 들어있는지 알아내자
//        -> 10,100,1000....으로 나눠서 몫을 구하자

        BigInteger bigNum = new BigInteger("45678911234");

        final BigInteger BASE = BigInteger.TEN;//BigInteger는 문자열이라 숫자를 문자로 써야함
        BigInteger mantissa = BigInteger.ZERO;
        BigInteger n = bigNum.divide(BigInteger.TEN);//bigNum을 10으로 나누기

        // 1. 숫자 길이 알아내는 과정
        while(n.compareTo(BigInteger.ZERO) == 1){ //n값과 0값을 비교, n이 더 크면 결과가 1이 나온다. 123.4
            n = n.divide(BigInteger.TEN); // 또 10으로 나눔.
            mantissa = mantissa.add(BigInteger.ONE);
        }
        int length = mantissa.intValue();
        System.out.println(bigNum + "의 길이: " + (length + 1)); // +1 해야하는 이유 : 맨 처음에 10 나눈게 빠져서


        // 2. 숫자 길이만큼 배열 생성
        int[] numArr = new int[length + 1];


        // 3. 배열에 숫자 넣는 과정
        for(int i = length ; i >= 0 ; i--){
            numArr[i] = bigNum.divide(
                    new BigInteger( // BigInteger에 숫자 초기화 방법
                            String.valueOf(BASE.pow(i)))) // 10^i 처리를 이렇게!
                    .mod(BigInteger.TEN) //10 모듈러
                    .intValue(); //int 처리
            System.out.printf("numArr[%d] : %d\n", i, numArr[i]);
        }
        System.out.println("실제 집어넣은 값: " + bigNum);
    }
}
