public class Homework10 {
    public static void main(String[] args) {
        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;

        for (int i = 1; i <= 100; i++) {
            int random = (int) (Math.random() * range + MIN);
            i += random;
            if (i < 100) {
                System.out.print("이동한 숫자 : " + random);
                System.out.println(", 누적 합 : " + i);
            }
        }
    }
}
