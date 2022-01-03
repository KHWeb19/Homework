public class Q2 {
    public static void main(String[] args) {
        //2. 2. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자

        int first = 1;
        int second = 1;
        int result = 0, i;

        final int START = 2;

        for (i = START; i < 20; i++) {
            result = first + second;
            first = second;
            second = result;

        }
    }
}
