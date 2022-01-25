public class Bank3ClassTest {
    public static void main(String[] args) {
        final int MAX = 6;
        final int MIN = 1;

        int range = MAX - MIN + 1;
        int rand = (int)(Math.random() * range + MIN);

        System.out.println(rand);
    }

}
