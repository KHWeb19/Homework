public class ForSumTest {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println("1 ~ 100까지의 합산 = 5050 맞니 ? " + sum);
    }
}