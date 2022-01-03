public class P2 {
    /*
     피보나치 수열의 20번째 항
     1. 출력값, 1항, 2항의 변수가 필요함
     2. 1항값 = 1, 2항값은 = 1
     3. 1항 + 2항 = 출력값
     4. 한항씩 미루어 합산!
     */

    public static void main(String[] args) {
        int res = 0;
        int num1 = 1;
        int num2 = 1;

        final int COUNT = 20;

        for(int i = 2; i < COUNT; i++) {
            res = num1 + num2;
            num1 = num2;
            num2 = res;
            }
        System.out.println("피보나치 20번째 수 : " + res);
    }
}