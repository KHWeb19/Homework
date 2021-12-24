public class Seven {
    public static void main(String[] args) {
        int rand1 = (int) (Math.random() * 6 + 1);
        System.out.printf("주사위1 : %d\n", rand1);
        if (rand1 % 2 == 0) {
            System.out.println("당첨입니다!");
        }
    }
}
