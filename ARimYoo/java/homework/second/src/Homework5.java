public class Homework5 {
    public static void main(String[] args) {

        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);

        System.out.printf("dice1 = %d , dice2 = %d\n", dice1, dice2);
        System.out.println("dice1 + dice2 = " + (dice1+dice2));

    }
}
