public class work7 {
    public static void main(String[] args) {
        // 주사위를 굴려서 짝수인 경우 당첨입니다! 출력
        int rand = (int)(Math.random() * 6 + 1);

        if (rand % 2 == 0) {
            System.out.println("당첨입니다!");
        }
    }
}
