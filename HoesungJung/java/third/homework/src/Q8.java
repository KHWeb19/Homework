public class Q8 {
    public static void main(String[] args) {
int i = (int)(Math.random()*9+2);
        for (int i2 = 1; i2 < 101; i2++) {
            if (i2 % i == 0) {
                System.out.println(i2);
            }
        }
    }
}
