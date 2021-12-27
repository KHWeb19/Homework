public class BasicOperationTest {
    public static void main(String[] args) {
        int num1= 7, num2 =3;

        int res = num1 + num2;
        System.out.printf("%d + %d = %d\n", num1, num2, res);

        res = num1 - num2;
        System.out.printf("%d - %d = %d\n", num1, num2, res);

        res = num1 * num2;
        System.out.printf("%d * %d = %d\n", num1, num2, res);

        res = num1 / num2;
        System.out.printf("%d / %d = %d\n", num1, num2, res);

        res = num1 % num2;
        System.out.printf("%d %c %d = %d\n", num1, 37, num2, res);
        System.out.printf("%d %% %d = %d\n", num1, num2, res);
        // 실제 영문자의 경우 아스키코드로구성되며
        // 아스키코드는 숫자와 1대1로 대응함.

    }
}
