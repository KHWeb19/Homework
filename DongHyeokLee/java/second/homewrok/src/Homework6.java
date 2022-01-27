public class Homework6 {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random()*5+1);
        int dice2 = (int)(Math.random()*5+1);
        int sum = dice1 + dice2;

        System.out.println("dice1 = " + dice1);
        System.out.println("dice2 = " + dice2);

        System.out.println("dice1 + dice2 = " + sum);
    }
}
