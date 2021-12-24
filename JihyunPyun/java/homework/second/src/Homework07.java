public class Homework07 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        System.out.println("주사위 : " + num);
        if(num % 2 == 0) {
            System.out.println("당첨입니다!");
        }
    }
}
