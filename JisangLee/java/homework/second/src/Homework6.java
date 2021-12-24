public class Homework6 {
    //주사위 짝수 = 당첨
    public static void main(String[] args) {
        double rand = Math.random();
        int dice = (int) (Math.random() * 6 + 1);
        if (dice % 2 == 0)
        {
            System.out.println("주사위 = " + dice );
            System.out.println("당첨입니다!");
        }
        else{
            System.out.println("꽝입니다!");
        }
    }
}
