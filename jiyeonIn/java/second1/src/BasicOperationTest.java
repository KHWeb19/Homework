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

        // 실제 영문자의 경우 아스키코드로 구성되며
        // 이 아스키코드는 숫자와 1대1로 대응된다.
        // 37이라는 아스키코드는 문자 %에 대응되므로
        // %c라는 문자를 출력하는 format(형식)을 배치하고
        // 37을 배치하여 %를 출력하도록 만들었다.
    }
}