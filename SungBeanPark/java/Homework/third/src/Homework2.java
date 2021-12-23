public class Homework2 {
    public static void main(String[] args) {
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 ...
        //일명 피보나지 수열의 20번째 항을 구하도록 프로그램 해보자
        int num = 1;
        int num2 = 1;

        System.out.println(num);
        System.out.println(num2);

        for (int i = 0; i < 18; i++) {
            int num3 = num + num2;
            num = num2;
            num2 = num3;
            System.out.println(num3);
        }
    }
}
