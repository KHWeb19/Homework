public class Q7번문제 {
    public static void main(String[] args) {
        // 7. 주사위를 굴려서 짝수인 경우 당첨입니다! 출력

        int dice1 = (int)(Math.random() * 6 + 1);
        if(dice1 % 2 ==0) {
            System.out.println("당첨입니다!");
        }
    }
}
