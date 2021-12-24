public class Eight {
    public static void main(String[] args) {
        int rand1 = (int) (Math.random() * 6 + 1);
        System.out.printf("주사위1 : %d\n", rand1);
        if (rand1 % 2 == 1) {
            System.out.println("손모가지를 내놔라!");
        }
    }
}
