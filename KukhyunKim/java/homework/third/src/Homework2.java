public class Homework2 {
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 ... 일명
        // 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!
        int a = 1;
        int b = 1;
        int c;

        for (int i = 1; i < 20; i++) {
            // System.out.println("i = " + a );
            c = a + b;
            a = b;
            b = c;
            /*
            if (i == 19) {
                System.out.println("20번째 항 =" + a);

            }
            */
        }
        System.out.println("i 20 = " + a);
    }
}
