public class Homework2 {
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!

        final int START = 2;
        final int END = 20;

        int num1 = 0;
        int num2 = 1; // 첫번째 항
        int num3 = 0;

        // 20번째 항까지 구해야함으로 항 구하기를 20번 반복 -> for문 이용.
        for(int i = START; i <= END; i++){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            System.out.printf("%d번째 항 : %d\n",i,num3);
        }

    }
}
