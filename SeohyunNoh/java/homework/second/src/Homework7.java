public class Homework7 {
    public static void main(String[] args) {
        int dice2 = (int)(Math.random() * 6 + 1 );

        if (dice2 % 2 == 1) {
            System.out.println("손모가지를 내놔라!");
        }
    }
}
