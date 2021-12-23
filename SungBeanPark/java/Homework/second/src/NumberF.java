public class NumberF {
    public static void main(String[] args) {
        System.out.println("주사위를 굴려서 짝수인 경우 당첨입니다!");
        int dice7 = (int)(Math.random() * 6 + 1);

        if (dice7 % 2 == 0) {
            System.out.println(dice7);
            System.out.println("당첨입니다!");
        }else{
            System.out.println(dice7);
            System.out.println("꽝!");
        }
    }
}
