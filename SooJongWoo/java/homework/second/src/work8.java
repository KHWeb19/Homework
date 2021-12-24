public class work8 {
    public static void main(String[] args) {
        // 주사위를 굴려서 홀수가 나오면 손모가지를 내놔라 출력
        int rand = (int)(Math.random() * 6 + 1);

        if (rand % 2 != 0) {
            System.out.println("손모가지를 내놔라");
        }
    }
}