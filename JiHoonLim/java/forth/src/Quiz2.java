public class Quiz2 {
    public static void main(String[] args) {

        /*
        1. 피보나치 수열은 1항+2항 =3항
        2. for문에서 계속 항의 값을 변경하면서 20항까지 쭉
         */

        int first = 1;
        int second = 1;
        int sum = 0, i;

        final int START = 2;
        final int END = 20;

        for (i = START; i<END ; i++){
            sum = first + second;
            first = second ;
            second = sum ;
        }
        System.out.println(i+ "번째 항은 " +sum);
    }
}

