public class third2 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 1;

        for (int i = 3; i <= 20; i++) {
            int result = num1 + num2;
            System.out.printf("%d항 : %d\n", i, result);

            num1 = num2;
            num2 = result;
        }

    }
}