public class Hw6 {
    public static void main(String[] args) {
        int dice = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);

        System.out.println("주사위1 = " + dice);
        System.out.println("주사위2 = " + dice2);
        System.out.println("주사위의 합 =" + (dice+dice2));
    }
}
