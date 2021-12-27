public class Homework3 {
    public static void main(String[] args) {
        // 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129 ....
        // 이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!
        int num = 1;
        int num2 = 1;
        int num3 = 1;
        int tmp = 1;
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);

        for (int i = 0; i < 22; i++) {
            num3 = num + num2;
            num = tmp;
            tmp = num2;
            num2 = num3;
            System.out.println(num3);
        }
    }
}