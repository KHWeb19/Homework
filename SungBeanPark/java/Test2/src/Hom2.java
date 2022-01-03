public class Hom2 {
    public static void main(String[] args) {
        //2. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!
        //규칙 n번째 + n+1번째 = n+2번째항
        //n번째항이 n+1항으로, n+1항이 n+2항으로, n+2번쨰

        int first = 1;
        int second = 1;
        int third = 0, i;
        final int START = 2;
        final int END = 20;

        for(i = START; i < END; i++){
            third = first + second;
            first = second;
            second = third;
            System.out.printf("%d번째 항 %d\n", i, third);
        }
        System.out.printf("%d번째 항 %d\n", i, third);
    }

}
