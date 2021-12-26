public class Homework6 {
    public static void main(String[] args) {

        // 주사위를 굴려 짝수인 경우 당첨입니다 출력

        int dice1 = (int) (Math.random() * 6 + 1);

        System.out.println("주사위 = " + dice1);

        if (dice1 % 2 == 0) {
            System.out.println("당첨입니다!");
        }
    }
}