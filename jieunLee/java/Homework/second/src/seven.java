public class seven {
    public static void main(String[] args) {
        int dice = (int)(Math.random() * 6 + 1);
        if (dice % 2 == 0) {
            System.out.println("당첨입니다!");
        }
    }
}
