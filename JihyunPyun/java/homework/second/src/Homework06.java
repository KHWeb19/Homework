public class Homework06 {
    public static void main(String[] args) {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int result = dice1 + dice2;

        System.out.println("주사위 1번 : " + dice1);
        System.out.println("주사위 2번 : " + dice2);
        System.out.println("주사위 눈금의 합 : " + result);
    }
}
