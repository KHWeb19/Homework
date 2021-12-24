public class Homework7 {
    public static void main(String[] args) {

        // 주사위를 굴려 홀수인 경우 손모가지를 내놔라 출력

        int dice1 = (int) (Math.random() * 6 + 1);

        System.out.println("주사위 = " + dice1);

        if (dice1 % 2 != 0) {
            System.out.println("손모가지를 내놔라");
        }
    }
}
