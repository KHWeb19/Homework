public class Homework09 {
    public static void main(String[] args) {

        // 문제 은행 [ 2 ]의 3번을 배열화하여 풀어보자!
        // 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        // 이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        // 규칙 = 전전전항 + 전항 = 현재항

        final int MAX = 100;
        final int START = 3;
        final int END = 25;

        int [] num = new int[MAX];

        num[0] = 1;
        num[1] = 1;
        num[2] = 1;

        for (int i = START; i < END; i++){

            num[i] = num[i - 3] + num[i - 1];

        }

        System.out.println("규칙의 25번째 항 : " + num[24]);

    }
}
