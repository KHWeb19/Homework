public class P3 {
    /*
     1,1,1,2,3,4,6,9,13,19,28,41,60,88,129 규칙의 25번째 항
     1. 출력값, 1항, 2항, 3항의 변수가 필요함
     2. 1항값 = 1, 2항값 = 1 3항값 = 1
     3. 1항 + 3항 = 출력값
     4. 한항씩 미루어 합산!
     */
    public static void main(String[] args) {
        int res = 0;
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;

        final int COUNT = 25;

        for(int i = 3; i < COUNT; i++) {
            res = num1 + num3;
            num1 = num2;
            num2 = num3;
            num3 = res;
        }
        System.out.println("규칙의 25번째 항 : " + res);
    }
}
