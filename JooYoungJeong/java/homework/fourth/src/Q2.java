public class Q2 {
    public static void main(String[] args) {

        //피보나치 수열의 20번째 항을 구하라

        int first = 1;
        int second = 1;
        int result = 0, i;

        //컴퓨터 에서는 시작 배열 0이라 반복 시작을 0으로 맞춰줌

        final int START = 2;
        final int END = 20;

        for (i = START; i < END; i++){
            result =first + second;
            first = second;
            second = result;}

        System.out.printf("%d 번째 항 %d\n", i, result);

        /* first, second 범위 설정 result 설정
           컴퓨터 에서는 시작 배열 0이라 반복 시작을 0으로 맞춰줌
            */
        }
    }