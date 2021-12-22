public class eleven {
    public static void main(String[] args) {
        int ran = (int)(Math.random() * 58 + 65);
        if (65 <= ran) {
            if (ran <= 90) {
                System.out.println(ran);
            }
        }
        if (97 <= ran) {
            if (ran <= 122) {
                System.out.println(ran);
            }
        }
    }
}
