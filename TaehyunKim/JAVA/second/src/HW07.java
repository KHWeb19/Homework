public class HW07 {
    public static void main(String[] args) {
        // 7. 주사위 굴려서 짝수인경우 당첨입니다! 출력

        System.out.println("\n7. 주사위 굴려서 짝수인경우 당첨입니다! 출력");

        int a = (int) (Math.random() * 6 +1);

        if (a%2 == 0) {
            System.out.println("당첨입니다!");
        }
        else{
            System.out.println("꽝입니다");
        }
    }
}
