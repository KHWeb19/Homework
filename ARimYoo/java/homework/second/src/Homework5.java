public class Homework5 {
    public static void main(String[] args) {

        //주사위 2개를 굴린 눈금의 합

        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);

        System.out.printf("dice1 = %d , dice2 = %d\n", dice1, dice2);
        System.out.println("dice1 + dice2 = " + (dice1+dice2));

    }
}
