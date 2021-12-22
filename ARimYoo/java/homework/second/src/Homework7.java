public class Homework7 {
    public static void main(String[] args) {

        int dice1 = (int) (Math.random() * 6 + 1);

        System.out.println("주사위 = " + dice1);

        if (dice1 % 2 != 0) {
            System.out.println("손모가지를 내놔라");
        }
    }
}
