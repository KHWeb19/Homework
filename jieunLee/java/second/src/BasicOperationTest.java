public class BasicOperationTest {
    public static void main(String[] args) {
        int num1 = 7, num2 = 3;

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
        System.out.printf("%d %s %d = %d\n", num1, "%", num2, res);
    }
}
