public class Homework5 {
    //주사위 2개의 합
    public static void main(String[] args) {
        double rand = Math.random();
        int dice1 = (int)(Math.random() * 6+1);
        int dice2 = (int)(Math.random() * 6+1);
        int dice3 = dice1 + dice2;
        System.out.println("주사위1 = " + dice1);
        System.out.println("주사위2 = " + dice2);
        System.out.println("주사위1 + 주사위2 = " + dice3);
    }
}
