public class Homework7 {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random() * 6 + 1);
        System.out.println(dice1);

        if(dice1 % 2== 0){
            System.out.println("당첨입니다.") ;
        }
    }
}
